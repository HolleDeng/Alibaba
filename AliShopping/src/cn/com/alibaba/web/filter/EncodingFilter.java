package cn.com.alibaba.web.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.HttpExchange;
import javax.servlet.Filter;

import sun.rmi.runtime.Log;

/**
 * EncodingFilter 编码过滤器
 * @author hadoop
 *
 */
public class EncodingFilter implements  Filter{
	 FilterConfig config ;
	 String encoding ;
	 Log log ;
	 /**
	  * 初始化 web.xml 配置的过滤规则
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
	  * 编码过滤
	  * @param request
	  * @param response
	  * @param filterChain
	  */
	public void doFilter(ServletRequest   request
			 ,ServletResponse response
			 ,FilterChain filterChain) throws IOException {
		
	}


}