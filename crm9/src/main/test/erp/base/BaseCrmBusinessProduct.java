package com.erpsnow.erp;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCrmBusinessProduct<M extends BaseCrmBusinessProduct<M>> extends Model<M> implements IBean {

	public void setRId(java.lang.Integer rId) {
		set("r_id", rId);
	}
	
	public java.lang.Integer getRId() {
		return getInt("r_id");
	}

	public void setBusinessId(java.lang.Integer businessId) {
		set("business_id", businessId);
	}
	
	public java.lang.Integer getBusinessId() {
		return getInt("business_id");
	}

	public void setProductId(java.lang.Integer productId) {
		set("product_id", productId);
	}
	
	public java.lang.Integer getProductId() {
		return getInt("product_id");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public void setSalesPrice(java.math.BigDecimal salesPrice) {
		set("sales_price", salesPrice);
	}
	
	public java.math.BigDecimal getSalesPrice() {
		return get("sales_price");
	}

	public void setNum(java.lang.Integer num) {
		set("num", num);
	}
	
	public java.lang.Integer getNum() {
		return getInt("num");
	}

	public void setDiscount(java.math.BigDecimal discount) {
		set("discount", discount);
	}
	
	public java.math.BigDecimal getDiscount() {
		return get("discount");
	}

	public void setSubtotal(java.math.BigDecimal subtotal) {
		set("subtotal", subtotal);
	}
	
	public java.math.BigDecimal getSubtotal() {
		return get("subtotal");
	}

	public void setUnit(java.lang.String unit) {
		set("unit", unit);
	}
	
	public java.lang.String getUnit() {
		return getStr("unit");
	}

}
