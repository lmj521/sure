package com.sure.pojo;

import java.util.Date;

public class Role {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.role_id
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	private Integer roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.role_name
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	private String roleName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.role_desc
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	private String roleDesc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role.create_by
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	private String createBy;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.role_id
	 * @return  the value of sys_role.role_id
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.role_id
	 * @param roleId  the value for sys_role.role_id
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.role_name
	 * @return  the value of sys_role.role_name
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.role_name
	 * @param roleName  the value for sys_role.role_name
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.role_desc
	 * @return  the value of sys_role.role_desc
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public String getRoleDesc() {
		return roleDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.role_desc
	 * @param roleDesc  the value for sys_role.role_desc
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role.create_by
	 * @return  the value of sys_role.create_by
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role.create_by
	 * @param createBy  the value for sys_role.create_by
	 * @mbggenerated  Wed Jul 20 14:37:32 CST 2016
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
}