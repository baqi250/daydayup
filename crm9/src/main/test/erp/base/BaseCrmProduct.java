package com.erpsnow.erp;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCrmProduct<M extends BaseCrmProduct<M>> extends Model<M> implements IBean {

	public void setProductId(java.lang.Integer productId) {
		set("product_id", productId);
	}
	
	public java.lang.Integer getProductId() {
		return getInt("product_id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setNum(java.lang.String num) {
		set("num", num);
	}
	
	public java.lang.String getNum() {
		return getStr("num");
	}

	public void setUnit(java.lang.String unit) {
		set("unit", unit);
	}
	
	public java.lang.String getUnit() {
		return getStr("unit");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCategoryId(java.lang.Integer categoryId) {
		set("category_id", categoryId);
	}
	
	public java.lang.Integer getCategoryId() {
		return getInt("category_id");
	}

	public void setDescription(java.lang.String description) {
		set("description", description);
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

	public void setCreateUserId(java.lang.Integer createUserId) {
		set("create_user_id", createUserId);
	}
	
	public java.lang.Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public void setOwnerUserId(java.lang.Integer ownerUserId) {
		set("owner_user_id", ownerUserId);
	}
	
	public java.lang.Integer getOwnerUserId() {
		return getInt("owner_user_id");
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

	public void setBatchId(java.lang.String batchId) {
		set("batch_id", batchId);
	}
	
	public java.lang.String getBatchId() {
		return getStr("batch_id");
	}

}