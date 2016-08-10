package cn.com.alibaba.biz.impl;

import java.util.List;

import cn.com.alibaba.web.model.Product;

/**
 *  ProductBusinessImpl 商品管理实现类
 * @author hadoop
 *
 */
public class ProductBusinessImp {
	
	public ProductBusinessImp(){
		
	}
	/**
	 * 根据商品 ID 取得相应的商品
	 */
	public Product getProductById(Long lon){
		Product product = null;
		
		return product;
	}
	/**
	 * 取得全部的商品
	 */
	public List findAllProducts(){
		List list = null;
		
		return list;
	}
	
	/**
	 * 删除商品根据指定的商品 ID
	 */
	public void deleteProductById(Long log){
		
	}
	
	/**
	 * 修改商品根据指定的商品 ID
	 */
	public void modifyProduct(Product product){
		
	}
	
	/**
	 * 添加商品
	 */
	public void addProduct(Product product){
		
	}
	
	/**
	 *  根据指定的类别 ID 得到其下所有商品
	 */
	public List findAllProductByCategoryID(Long lo){
		List list = null;
		
		return list;
	}
}
