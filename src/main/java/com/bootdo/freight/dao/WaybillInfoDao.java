package com.bootdo.freight.dao;

import com.bootdo.freight.domain.WaybillInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 车主运单表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
@Mapper
public interface WaybillInfoDao {

	WaybillInfoDO get(Long id);
	
	List<WaybillInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WaybillInfoDO waybillInfo);
	
	int update(WaybillInfoDO waybillInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
