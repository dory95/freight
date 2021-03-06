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

import com.bootdo.freight.domain.OrderInfoDO;
import com.bootdo.freight.service.OrderInfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 客户订单表，一般一批货物一个订单
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-11-18 21:06:10
 */
 
@Controller
@RequestMapping("/freight/orderInfo")
public class OrderInfoController {
	@Autowired
	private OrderInfoService orderInfoService;
	
	@GetMapping()
	@RequiresPermissions("freight:orderInfo:orderInfo")
	String OrderInfo(){
	    return "freight/orderInfo/orderInfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("freight:orderInfo:orderInfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OrderInfoDO> orderInfoList = orderInfoService.list(query);
		int total = orderInfoService.count(query);
		PageUtils pageUtils = new PageUtils(orderInfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("freight:orderInfo:add")
	String add(){
	    return "freight/orderInfo/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("freight:orderInfo:edit")
	String edit(@PathVariable("id") Long id,Model model){
		OrderInfoDO orderInfo = orderInfoService.get(id);
		model.addAttribute("orderInfo", orderInfo);
	    return "freight/orderInfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("freight:orderInfo:add")
	public R save( OrderInfoDO orderInfo){
		if(orderInfoService.save(orderInfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("freight:orderInfo:edit")
	public R update( OrderInfoDO orderInfo){
		orderInfoService.update(orderInfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("freight:orderInfo:remove")
	public R remove( Long id){
		if(orderInfoService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("freight:orderInfo:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		orderInfoService.batchRemove(ids);
		return R.ok();
	}
	
}
