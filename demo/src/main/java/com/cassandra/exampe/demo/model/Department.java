package com.cassandra.exampe.demo.model;

import java.util.Date;
import java.util.Set;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "tms_department")
public class Department {

	@PrimaryKeyColumn(name = "DEPARTMENT_ID", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private int departmentId;

	@Column(value = "DEPARTMENT_NAME")
	private String departmentName;

	@Column(value = "DEPARTMENT_DESCRIPTION")
	private String departmentDescription;

	@Column(value = "CREATED_DTM")
	private Date departmentCreatedDtm;

	@Column(value = "UPDATED_DTM")
	private Date departmentUpdatedDtm;

	@Column(value = "USER_ID_LIST")
	private Set<Integer> userIds;

	@Transient
	private Set<User> users;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public Date getDepartmentCreatedDtm() {
		return departmentCreatedDtm;
	}

	public void setDepartmentCreatedDtm(Date departmentCreatedDtm) {
		this.departmentCreatedDtm = departmentCreatedDtm;
	}

	public Date getDepartmentUpdatedDtm() {
		return departmentUpdatedDtm;
	}

	public void setDepartmentUpdatedDtm(Date departmentUpdatedDtm) {
		this.departmentUpdatedDtm = departmentUpdatedDtm;
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
	
	
	
	
}
