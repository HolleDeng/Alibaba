package cn.com.alibaba.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 购物车管理核心控制类
 * 
 * @author hadoop
 * 
 */
public class ShopCartMappingDispatchAction  extends ActionSupport{

	/**
	 * 统计商品， 进入订单确认页面
	 * 参数 ActionMapping, ActionForm, HttpServletRequest,HttpServletResponse 
	 * 返回值 ActionForward
	 * 
	 * @return
	 */
	void account() {

	}

	/**
	 * 打起购物车
	 * @return 
	 */
	void showShopCart() {

	}

	/**
	 * 添加商品到购物车
	 * @return 
	 */
	void add2Cart() {

	}

	/**
	 * 暂时没有使用
	 * @return 
	 */
	void viewShopCart() {

	}

	/**
	 * 根据商品 ID，从购物车中移出商品
	 * @return 
	 */
	void removeById() {

	}

	/**
	 * 恢复移出商品到购物车
	 * @return 
	 */
	void undoById() {

	}

	/**
	 * 清空购物车
	 * @return 
	 */
	void clearShopCart() {

	}

	/**
	 * 修改商品数量
	 * @return 
	 */
	void modifyNumber() {

	}

	/**
	 * 订单检查和入库
	 * @return 
	 */
	void checkOut() {

	}
}
