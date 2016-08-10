package cn.com.alibaba.web.model;

public class OrderLine {

	/**
	 * orderline_id integer auto_increment /pk 订单项 id 
	 * orders_id integer not null 订单 id 
	 * product_id integer not null 商品 id 
	 * amount numeric(20,2 not null 商品数量
	 */
	
	private int orderline_id;
	private int orders_id;
	private int product_id;
	private double amount;
	public int getOrderline_id() {
		return orderline_id;
	}
	public void setOrderline_id(int orderline_id) {
		this.orderline_id = orderline_id;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
