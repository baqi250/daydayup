package com.erpsnow.erp;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAdminRecord<M extends BaseAdminRecord<M>> extends Model<M> implements IBean {

	public void setRecordId(java.lang.Integer recordId) {
		set("record_id", recordId);
	}
	
	public java.lang.Integer getRecordId() {
		return getInt("record_id");
	}

	public void setTypes(java.lang.String types) {
		set("types", types);
	}
	
	public java.lang.String getTypes() {
		return getStr("types");
	}

	public void setTypesId(java.lang.Integer typesId) {
		set("types_id", typesId);
	}
	
	public java.lang.Integer getTypesId() {
		return getInt("types_id");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setCategory(java.lang.String category) {
		set("category", category);
	}
	
	public java.lang.String getCategory() {
		return getStr("category");
	}

	public void setNextTime(java.util.Date nextTime) {
		set("next_time", nextTime);
	}
	
	public java.util.Date getNextTime() {
		return get("next_time");
	}

	public void setBusinessIds(java.lang.String businessIds) {
		set("business_ids", businessIds);
	}
	
	public java.lang.String getBusinessIds() {
		return getStr("business_ids");
	}

	public void setContactsIds(java.lang.String contactsIds) {
		set("contacts_ids", contactsIds);
	}
	
	public java.lang.String getContactsIds() {
		return getStr("contacts_ids");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setCreateUserId(java.lang.Integer createUserId) {
		set("create_user_id", createUserId);
	}
	
	public java.lang.Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public void setBatchId(java.lang.String batchId) {
		set("batch_id", batchId);
	}
	
	public java.lang.String getBatchId() {
		return getStr("batch_id");
	}

}
