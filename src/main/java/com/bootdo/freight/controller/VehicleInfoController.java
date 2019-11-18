package com.bootdo.freight.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.freight.domain.VehicleInfoDO;
import com.bootdo.freight.service.VehicleInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 车辆信息表，参与货运的车辆信息
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
 
@Controller
@RequestMapping("/freight/vehicleInfo")
public class VehicleInfoController {
	@Autowired
	private VehicleInfoService vehicleInfoService;
	
	@GetMapping()
	@RequiresPermissions("freight:vehicleInfo:vehicleInfo")
	String VehicleInfo(){
	    return "freight/vehicleInfo/vehicleInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("freight:vehicleInfo:vehicleInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<VehicleInfoDO> vehicleInfoList = vehicleInfoService.list(query);
		int total = vehicleInfoService.count(query);
		PageUtils pageUtils = new PageUtils(vehicleInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("freight:vehicleInfo:add")
	String add(){
	    return "freight/vehicleInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("freight:vehicleInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		VehicleInfoDO vehicleInfo = vehicleInfoService.get(id);
		model.addAttribute("vehicleInfo", vehicleInfo);
	    return "freight/vehicleInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("freight:vehicleInfo:add")
	public R save( VehicleInfoDO vehicleInfo){
		if(vehicleInfoService.save(vehicleInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("freight:vehicleInfo:edit")
	public R update( VehicleInfoDO vehicleInfo){
		vehicleInfoService.update(vehicleInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("freight:vehicleInfo:remove")
	public R remove( Long id){
		if(vehicleInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("freight:vehicleInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		vehicleInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
