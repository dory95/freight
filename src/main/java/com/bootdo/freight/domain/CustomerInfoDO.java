package com.bootdo.freight.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 客户基本信息表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public class CustomerInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//自增id
	private Long id;
	//客户名称，比如公司名
	private String name;
	//包车价格(客户)
	private BigDecimal customerBaochePrice;
	//包车价格(车主)
	private BigDecimal driverBaochePrice;
	//联系电话
	private String mobile;
	//联系地址
	private String address;
	//备注
	private String remark;
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
	 * 设置：客户名称，比如公司名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：客户名称，比如公司名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：包车价格(客户)
	 */
	public void setCustomerBaochePrice(BigDecimal customerBaochePrice) {
		this.customerBaochePrice = customerBaochePrice;
	}
	/**
	 * 获取：包车价格(客户)
	 */
	public BigDecimal getCustomerBaochePrice() {
		return customerBaochePrice;
	}
	/**
	 * 设置：包车价格(车主)
	 */
	public void setDriverBaochePrice(BigDecimal driverBaochePrice) {
		this.driverBaochePrice = driverBaochePrice;
	}
	/**
	 * 获取：包车价格(车主)
	 */
	public BigDecimal getDriverBaochePrice() {
		return driverBaochePrice;
	}
	/**
	 * 设置：联系电话
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 获取：联系电话
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 设置：联系地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：联系地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
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
