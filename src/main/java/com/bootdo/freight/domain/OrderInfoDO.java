package com.bootdo.freight.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 客户订单表，一般一批货物一个订单
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public class OrderInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//自增id
	private Long id;
	//客户id(customer_info#id)
	private Long customerId;
	//货品id(cargo_info#id)
	private Long cargoId;
	//运单id
	private Long waybillId;
	//订单类型（0 普通，1 包车，2 单放）
	private Integer orderType;
	//重量(单位：吨)
	private BigDecimal weight;
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
	 * 设置：客户id(customer_info#id)
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	/**
	 * 获取：客户id(customer_info#id)
	 */
	public Long getCustomerId() {
		return customerId;
	}
	/**
	 * 设置：货品id(cargo_info#id)
	 */
	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}
	/**
	 * 获取：货品id(cargo_info#id)
	 */
	public Long getCargoId() {
		return cargoId;
	}
	/**
	 * 设置：运单id
	 */
	public void setWaybillId(Long waybillId) {
		this.waybillId = waybillId;
	}
	/**
	 * 获取：运单id
	 */
	public Long getWaybillId() {
		return waybillId;
	}
	/**
	 * 设置：订单类型（0 普通，1 包车，2 单放）
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	/**
	 * 获取：订单类型（0 普通，1 包车，2 单放）
	 */
	public Integer getOrderType() {
		return orderType;
	}
	/**
	 * 设置：重量(单位：吨)
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	/**
	 * 获取：重量(单位：吨)
	 */
	public BigDecimal getWeight() {
		return weight;
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
