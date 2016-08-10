package cn.com.alibaba.web.listener;

import sun.rmi.runtime.Log;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * CartSessionListener 购物车监听器
 * @author hadoop
 *
 */

public class CartSessionListener implements HttpSessionListener{
	Log   log;
	
	/**
	 * 初始化购物车对象到session 中
	 * @param session
	 */
	public void sessionCreated(HttpSessionEvent session){
		
	}
	
	/**
	 * 销毁 session 中购物车对象
	 * @param session
	 */
	public void  sessionDestroyed( HttpSessionEvent session){
		
	}
	
	
}
