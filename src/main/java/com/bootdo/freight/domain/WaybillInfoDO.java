package com.bootdo.freight.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 车主运单表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public class WaybillInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//自增id
	private Long id;
	//车牌号
	private String vehicleNo;
	//运单日期(默认当天)
	private Date waybillDate;
	//关联系统用户(sys_user#id)
	private Long sysUserId;
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
	 * 设置：车牌号
	 */
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	/**
	 * 获取：车牌号
	 */
	public String getVehicleNo() {
		return vehicleNo;
	}
	/**
	 * 设置：运单日期(默认当天)
	 */
	public void setWaybillDate(Date waybillDate) {
		this.waybillDate = waybillDate;
	}
	/**
	 * 获取：运单日期(默认当天)
	 */
	public Date getWaybillDate() {
		return waybillDate;
	}
	/**
	 * 设置：关联系统用户(sys_user#id)
	 */
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}
	/**
	 * 获取：关联系统用户(sys_user#id)
	 */
	public Long getSysUserId() {
		return sysUserId;
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
