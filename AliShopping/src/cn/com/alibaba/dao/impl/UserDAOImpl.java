package cn.com.alibaba.dao.impl;

import java.util.List;

import cn.com.alibaba.web.model.Users;

/**
 * UserDAOImpl 提供用户相关数据库操作
 * 
 * @author hadoop
 * 
 */
public class UserDAOImpl {
	String PASSWORD;

	/**
	 * 根据持久化的 Pojo 删除数据库中相应数据
	 * 
	 * @param user
	 */
	public void delete(Users user) {

	}

	/**
	 * Delete user by id
	 * @param str
	 */
	public void  deleteUserById(String str) {
		
	}

	/**
	 * IUserDAO
	 * @return
	 */
	public List findAllUsers() {
		List list=null;
		
		return list;
	}

	/**
	 * 根据范例 Pojo 取得数据库中的相应数据
	 * @param user
	 */
	public List findByExample(Users user) {
		List list=null; //List: Pojo 的 Lis
		
		return list;
	}

	/**
	 * 根据 Pojo 的主键取得数据库中的相应数据
	 * @param lg
	 * @return
	 */
	public Users findById(Long lg) {
		Users user = null;
		return user;
	}

	/**
	 * Find by name
	 * @param str
	 * @return
	 */
	public Users findByName(String str) {
		Users user = null;
		return user;
	}

	/**
	 * 通过密码进行查找
	 * @param object
	 * @return
	 */
	public List  findByPassword(Object object) {
		List list=null; //List: Pojo 的 Lis
		
		return list;
	}

	/**
	 * 根据 Pojo 的属性名和Pojo 属性的值在数据库中取得相应数据
	 * @param str
	 * @param obj
	 * @return
	 */
	public List findByProperty(String str , Object obj) {
		List list=null; //List: Pojo 的 Lis
		
		return list;
	}

	/**
	 * 把游离的 Pojo 再次变成持久化的 Pojo
	 * @param user
	 */
	public void lock(Users user) {
		
	}

	/**
	 * 合并游离的 Pojo， 使游离的 Pojo 再次变成持久化的 Pojo
	 * @param user
	 * @return
	 */
	public Users  merge(Users user) {
		Users user1 = null; 
		return user1;
	}

	/**
	 * 根据用户 Pojo， 修改用户的密码
	 * @param user
	 */
	public void  modifyUserPassword(Users user) {

	}

	/**
	 * 把尚未持久化的 Pojo登录至数据库
	 * @param user
	 */
	public void save(Users user) {

	}

	/**
	 * 根据 Pojo 的状态，进行登录或者更新至数据库的操作
	 * @param user
	 */
	public void saveOrUpdate(Users user) {

	}

}
