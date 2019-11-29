package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCrmActionRecord<M extends BaseCrmActionRecord<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return getInt("id");
	}

	public M setCreateUserId(Integer createUserId) {
		set("create_user_id", createUserId);
		return (M)this;
	}

	public Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setTypes(String types) {
		set("types", types);
		return (M)this;
	}

	public String getTypes() {
		return getStr("types");
	}

	public M setActionId(Integer userId) {
		set("action_id", userId);
		return (M)this;
	}

	public Integer getActionId() {
		return getInt("action_id");
	}

	public M setContent(String content) {
		set("content", content);
		return (M)this;
	}

	public String getContent() {
		return getStr("content");
	}

}
