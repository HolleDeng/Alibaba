package cn.com.alibaba.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 订单管理核心控制类
 * 
 * @author hadoop
 * @param <ActionForward>
 * 
 */

public class OrderMappingDispatchAction<ActionForward> extends ActionSupport {

	/**
	 *  删除用户订单
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward deleteOrder(ActionMapping mapping, 
			HttpServletRequest request, HttpServletResponse response) {

		return null;
	}

	/**
	 *  显示用户订单列表
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward listUserOrders(ActionMapping mapping,  
			HttpServletRequest request, HttpServletResponse response) {
		
				return null;
		
	}

	/**
	 *  显示订单明细
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 */
	public ActionForward orderDetail(ActionMapping mapping,  
			HttpServletRequest request, HttpServletResponse response) {
		
		
				return null;
		
	}

	@Override
	public String execute() throws Exception {

		return super.execute();
	}

}
