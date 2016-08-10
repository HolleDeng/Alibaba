package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Product;

/**
 * ProductDAOImpl 提供商品相关数据库操作
 * 
 * @author hadoop
 * 
 */
public class ProductDAOImpl {
	String AUTHOR;
	String BASEPRICE;
	String DESCRIPTION;
	String IMAGES;
	String NAME;
	String PAGES;
	String PUBLISH;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据.
	 * @param product
	 */
	public void delete(Product product) {

	}

	/**
	 * 查看全部全部商品
	 * @return
	 */
	public List findAllProducts() {
		List list=null;
		return list;
	}

	/**
	 * Find by author.
	 * @param object
	 * @return
	 */
	public List  findByAuthor(Object object) {
		List list=null;
		return list;
	}

	/**
	 * Find by baseprice.
	 * @param object
	 * @return
	 */
	public List  findByBaseprice(Object object) {
		List list=null;
		return list;
	}

	/**
	 * Find by Description.
	 * @param object
	 * @return
	 */
	public List  findByDescription(Object object) {
		List list=null;
		return list;
	}

	/**
	 * 根据范例 Pojo 取得数据库中的相应数据.
	 * @param product
	 * @return
	 */
	public List findByExample(Product product) {
		List list=null;
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据
	 * @param lg
	 * @return 
	 */
	public Product ProductfindById(Long lg) {
		Product product = null;
		return product;
	}

	/**
	 * Find by images
	 * @param object
	 * @return
	 */
	public List  findByImages(Object object) {
		List list=null;
		return list;
	}

	/**
	 * Find by name.
	 * @param object
	 * @return
	 */
	public List  findByName(Object object ) {
		List list=null;
		return list;
	}
	
	/**
	 * Find by Pages.
	 * @param object
	 * @return
	 */
	public List findByPages(Object object) {
		List list=null;
		return list;
	}

	/**
	 * 根据 Pojo 的属性名和Pojo 属性的值在数据库中取得相应数据.
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str, Object obj) {
		List list=null;
		return list;
	}

	/**
	 * Find by publish
	 * @param obj
	 * @return
	 */
	public List  findByPublish(Object obj) {
		List list=null;
		return list;
	}

	/**
	 * 把游离的 Pojo 再次变成持久化的 Pojo
	 * @param product
	 */
	public void lock(Product product) {
		
	}

	/**
	 * 合并游离的 Pojo， 使游离的 Pojo 再次变成持久化的 Pojo
	 * @param product
	 * @return
	 */
	public Product merge(Product product) {
		Product product1= null;
		
		return product1;
	}
	

	/**
	 * 把尚未持久化的 Pojo登录至数据库
	 * @param product
	 */
	public void save(Product product) {
		
	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作
	 * @param product
	 */
	public void saveOrUpdate(Product product) {
		
	}

}
