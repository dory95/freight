package com.bootdo.freight.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 车辆信息表，参与货运的车辆信息
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public class VehicleInfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//自增id
	private Long id;
	//车牌号
	private String vehicleNo;
	//所属系统部门(sys_dept#dept_id)
	private Long sysDeptId;
	//车主姓名
	private String driverName;
	//联系电话
	private String mobile;
	//车辆类型（0 小车、1 大车、2 中车）
	private Integer vehicleType;
	//所关联的系统登录用户(sys_user#user_id)
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
	 * 设置：所属系统部门(sys_dept#dept_id)
	 */
	public void setSysDeptId(Long sysDeptId) {
		this.sysDeptId = sysDeptId;
	}
	/**
	 * 获取：所属系统部门(sys_dept#dept_id)
	 */
	public Long getSysDeptId() {
		return sysDeptId;
	}
	/**
	 * 设置：车主姓名
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	/**
	 * 获取：车主姓名
	 */
	public String getDriverName() {
		return driverName;
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
	 * 设置：车辆类型（0 小车、1 大车、2 中车）
	 */
	public void setVehicleType(Integer vehicleType) {
		this.vehicleType = vehicleType;
	}
	/**
	 * 获取：车辆类型（0 小车、1 大车、2 中车）
	 */
	public Integer getVehicleType() {
		return vehicleType;
	}
	/**
	 * 设置：所关联的系统登录用户(sys_user#user_id)
	 */
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}
	/**
	 * 获取：所关联的系统登录用户(sys_user#user_id)
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
