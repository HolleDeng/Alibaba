package cn.com.alibaba.biz.impl;

import java.util.List;
import java.util.Map;

import cn.com.alibaba.web.model.Category;

public class CategoryBusinessImpl {
	
	public CategoryBusinessImpl() {
	}

	
	/**
	 * 根据父类别 ID 得到其下没有层次的所 有 类 别 的 集 合（LIST
	 */
	List<Category> findAllChildCategoryBYFatcherID() {
		List<Category> list = null;
		
		return list;
	}
	
	/**
	 * 得到从特定类别 ID开始，封装好的类别 树（MAP）
	 */
	 Map findTreeBYCategoryID(Long log) {
		Map map = null;
		
		return map;
	}

	/**
	 * 根据父类别得到紧下一级子类别集合（MAP）
	 * 参数：Long
	 * 返回：Map: 商 品 类 别Map
	 */
	Map getChildCategoryBYFatcherID(Long log) {
		Map map = null;
		
		return map;
	}

	/**
	 * 根据当前类别 ID 得到父类别
	 */
	Category getFatcherCategoryBYChildID(Long log) {
		Category category = null;
		return category;
	}

	/**
	 * 根据类别 ID 得到类别信息
	 * 参数：Long
	 * 返回：Category
	 */
	Category findCategoryBYID(Long log) {
		Category category = null;
		
		return category;
	}
	
}
