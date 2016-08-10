package cn.com.alibaba.dao.factory;

import cn.com.alibaba.dao.impl.CategoryDAOImpl;
import cn.com.alibaba.dao.impl.OrderLineDAOImpl;
import cn.com.alibaba.dao.impl.OrderStatusDAOImpl;
import cn.com.alibaba.dao.impl.OrdersDAOImpl;
import cn.com.alibaba.dao.impl.PayWayDAOImpl;
import cn.com.alibaba.dao.impl.ProductDAOImpl;
import cn.com.alibaba.dao.impl.UserDAOImpl;

public class DAOFactory {
	
	public static CategoryDAOImpl getCategoryDAOImpl() throws Exception {
		return new CategoryDAOImpl();
	}
	
	public static OrderLineDAOImpl getOrderLineDAOImpl() throws Exception {
		return new OrderLineDAOImpl();
	}
	
	public static OrdersDAOImpl getOrdersDAOImpl() throws Exception {
		return new OrdersDAOImpl();
	}
	
	public static OrderStatusDAOImpl getOrderStatusDAOImpl() throws Exception {
		return new OrderStatusDAOImpl();
	}
	
	public static PayWayDAOImpl getPayWayDAOImpl() throws Exception {
		return new PayWayDAOImpl();
	}
	
	public static ProductDAOImpl getProductDAOImpl() throws Exception {
		return new ProductDAOImpl();
	}
	
	public static UserDAOImpl getUserDAOImpl() throws Exception {
		return new UserDAOImpl();
	}
	
	
	
}
