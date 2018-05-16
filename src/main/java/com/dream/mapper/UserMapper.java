package com.dream.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dream.domain.User;

@Mapper //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	/**
	* @Title: selectUser
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param username
	* @param @return    设定文件
	* @return List<User>    返回类型
	* @throws
	*/ 
	List<User> selectUser(String username);

	/**
	* @Title: findAll
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    设定文件
	* @return List<User>    返回类型
	* @throws
	*/ 
	List<User> findAll();
}