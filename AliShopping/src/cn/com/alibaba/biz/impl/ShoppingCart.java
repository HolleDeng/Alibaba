package cn.com.alibaba.biz.impl;

import cn.com.alibaba.web.model.OrderLine;
import cn.com.alibaba.web.model.Orders;
import cn.com.alibaba.web.model.Product;

/**
 * ShoppingCart 购物车管理实现类
 */
public class ShoppingCart {
	
	public ShoppingCart() {

	}
	/**
	 * 参数：OrderLine
	 * 返回：void
	 */
	void addOrdeLine(OrderLine orderLine) {
		
	}
	
	/**
	 * Gets the orders
	 * @return
	 */
	public Orders getOrders() {
		Orders orders = null;
		
		return orders;
	}

	/**
	 * Sets the orders
	 * @param orders
	 */
	public void setOrders(Orders orders) {

	}

	/**
	 * 向购物车中增加一个商品
	 * @param product
	 * @param x
	 */
	public void addProduct(Product product,int x) {

	}

	/**
	 * 根据商品 ID 在购物车
	 * @param orderLine
	 */
	public void removeProductById(OrderLine orderLine) {
		
	}
	
	/**
	 * 删除购物车中所有的商品
	 * @param log
	 */
	public void removeAllProducts(Long log) {

	}

	/**
	 * Checks if is empty
	 * @return
	 */
	boolean isEmpty() {
		boolean flag = false;
		
		return flag;
	}

	/**
	 * 根据商品 ID，修改购物车中此商品的数量
	 * @param log
	 * @param x
	 */
	public void  modifyProductAmountById(Long log ,int x) {
		
	}

	/**
	 * 获得购物车中商品金额的合计
	 * @return
	 */
	public double getTotalPrice() {
		double all = 0;
		return all;
		
	}

	
	public double getTotalPriceTemp() {
		return 0;
		
	}

	/**
	 * 从购物车中获取订单列表
	 * @param log
	 * @return
	 */
	public OrderLine findProduct(Long log) {
		OrderLine orderLine = null;
		return orderLine;
	}

	public void setUndoID(String str) {

	}
}
