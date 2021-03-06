package com.sure.dao;

import java.util.List;
import java.util.Map;

import com.sure.pojo.Role;

public interface RoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	int deleteByPrimaryKey(Integer roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	int insert(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	int insertSelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	Role selectByPrimaryKey(Integer roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	int updateByPrimaryKeySelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_role
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	int updateByPrimaryKey(Role record);

	List<Role> findRoles(Map param);
}