package com.bootdo.freight.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public class PriceInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//自增id
	private Long id;
	//客户id
	private Long customerId;
	//货品id
	private Long cargoId;
	//客户价格（元/吨）
	private BigDecimal customerPrice;
	//车主价格（元/吨）
	private BigDecimal driverPrice;
	//单放客户价格（元/吨）
	private BigDecimal dCustomerPrice;
	//单放车主价格（元/吨）
	private BigDecimal dDriverPrice;
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
	 * 设置：客户id
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	/**
	 * 获取：客户id
	 */
	public Long getCustomerId() {
		return customerId;
	}
	/**
	 * 设置：货品id
	 */
	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}
	/**
	 * 获取：货品id
	 */
	public Long getCargoId() {
		return cargoId;
	}
	/**
	 * 设置：客户价格（元/吨）
	 */
	public void setCustomerPrice(BigDecimal customerPrice) {
		this.customerPrice = customerPrice;
	}
	/**
	 * 获取：客户价格（元/吨）
	 */
	public BigDecimal getCustomerPrice() {
		return customerPrice;
	}
	/**
	 * 设置：车主价格（元/吨）
	 */
	public void setDriverPrice(BigDecimal driverPrice) {
		this.driverPrice = driverPrice;
	}
	/**
	 * 获取：车主价格（元/吨）
	 */
	public BigDecimal getDriverPrice() {
		return driverPrice;
	}
	/**
	 * 设置：单放客户价格（元/吨）
	 */
	public void setDCustomerPrice(BigDecimal dCustomerPrice) {
		this.dCustomerPrice = dCustomerPrice;
	}
	/**
	 * 获取：单放客户价格（元/吨）
	 */
	public BigDecimal getDCustomerPrice() {
		return dCustomerPrice;
	}
	/**
	 * 设置：单放车主价格（元/吨）
	 */
	public void setDDriverPrice(BigDecimal dDriverPrice) {
		this.dDriverPrice = dDriverPrice;
	}
	/**
	 * 获取：单放车主价格（元/吨）
	 */
	public BigDecimal getDDriverPrice() {
		return dDriverPrice;
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
