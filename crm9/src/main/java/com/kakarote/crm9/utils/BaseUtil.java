package com.kakarote.crm9.utils;

import cn.hutool.core.date.DateUtil;
import com.jfinal.kit.PropKit;
import com.jfinal.log.Log;
import com.kakarote.crm9.common.config.JfinalConfig;
import com.kakarote.crm9.common.config.redis.Redis;
import com.kakarote.crm9.common.config.redis.RedisManager;
import com.kakarote.crm9.erp.admin.entity.AdminUser;
import com.jfinal.kit.Prop;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.util.Date;

public class BaseUtil {

    private static ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();

    private static final String USER_ADMIN_TOKEN = "72CRM_USER_ADMIN_TOKEN";

    private static final String USER_MOBILE_TOKEN = "72CRM_USER_MOBILE_TOKEN";

    /**
     *
     * 获取当前系统是开发开始正式
     * @return true代表为真
     */
    public static boolean isDevelop() {
        return JfinalConfig.prop.getBoolean("jfinal.devMode",Boolean.TRUE);
    }

    /**
     * 获取当前是否是windows系统
     * @return true代表为真
     */
    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }

    /**
     * 签名数据
     *
     * @param key  key
     * @param salt 盐
     * @return 加密后的字符串
     */
    public static String sign(String key, String salt) {
        return DigestUtils.md5Hex((key + "erp" + salt).getBytes());
    }

    /**
     * 验证签名是否正确
     *
     * @param key  key
     * @param salt 盐
     * @param sign 签名
     * @return 是否正确 true为正确
     */
    public static boolean verify(String key, String salt, String sign) {
        return sign.equals(sign(key, salt));
    }

    /**
     * 获取当前年月的字符串
     *
     * @return yyyyMMdd
     */
    public static String getDate() {
        return DateUtil.format(new Date(), "yyyyMMdd");
    }

    //FIXME 如果获取的地址不正确,直接返回一个固定地址也可以
    public static String getIpAddress() {
        Prop prop = PropKit.use("config/undertow.txt");
        try {
            if (isDevelop()) {
                return "http://" + InetAddress.getLocalHost().getHostAddress() + ":" + prop.get("undertow.port", "8080") + "/";
            }
        } catch (Exception e) {
            Log.getLog(BaseUtil.class).error("",e);
        }
        HttpServletRequest request=getRequest();
        String proxy=request.getHeader("proxy_url")!=null?"/"+request.getHeader("proxy_url"):"";
        return "http://" + request.getServerName()+":"+ request.getServerPort()+ request.getContextPath()+proxy+"/";
    }

    public static String getLoginAddress(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip.contains(",")) {
            return ip.split(",")[0];
        } else {
            return ip;
        }
    }

    public static String getLoginAddress() {
        return getLoginAddress(getRequest());
    }

    public static void setRequest(HttpServletRequest request) {
        threadLocal.set(request);
    }

    public static HttpServletRequest getRequest() {
        return threadLocal.get();
    }

    public static AdminUser getUser() {
        return RedisManager.getRedis().get(getToken());
    }

    public static Long getUserId(){
        return getUser().getUserId();
    }

    public static void removeThreadLocal(){
        threadLocal.remove();
    }

    public static String getToken(){
        return getToken(getRequest());
    }

    public static String getToken(HttpServletRequest request){
        return request.getHeader("Admin-Token") != null ? request.getHeader("Admin-Token") : "";
    }

    public static void userExit(Long userId,Integer type){
        Redis redis = RedisManager.getRedis();
        if(type==null||type==1){
            if(redis.exists(USER_ADMIN_TOKEN+userId)){
                String token=redis.get(USER_ADMIN_TOKEN+userId);
                redis.del(USER_ADMIN_TOKEN+userId);
                redis.del(token);
            }
        }
        if(type==null||type==2){
            if(redis.exists(USER_MOBILE_TOKEN+userId)){
                String token=redis.get(USER_MOBILE_TOKEN+userId);
                redis.del(USER_MOBILE_TOKEN+userId);
                redis.del(token);
            }
        }
    }
    public static void setToken(Long userId,String token,Integer type){
        userExit(userId,type);
        Redis redis = RedisManager.getRedis();
        if(redis.exists(token)){
            if(type==1){
                redis.setex(USER_ADMIN_TOKEN+userId,redis.ttl(token).intValue(),token);
            }else if(type==2){
                redis.setex(USER_MOBILE_TOKEN+userId,redis.ttl(token).intValue(),token);
            }
        }

    }
    public static void userExpire(String token){
        Redis redis = RedisManager.getRedis();
        if(redis.exists(token)){
            redis.expire(token,3600);
            redis.expire(USER_ADMIN_TOKEN+getUserId(),3600);
            redis.expire(USER_MOBILE_TOKEN+getUserId(),3600);
        }
    }

}
