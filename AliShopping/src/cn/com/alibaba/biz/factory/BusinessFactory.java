package cn.com.alibaba.biz.factory;

import cn.com.alibaba.biz.impl.CategoryBusinessImpl;
import cn.com.alibaba.biz.impl.OrderBusinessImpl;
import cn.com.alibaba.biz.impl.OrderStatusBusinessImp;
import cn.com.alibaba.biz.impl.PayWayBusinessImpl;
import cn.com.alibaba.biz.impl.ProductBusinessImp;
import cn.com.alibaba.biz.impl.ShoppingCart;
import cn.com.alibaba.biz.impl.UserBusinessImpl;

public class BusinessFactory {
	
	// IOrderBusiness;
	public static CategoryBusinessImpl getCategoryBusinessImpl() throws Exception {
		return new CategoryBusinessImpl();
	}
	
	public static OrderBusinessImpl getOrderBusinessImpl() throws Exception {
		return new OrderBusinessImpl();
	}
	
	public static OrderStatusBusinessImp getOrderStatusBusinessImp() throws Exception {
		return new OrderStatusBusinessImp();
	}
	
	public static PayWayBusinessImpl getPayWayBusinessImpl() throws Exception {
		return new PayWayBusinessImpl();
	}
	
	
	public static ProductBusinessImp getProductBusinessImp() throws Exception {
		return new ProductBusinessImp();
	}
	
	public static ShoppingCart getShoppingCart() throws Exception {
		return new ShoppingCart();
	}
	
	public static UserBusinessImpl getUserBusinessImpl() throws Exception {
		return new UserBusinessImpl();
	}
	
}
