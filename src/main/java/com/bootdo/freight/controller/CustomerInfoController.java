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

import com.bootdo.freight.domain.CustomerInfoDO;
import com.bootdo.freight.service.CustomerInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 客户基本信息表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
 
@Controller
@RequestMapping("/freight/customerInfo")
public class CustomerInfoController {
	@Autowired
	private CustomerInfoService customerInfoService;
	
	@GetMapping()
	@RequiresPermissions("freight:customerInfo:customerInfo")
	String CustomerInfo(){
	    return "freight/customerInfo/customerInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("freight:customerInfo:customerInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CustomerInfoDO> customerInfoList = customerInfoService.list(query);
		int total = customerInfoService.count(query);
		PageUtils pageUtils = new PageUtils(customerInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("freight:customerInfo:add")
	String add(){
	    return "freight/customerInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("freight:customerInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		CustomerInfoDO customerInfo = customerInfoService.get(id);
		model.addAttribute("customerInfo", customerInfo);
	    return "freight/customerInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("freight:customerInfo:add")
	public R save( CustomerInfoDO customerInfo){
		if(customerInfoService.save(customerInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("freight:customerInfo:edit")
	public R update( CustomerInfoDO customerInfo){
		customerInfoService.update(customerInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("freight:customerInfo:remove")
	public R remove( Long id){
		if(customerInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("freight:customerInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		customerInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
