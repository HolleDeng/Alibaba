package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.OrderStatus;

/**
 * OrderStatusDAOImpl 提供订单状态相关数据库
 * 
 * @author hadoop
 * 
 */
public class OrderStatusDAOImpl {
	String DESCRIPTION;
	String NAME;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据
	 * 
	 * @param orderStatus
	 */
	public void delete(OrderStatus orderStatus) {

	}
	
	/**
	 * 查找全部的订单状态
	 * @return
	 */
	public List findAllOrderStatus() {
		List list=null;
		return list;
	}

	/**
	 * 通过描述进行查找
	 * @param object
	 * @return
	 */
	public List  findByDescription(Object object) {
		List list=null;
		return list;
	}

	/**
	 * 根据范例 Pojo 取得数据库中的相应数据.
	 * @param orderStatus
	 * @return
	 */
	public List  findByExample(OrderStatus orderStatus) {
		List list=null;
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据.
	 * @param lg
	 * @return
	 */
	public OrderStatus findById(Long lg) {
		OrderStatus orderStatus = null;
		return orderStatus;
	}
	
	/**
	 * 通过名字进行查找
	 * @param obj
	 * @return
	 */
	public List findByName(Object obj) {
		List list=null;
		return list;
	}
	
	/**
	 * 根据 Pojo 的属性名和Pojo 属性的值在数据库中取得相应数据.
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str,Object obj ) {
		List list=null;
		return list;
	}

	/**
	 * 把游离的 Pojo 再次变成持久化的 Pojo
	 * @param orderStatus
	 */
	public void lock(OrderStatus orderStatus) {
		
	}

	/**
	 * 把尚未持久化的 Pojo登录至数据库
	 * @param orderStatus
	 */
	public void save(OrderStatus orderStatus) {

	}
	
	/**
	 * 合并游离的 Pojo， 使游离的 Pojo 再次变成持久化的 Pojo.
	 * @param orderStatus
	 * @return
	 */
	public OrderStatus merge(OrderStatus orderStatus) {
		OrderStatus orderStatus1 = null;
		
		
		return orderStatus1;
	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作.
	 * @param orderStatus
	 */
	public void saveOrUpdate(OrderStatus orderStatus) {
			
	}
}
