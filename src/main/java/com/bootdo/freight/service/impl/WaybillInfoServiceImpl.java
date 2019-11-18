package com.bootdo.freight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.freight.dao.WaybillInfoDao;
import com.bootdo.freight.domain.WaybillInfoDO;
import com.bootdo.freight.service.WaybillInfoService;



@Service
public class WaybillInfoServiceImpl implements WaybillInfoService {
	@Autowired
	private WaybillInfoDao waybillInfoDao;
	
	@Override
	public WaybillInfoDO get(Long id){
		return waybillInfoDao.get(id);
	}
	
	@Override
	public List<WaybillInfoDO> list(Map<String, Object> map){
		return waybillInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return waybillInfoDao.count(map);
	}
	
	@Override
	public int save(WaybillInfoDO waybillInfo){
		return waybillInfoDao.save(waybillInfo);
	}
	
	@Override
	public int update(WaybillInfoDO waybillInfo){
		return waybillInfoDao.update(waybillInfo);
	}
	
	@Override
	public int remove(Long id){
		return waybillInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return waybillInfoDao.batchRemove(ids);
	}
	
}
