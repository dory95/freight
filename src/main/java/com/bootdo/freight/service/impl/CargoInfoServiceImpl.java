package com.bootdo.freight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.freight.dao.CargoInfoDao;
import com.bootdo.freight.domain.CargoInfoDO;
import com.bootdo.freight.service.CargoInfoService;



@Service
public class CargoInfoServiceImpl implements CargoInfoService {
	@Autowired
	private CargoInfoDao cargoInfoDao;
	
	@Override
	public CargoInfoDO get(Long id){
		return cargoInfoDao.get(id);
	}
	
	@Override
	public List<CargoInfoDO> list(Map<String, Object> map){
		return cargoInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return cargoInfoDao.count(map);
	}
	
	@Override
	public int save(CargoInfoDO cargoInfo){
		return cargoInfoDao.save(cargoInfo);
	}
	
	@Override
	public int update(CargoInfoDO cargoInfo){
		return cargoInfoDao.update(cargoInfo);
	}
	
	@Override
	public int remove(Long id){
		return cargoInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return cargoInfoDao.batchRemove(ids);
	}
	
}
