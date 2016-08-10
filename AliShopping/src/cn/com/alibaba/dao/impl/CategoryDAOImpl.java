package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Category;

/**
 * CategoryDAOImpl 提供产品分类相关数据库操作
 * @author hadoop
 *
 */
public class CategoryDAOImpl {
	String DESCRIPTION;
	String NAME;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据.
	 * 
	 * @param category
	 */
	public void delete(Category category) {
		
	}

	/**
	 * 取得全部的商品分类.
	 * 
	 * @return
	 */
	public List findAllCategory() {
		List list = null;
		return list;
	}

	/**
	 * Find by description.
	 * 
	 * @return
	 */
	public List findByDescription(Object obj) {
		List list = null;
		return list;
	}

	/**
	 * 根 据 范 例Pojo 取得数据库中的相应数据.
	 * 
	 * @param category
	 * @return
	 */
	public List findByExample(Category category) {
		List list = null;
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据
	 * 
	 * @param log
	 * @return
	 */
	public Category findById(Long log) {
		Category category = null;
		return category;
	}

	/**
	 * Find by name.
	 * 
	 * @param obj
	 * @return
	 */
	public List findByName(Object obj) {
		List list = null;
		return list;
	}

	/**
	 * 根据 Pojo 的属 性 名 和Pojo 属性的值在数据库中取得相应数据
	 * 
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str, Object obj) {
		List list = null;
		return list;
	}

	/**
	 * 取 得 子 的Category 对象集合，根据 当 前category.id
	 * 
	 * @param log
	 * @return
	 */
	public List getChildCategoryBYFatcherID(Long log) {
		List list = null;
		return list;
	}

	/**
	 * 取 得 父 亲Category 对象，根据当前category.id
	 * 
	 * @param log
	 * @return
	 */
	public Category getFatcherCategoryBYChildID(Long log) {
		Category category = null;
		
		return category;
	}

	/**
	 * 把 游 离 的Pojo 再次变成持久化的Pojo.
	 * 
	 * @param category
	 */
	public void lock(Category category) {

	}

	/**
	 * 合并游离的Pojo， 使游离的 Pojo 再次变成持久化的 Pojo.
	 * 
	 * @param category
	 * @return
	 */
	public Category merge(Category category) {
		Category category1 = null;
		
		return category1;
	}

	/**
	 * 把尚未持久化的 Pojo 登录至数据库
	 * 
	 * @param category
	 */
	public void save(Category category) {
				
	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作.
	 * 
	 * @param category
	 */
	public void saveOrUpdate(Category category) {

	}
}
