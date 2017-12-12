package com.cassandra.exampe.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "tms_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 2942713246276805262L;

	@PrimaryKeyColumn(name = "ROLE_ID", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private Integer roleId;

	// @PrimaryKeyColumn(name = "ROLE_TYPE", ordinal = 2, type =
	// PrimaryKeyType.PARTITIONED)
	@Column(value = "ROLE_TYPE")
	private String roleType;

	// @PrimaryKeyColumn(name = "ROLE_NAME", ordinal = 3, type =
	// PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
	@Column(value = "ROLE_NAME")
	private String roleName;

	@Column(value = "ROLE_DESCRIPTION")
	private String roleDescription;

	@Column(value = "CREATED_DTM")
	private Date createdDtm;

	@Column(value = "UPDATED_DTM")
	private Date updatedDtm;

	@Column(value = "USER_ID_LIST")
	private Set<Integer> userIds;

	@Transient
	private Set<User> users;

	@Column(value = "PREVILEGE_ID")
	private Integer previlegeId;

	@Transient
	private Previleges previleges;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Date getCreatedDtm() {
		return createdDtm;
	}

	public void setCreatedDtm(Date createdDtm) {
		this.createdDtm = createdDtm;
	}

	public Date getUpdatedDtm() {
		return updatedDtm;
	}

	public void setUpdatedDtm(Date updatedDtm) {
		this.updatedDtm = updatedDtm;
	}

	public Set<Integer> getUserIds() {
		return userIds;
	}

	public void setUserIds(Set<Integer> userIds) {
		this.userIds = userIds;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Integer getPrevilegeId() {
		return previlegeId;
	}

	public void setPrevilegeId(Integer previlegeId) {
		this.previlegeId = previlegeId;
	}

	public Previleges getPrevileges() {
		return previleges;
	}

	public void setPrevileges(Previleges previleges) {
		this.previleges = previleges;
	}

}
