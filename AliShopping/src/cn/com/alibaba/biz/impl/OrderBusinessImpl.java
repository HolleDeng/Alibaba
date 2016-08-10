package cn.com.alibaba.biz.impl;

import java.util.List;

import cn.com.alibaba.web.model.Orders;

/**
 * 订单管理实现类 OrderBusinessImpl
 * @author hadoop
 *
 */
public class OrderBusinessImpl {
	
	public OrderBusinessImpl() {

	}
	
	/**
	 * 根据订单 Pojo， 下此订单.
	 */
	public void checkOut(Orders  Pojo) {

	}

	/**
	 * 根据订单 ID 删除相应的订单
	 */
	public void deleteOrderById(Long log) {

	}

	/**
	 * 取得全部的订单
	 */
	public List findAllOrders() {
		List list = null;
		
		return list;
	}

	/**
	 * 根据订单 ID 获得相应订单
	 * 
	 */
	Orders getOrderById(Long log) {
		
		return null;
		
	}

	/**
	 * 根据用户 ID 取得相应的订单 List
	 * 参数：String
	 * 返回：List: 用户 ID 的订单List
	 */
	List getOrderListByUserName(String str) {
		List list=null;
		
		return list;
	}

	/**
	 * 根据订单 Pojo 删除相应的订单
	 * 参数：Orders
	 * 返回：void
	 */
	public void deleteOrder(Orders Pojo) {
		
	}

	
}
