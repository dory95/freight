package com.bootdo.freight.service;

import com.bootdo.freight.domain.VehicleInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 车辆信息表，参与货运的车辆信息
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public interface VehicleInfoService {
	
	VehicleInfoDO get(Long id);
	
	List<VehicleInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VehicleInfoDO vehicleInfo);
	
	int update(VehicleInfoDO vehicleInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
