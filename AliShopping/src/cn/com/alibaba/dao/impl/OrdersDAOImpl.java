package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Orders;

/**
 * OrdersDAOImpl 提供订单相关数据库操作
 * 
 * @author hadoop
 * 
 */
public class OrdersDAOImpl {
	String COST;
	String NAME;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据
	 * 
	 * @param orders
	 */
	public void delete(Orders orders) {

	}

	/**
	 * 查找全部的订单
	 * @return
	 */
	public List findAllOrders() {
		List list = null;
		return list;
	}

	/**
	 * Find by cost
	 * @param obj
	 * @return
	 */
	public List findByCost(Object obj) {
		List list=null;
		return list;
	}

	/**
	 * 根据范例 Pojo 取得数据库中的相应数据.
	 */
	public List findByExample(Orders orders) {
		List list=null;
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据
	 * @param lg
	 * @return
	 */
	public Orders findById(Long lg) {
		Orders orders=null;
		return orders;
	}

	/**
	 * 通过名字进行查找
	 * @param object
	 * @return
	 */
	public List  findByName(Object object) {
		List list=null;
		return list;
	}

	/**
	 * 根据 Pojo 的属性名和Pojo 属性的值在数据库中取得相应数据
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str, Object obj) {
		List list=null;
		return list;
	}

	/**
	 * 把游离的 Pojo 再次变成持久化的 Pojo
	 * @param orders
	 */
	public void lock(Orders orders) {

	}

	/**
	 * 把尚未持久化的 Pojo登录至数据库
	 * @param orders
	 */
	public void merge(Orders orders) {
		
	}

	/**
	 * 合并游离的 Pojo， 使游离的 Pojo 再次变成持久化的 Pojo
	 * @param orders
	 * @return
	 */
	public Orders save(Orders orders) {
		Orders orders1=null;
		return orders1;
	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作
	 * @param orders
	 */
	public void saveOrUpdate(Orders orders) {
		
	}

}
