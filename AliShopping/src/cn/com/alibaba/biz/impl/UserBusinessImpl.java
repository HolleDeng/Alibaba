package cn.com.alibaba.biz.impl;

import java.util.List;

import cn.com.alibaba.web.model.Users;

/**
 * UserBusinessImpl 用户管理实现类
 * @author hadoop
 *
 */
public class UserBusinessImpl {
	
	public UserBusinessImpl() {

	}

	/**
	 * 根据用户 Pojo， 删除相应用户
	 * 参数：String
	 * 返回：boolean
	 */
	public boolean deleteUserByName(String str) {
		boolean flag = false;
		return flag;
	}

	/**
	 * 取得全部的用户
	 * @return
	 */
	public List findAllUsers() {
		List list = null;
		return list;
	}
	
	/**
	 * 根据用户 ID 取得相应的用户
	 * 参数：String
	 * 返回：User: 用户 Pojo
	 * @param str
	 * @return
	 */
	public Users getUserByName(String str) {
		Users use = null;
		return use;
	}

	/**
	 * 参数：String
	 * 返回：boolean: true 存 在 相应用户, false 不存在向应用户
	 * @param str
	 * @return
	 */
	public boolean hasUser(String str) {
		boolean flag = false;
		return flag;
	}

	/**
	 * 更新用户信息
	 * 参数：User
	 * 返回：void
	 */
	public void updateUserInfo(Users user) {
		
	}

	/**
	 * 根据用户 Pojo 和联系信息 Pojo， 注册一个新用户
	 */
	public  void userRegister(Users use) {
		
	}
}
