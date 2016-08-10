package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.PayWay;

/**
 * PayWayDAOImpl 提供支付方式相关数据库操作
 * 
 * @author hadoop
 * 
 */
public class PayWayDAOImpl {
	String PAYSTYLE;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据.
	 * 
	 * @param payWay
	 */
	public void delete(PayWay payWay) {

	}

	/**
	 * Method in IPayWayDAO
	 * 
	 * @return
	 */
	public List findAllPayWay() {
		List list = null;
		return list;
	}

	/**
	 * 根据范例 Pojo 取得数据库中的相应数据.
	 * @param payWay
	 * @return
	 */
	public List findByExample(PayWay payWay) {
		List list = null;
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据
	 * @param lg
	 * @return
	 */
	public PayWay findById(Long lg) {
		PayWay payWay = null;
		return payWay;
	}

	/**
	 * Find by paystyle.
	 * @param object
	 * @return
	 */
	public List findByPaystyle(Object object) {
		List list= null;
		return list;
	}

	/**
	 * 根据 Pojo 的属性名和Pojo 属性的值在数据库中取得相应数据.
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str,Object obj) {
		List list= null;
		return list;
	}

	/**
	 * 把游离的 Pojo 再次变成持久化的 Pojz
	 * @param payWay
	 */
	public void lock(PayWay payWay) {

	}

	/**
	 * 合并游离的 Pojo， 使游离的 Pojo 再次变成持
	 * @param payWay
	 * @return
	 */
	public PayWay merge(PayWay payWay ) {
		PayWay payWay1=null;
		
		return payWay1;
	}

	/**
	 * 把尚未持久化的 Pojo登录至数据库.
	 * @param payWay
	 */
	public void save(PayWay payWay) {

	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作
	 * @param payWay
	 */
	public void  saveOrUpdate(PayWay payWay) {
		
	}
}
