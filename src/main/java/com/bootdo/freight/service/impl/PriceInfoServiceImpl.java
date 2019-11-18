package com.bootdo.freight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.freight.dao.PriceInfoDao;
import com.bootdo.freight.domain.PriceInfoDO;
import com.bootdo.freight.service.PriceInfoService;



@Service
public class PriceInfoServiceImpl implements PriceInfoService {
	@Autowired
	private PriceInfoDao priceInfoDao;
	
	@Override
	public PriceInfoDO get(Long id){
		return priceInfoDao.get(id);
	}
	
	@Override
	public List<PriceInfoDO> list(Map<String, Object> map){
		return priceInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return priceInfoDao.count(map);
	}
	
	@Override
	public int save(PriceInfoDO priceInfo){
		return priceInfoDao.save(priceInfo);
	}
	
	@Override
	public int update(PriceInfoDO priceInfo){
		return priceInfoDao.update(priceInfo);
	}
	
	@Override
	public int remove(Long id){
		return priceInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return priceInfoDao.batchRemove(ids);
	}
	
}
