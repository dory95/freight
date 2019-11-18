package com.bootdo.freight.dao;

import com.bootdo.freight.domain.CustomerInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 客户基本信息表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
@Mapper
public interface CustomerInfoDao {

	CustomerInfoDO get(Long id);
	
	List<CustomerInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomerInfoDO customerInfo);
	
	int update(CustomerInfoDO customerInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
