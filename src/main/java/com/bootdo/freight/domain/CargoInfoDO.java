package com.bootdo.freight.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 货品表，描述货品类别规格及单价
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public class CargoInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//自增id
	private Long id;
	//货物品名
	private String category;
	//货物规格
	private String specification;
	//客户价格
	private BigDecimal priceCustomer;
	//车主价格
	private BigDecimal priceDriver;
	//其他价格，用于报税等其他用途
	private BigDecimal priceOther;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;

	/**
	 * 设置：自增id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：自增id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：货物品名
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * 获取：货物品名
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * 设置：货物规格
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	/**
	 * 获取：货物规格
	 */
	public String getSpecification() {
		return specification;
	}
	/**
	 * 设置：客户价格
	 */
	public void setPriceCustomer(BigDecimal priceCustomer) {
		this.priceCustomer = priceCustomer;
	}
	/**
	 * 获取：客户价格
	 */
	public BigDecimal getPriceCustomer() {
		return priceCustomer;
	}
	/**
	 * 设置：车主价格
	 */
	public void setPriceDriver(BigDecimal priceDriver) {
		this.priceDriver = priceDriver;
	}
	/**
	 * 获取：车主价格
	 */
	public BigDecimal getPriceDriver() {
		return priceDriver;
	}
	/**
	 * 设置：其他价格，用于报税等其他用途
	 */
	public void setPriceOther(BigDecimal priceOther) {
		this.priceOther = priceOther;
	}
	/**
	 * 获取：其他价格，用于报税等其他用途
	 */
	public BigDecimal getPriceOther() {
		return priceOther;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
