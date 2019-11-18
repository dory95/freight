package com.bootdo.freight.service;

import com.bootdo.freight.domain.WaybillInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 车主运单表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
public interface WaybillInfoService {
	
	WaybillInfoDO get(Long id);
	
	List<WaybillInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WaybillInfoDO waybillInfo);
	
	int update(WaybillInfoDO waybillInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
