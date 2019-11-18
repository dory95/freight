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

import com.bootdo.freight.domain.WaybillInfoDO;
import com.bootdo.freight.service.WaybillInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 车主运单表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
 
@Controller
@RequestMapping("/freight/waybillInfo")
public class WaybillInfoController {
	@Autowired
	private WaybillInfoService waybillInfoService;
	
	@GetMapping()
	@RequiresPermissions("freight:waybillInfo:waybillInfo")
	String WaybillInfo(){
	    return "freight/waybillInfo/waybillInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("freight:waybillInfo:waybillInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WaybillInfoDO> waybillInfoList = waybillInfoService.list(query);
		int total = waybillInfoService.count(query);
		PageUtils pageUtils = new PageUtils(waybillInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("freight:waybillInfo:add")
	String add(){
	    return "freight/waybillInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("freight:waybillInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		WaybillInfoDO waybillInfo = waybillInfoService.get(id);
		model.addAttribute("waybillInfo", waybillInfo);
	    return "freight/waybillInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("freight:waybillInfo:add")
	public R save( WaybillInfoDO waybillInfo){
		if(waybillInfoService.save(waybillInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("freight:waybillInfo:edit")
	public R update( WaybillInfoDO waybillInfo){
		waybillInfoService.update(waybillInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("freight:waybillInfo:remove")
	public R remove( Long id){
		if(waybillInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("freight:waybillInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		waybillInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
