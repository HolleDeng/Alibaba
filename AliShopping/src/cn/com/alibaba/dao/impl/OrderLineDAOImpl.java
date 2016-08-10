package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.OrderLine;

/**
 * OrderLineDAOImpl 提供订单明细相关数据库操作
 * 
 * @author hadoop
 * 
 */
public class OrderLineDAOImpl {
	String AMOUNT;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据
	 * @param orderLine
	 */
	public void delete(OrderLine orderLine) {
		
	}

	/**
	 * 取得全部的订单明细.
	 * @return
	 */
	public List findAllOrderLine() {
		List list = null;
		return list;
	}

	/**
	 * Find by amount.
	 */
	public List  findByAmount(Object object) {
		List list=null;
		return list;
	}
	
	/**
	 * 根据范例 Pojo 取得数据库中的相应数据
	 * @param orderLine
	 * @return
	 */
	public List findByExample(OrderLine orderLine) {
//		List: Pojo 的 List 
		List list=null;
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据.
	 * @param lg
	 * @return
	 */
	OrderLine findById(Long lg) {
		OrderLine orderLine = null;
		return orderLine;
	}

	/**
	 * 根据 Pojo 的属性名和Pojo 属性的值在数据库中取得相应数据
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str , Object obj) {
		List list=null;
		return list;
	}

	/**
	 * 把游离的 Pojo 再次变成持久化的 Pojo
	 */
	public void lock(OrderLine orderLine) {
		
	}

	/*
	 * 合并游离的 Pojo， 使游离的 Pojo 再次变成持久化的 Pojo
	 */
	public OrderLine merge(OrderLine orderLine) {
		OrderLine orderLine1 =null;
		
		return orderLine1;
	}

	/**
	 * 把尚未持久化的 Pojo登录至数据库.
	 * @param orderLine
	 */
	public void save(OrderLine orderLine) {
		
	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作
	 * @param orderLine
	 */
	public void saveOrUpdate(OrderLine orderLine) {
		
	}

}
