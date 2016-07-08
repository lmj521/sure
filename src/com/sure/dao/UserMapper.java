package com.sure.dao;

import java.util.List;
import java.util.Map;

import com.sure.pojo.User;

public interface UserMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Thu Jun 30 17:59:14 CST 2016
	 */
	int deleteByPrimaryKey(String userName);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Thu Jun 30 17:59:14 CST 2016
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Thu Jun 30 17:59:14 CST 2016
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Thu Jun 30 17:59:14 CST 2016
	 */
	User selectByPrimaryKey(String userName);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Thu Jun 30 17:59:14 CST 2016
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Thu Jun 30 17:59:14 CST 2016
	 */
	int updateByPrimaryKey(User record);

	List<User> findUsers(Map para);
}