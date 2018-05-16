/**  
* @Title: UserServiceImpl.java
* @Package com.dream.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月16日 上午9:52:48
* @version V1.0  
*/
package com.dream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.domain.User;
import com.dream.mapper.UserMapper;
import com.dream.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月16日 上午9:52:48
 *
 */
@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	UserMapper mapper;

	@Override
	public List<User> queryUserByUserName(String username)
	{
		List<User> list = mapper.selectUser(username);
		return list;
	}

	/* (非 Javadoc)
	* <p>Title: findAll</p>
	* <p>Description: </p>
	* @return
	* @see com.dream.service.UserService#findAll()
	*/ 
	@Override
	public List<User> findAll()
	{
		List<User> list = mapper.findAll();
		return list;
	}

}
