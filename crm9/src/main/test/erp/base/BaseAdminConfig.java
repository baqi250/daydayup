package com.erpsnow.erp;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminConfig<M extends BaseAdminConfig<M>> extends Model<M> implements IBean {

	public void setSettingId(java.lang.Integer settingId) {
		set("setting_id", settingId);
	}
	
	public java.lang.Integer getSettingId() {
		return getInt("setting_id");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setValue(java.lang.String value) {
		set("value", value);
	}
	
	public java.lang.String getValue() {
		return getStr("value");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

}
