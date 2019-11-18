package com.bootdo.freight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.freight.dao.VehicleInfoDao;
import com.bootdo.freight.domain.VehicleInfoDO;
import com.bootdo.freight.service.VehicleInfoService;



@Service
public class VehicleInfoServiceImpl implements VehicleInfoService {
	@Autowired
	private VehicleInfoDao vehicleInfoDao;
	
	@Override
	public VehicleInfoDO get(Long id){
		return vehicleInfoDao.get(id);
	}
	
	@Override
	public List<VehicleInfoDO> list(Map<String, Object> map){
		return vehicleInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return vehicleInfoDao.count(map);
	}
	
	@Override
	public int save(VehicleInfoDO vehicleInfo){
		return vehicleInfoDao.save(vehicleInfo);
	}
	
	@Override
	public int update(VehicleInfoDO vehicleInfo){
		return vehicleInfoDao.update(vehicleInfo);
	}
	
	@Override
	public int remove(Long id){
		return vehicleInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return vehicleInfoDao.batchRemove(ids);
	}
	
}
