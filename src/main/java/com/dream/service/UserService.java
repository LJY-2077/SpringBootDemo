/**  
* @Title: UserService.java
* @Package com.dream.service
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月16日 上午9:53:51
* @version V1.0  
*/ 
package com.dream.service;

import java.util.List;

import com.dream.domain.User;

/**
* @ClassName: UserService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author li jingyang  
* @date 2018年5月16日 上午9:53:51
*
*/
public interface UserService
{

	/**
	* @Title: queryUserByUserName
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param username
	* @param @return    设定文件
	* @return List<User>    返回类型
	* @throws
	*/ 
	List<User> queryUserByUserName(String username);

	/**
	* @Title: findAll
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    设定文件
	* @return List<User>    返回类型
	* @throws
	*/ 
	List<User> findAll();

}
