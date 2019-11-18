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

import com.bootdo.freight.domain.CargoInfoDO;
import com.bootdo.freight.service.CargoInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 货品表，描述货品类别规格及单价
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
 
@Controller
@RequestMapping("/freight/cargoInfo")
public class CargoInfoController {
	@Autowired
	private CargoInfoService cargoInfoService;
	
	@GetMapping()
	@RequiresPermissions("freight:cargoInfo:cargoInfo")
	String CargoInfo(){
	    return "freight/cargoInfo/cargoInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("freight:cargoInfo:cargoInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CargoInfoDO> cargoInfoList = cargoInfoService.list(query);
		int total = cargoInfoService.count(query);
		PageUtils pageUtils = new PageUtils(cargoInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("freight:cargoInfo:add")
	String add(){
	    return "freight/cargoInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("freight:cargoInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		CargoInfoDO cargoInfo = cargoInfoService.get(id);
		model.addAttribute("cargoInfo", cargoInfo);
	    return "freight/cargoInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("freight:cargoInfo:add")
	public R save( CargoInfoDO cargoInfo){
		if(cargoInfoService.save(cargoInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("freight:cargoInfo:edit")
	public R update( CargoInfoDO cargoInfo){
		cargoInfoService.update(cargoInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("freight:cargoInfo:remove")
	public R remove( Long id){
		if(cargoInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("freight:cargoInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		cargoInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
