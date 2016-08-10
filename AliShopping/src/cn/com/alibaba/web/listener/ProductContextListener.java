package cn.com.alibaba.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import sun.rmi.runtime.Log;

/**
 * ProductContextListener 商品内容监听器
 * @author hadoop
 *
 */
public class ProductContextListener implements HttpSessionListener {
	Log log ;
	
	/**
	 * 初始化（系统启动） ，加载IProductBusiness ，IPayWayBusiness ，IOrderStatusBusiness ，ICategoryBusiness 到内存
	 * @param servletContextEvent
	 */
	public void contextDestroyed(ServletContextEvent servletContextEvent){
		
	}
	
	/**
	 * 注销监听器
	 * @param servletContextEvent
	 */
	public void contextInitialized(ServletContextEvent servletContextEvent){
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}
}
