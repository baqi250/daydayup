package com.erpsnow.erp;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminSceneDefault<M extends BaseAdminSceneDefault<M>> extends Model<M> implements IBean {

	public void setDefaultId(java.lang.Integer defaultId) {
		set("default_id", defaultId);
	}
	
	public java.lang.Integer getDefaultId() {
		return getInt("default_id");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setSceneId(java.lang.Integer sceneId) {
		set("scene_id", sceneId);
	}
	
	public java.lang.Integer getSceneId() {
		return getInt("scene_id");
	}

}
