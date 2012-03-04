package com.github.hakobera.apibench.action;

import java.util.List;

import javax.annotation.Resource;

import net.arnx.jsonic.JSON;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

import com.github.hakobera.apibench.entity.Order;
import com.github.hakobera.apibench.service.OrderService;

public class OrdersAction {
	
	@Resource
	protected OrderService orderService;

	public String id;
	
    @Execute(validator = false)
	public String index() {
    	List<Order> orders = orderService.findAll();
    	ResponseUtil.write(JSON.encode(orders), "application/json");
    	return null;
	}

    @Execute(validator = false, urlPattern = "{id}")
	public String show() {
    	Order order = orderService.findById(Long.valueOf(id));
    	ResponseUtil.write(JSON.encode(order), "application/json");
    	return null;
	}
	
}
