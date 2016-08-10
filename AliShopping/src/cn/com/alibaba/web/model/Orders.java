package cn.com.alibaba.web.model;

public class Orders {
	/**
	 * orders_id integer auto_increment /pk 订单 id 
	 * username varchar(20) not null  真实姓名(收货人) 
	 * payway_id integer 付款方式 id 
	 * orderstatus_id integer / 订单状态 id 
	 * name varchar(20) / 订单名称（用户名-日期）
	 * cost numeric(15,3) not null 订单金额
	 */
	private int orders_id;
	private String   username;
	private int payway_id;
	private int orderstatus_id;
	private String name;
	private double cost;
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPayway_id() {
		return payway_id;
	}
	public void setPayway_id(int payway_id) {
		this.payway_id = payway_id;
	}
	public int getOrderstatus_id() {
		return orderstatus_id;
	}
	public void setOrderstatus_id(int orderstatus_id) {
		this.orderstatus_id = orderstatus_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
}
