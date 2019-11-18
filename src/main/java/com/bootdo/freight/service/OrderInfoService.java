package com.bootdo.freight.service;

import com.bootdo.freight.domain.OrderInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 客户订单表，一般一批货物一个订单
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public interface OrderInfoService {
	
	OrderInfoDO get(Long id);
	
	List<OrderInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderInfoDO orderInfo);
	
	int update(OrderInfoDO orderInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
