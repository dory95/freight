package com.bootdo.freight.dao;

import com.bootdo.freight.domain.PriceInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
@Mapper
public interface PriceInfoDao {

	PriceInfoDO get(Long id);
	
	List<PriceInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PriceInfoDO priceInfo);
	
	int update(PriceInfoDO priceInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
