package com.bootdo.freight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.freight.dao.OrderInfoDao;
import com.bootdo.freight.domain.OrderInfoDO;
import com.bootdo.freight.service.OrderInfoService;



@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	@Autowired
	private OrderInfoDao orderInfoDao;
	
	@Override
	public OrderInfoDO get(Long id){
		return orderInfoDao.get(id);
	}
	
	@Override
	public List<OrderInfoDO> list(Map<String, Object> map){
		return orderInfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderInfoDao.count(map);
	}
	
	@Override
	public int save(OrderInfoDO orderInfo){
		return orderInfoDao.save(orderInfo);
	}
	
	@Override
	public int update(OrderInfoDO orderInfo){
		return orderInfoDao.update(orderInfo);
	}
	
	@Override
	public int remove(Long id){
		return orderInfoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return orderInfoDao.batchRemove(ids);
	}
	
}
