package com.bootdo.freight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.freight.dao.CustomerInfoDao;
import com.bootdo.freight.domain.CustomerInfoDO;
import com.bootdo.freight.service.CustomerInfoService;



@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
	@Autowired
	private CustomerInfoDao customerInfoDao;
	
	@Override
	public CustomerInfoDO get(Long id){
		return customerInfoDao.get(id);
	}
	
	@Override
	public List<CustomerInfoDO> list(Map<String, Object> map){
		return customerInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return customerInfoDao.count(map);
	}
	
	@Override
	public int save(CustomerInfoDO customerInfo){
		return customerInfoDao.save(customerInfo);
	}
	
	@Override
	public int update(CustomerInfoDO customerInfo){
		return customerInfoDao.update(customerInfo);
	}
	
	@Override
	public int remove(Long id){
		return customerInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return customerInfoDao.batchRemove(ids);
	}
	
}
