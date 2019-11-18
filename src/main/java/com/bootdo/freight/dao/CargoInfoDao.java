package com.bootdo.freight.dao;

import com.bootdo.freight.domain.CargoInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 货品表，描述货品类别规格及单价
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
@Mapper
public interface CargoInfoDao {

	CargoInfoDO get(Long id);
	
	List<CargoInfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CargoInfoDO cargoInfo);
	
	int update(CargoInfoDO cargoInfo);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
