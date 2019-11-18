package com.bootdo.freight.service;

import com.bootdo.freight.domain.PriceInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public interface PriceInfoService {
	
	PriceInfoDO get(Long id);
	
	List<PriceInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PriceInfoDO priceInfo);
	
	int update(PriceInfoDO priceInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
