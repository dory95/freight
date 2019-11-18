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

import com.bootdo.freight.domain.PriceInfoDO;
import com.bootdo.freight.service.PriceInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
 
@Controller
@RequestMapping("/freight/priceInfo")
public class PriceInfoController {
	@Autowired
	private PriceInfoService priceInfoService;
	
	@GetMapping()
	@RequiresPermissions("freight:priceInfo:priceInfo")
	String PriceInfo(){
	    return "freight/priceInfo/priceInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("freight:priceInfo:priceInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PriceInfoDO> priceInfoList = priceInfoService.list(query);
		int total = priceInfoService.count(query);
		PageUtils pageUtils = new PageUtils(priceInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("freight:priceInfo:add")
	String add(){
	    return "freight/priceInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("freight:priceInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		PriceInfoDO priceInfo = priceInfoService.get(id);
		model.addAttribute("priceInfo", priceInfo);
	    return "freight/priceInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("freight:priceInfo:add")
	public R save( PriceInfoDO priceInfo){
		if(priceInfoService.save(priceInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("freight:priceInfo:edit")
	public R update( PriceInfoDO priceInfo){
		priceInfoService.update(priceInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("freight:priceInfo:remove")
	public R remove( Long id){
		if(priceInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("freight:priceInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		priceInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
