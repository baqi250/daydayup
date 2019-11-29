package com.erpsnow.erp;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOaExamineRecord<M extends BaseOaExamineRecord<M>> extends Model<M> implements IBean {

	public void setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
	}
	
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
	}

	public void setExamineId(java.lang.Integer examineId) {
		set("examine_id", examineId);
	}
	
	public java.lang.Integer getExamineId() {
		return getInt("examine_id");
	}

	public void setExamineStepId(java.lang.Long examineStepId) {
		set("examine_step_id", examineStepId);
	}
	
	public java.lang.Long getExamineStepId() {
		return getLong("examine_step_id");
	}

	public void setExamineStatus(java.lang.Integer examineStatus) {
		set("examine_status", examineStatus);
	}
	
	public java.lang.Integer getExamineStatus() {
		return getInt("examine_status");
	}

	public void setCreateUser(java.lang.Long createUser) {
		set("create_user", createUser);
	}
	
	public java.lang.Long getCreateUser() {
		return getLong("create_user");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}
	
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

}
