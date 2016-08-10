package cn.com.alibaba.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import sun.rmi.runtime.Log;
import javax.servlet.Filter;

/**
 * LoginFilter 登陆过滤器
 * @author hadoop
 *
 */

public class LoginFilter implements Filter{
	private FilterConfig config=null;  //登陆过滤器进行过滤 
	Log log;
	 
	/**
	 * 初始化过滤规则
	 * @param filterConfig
	 */
	 public void init(FilterConfig filterConfig){
		 
	 }
	 /**
	  * 注销过滤器调用
	  */
	 public void destroy(){
		 
	 }
	 
	 
	 /**
	  * 登陆过滤功能 （限制非法用户)
	  * @param request
	  * @param response
	  * @param filterChain
	  */
	public void doFilter(ServletRequest   request
			 ,ServletResponse response
			 ,FilterChain filterChain) throws IOException {
		 
		
	}
 
	
}
