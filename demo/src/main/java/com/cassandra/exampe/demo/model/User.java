package com.cassandra.exampe.demo.model;

import java.util.Date;
import java.util.Set;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "tms_users")
public class User {

	@PrimaryKeyColumn(name = "USER_ID", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private Integer id;

	@Column(value = "FIRST_NAME")
	private String firstName;

	@Column(value = "LAST_NAME")
	private String lastName;

	@Column(value = "PASSWORD")
	private String password;

	@Column(value = "GENDER")
	private String gender;

	@Column(value = "EMAIL_ID")
	private String emailId;

	@Column(value = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(value = "IS_ACTIVE")
	private String isActive;

	@Column(value = "CREATED_DTM")
	private Date createdDtm;

	@Column(value = "UPDATED_DTM")
	private Date updatedDtm;

	@Column(value = "ROLE_ID_LIST")
	private Set<Integer> roleIds;

	@Transient
	private Set<Role> roles;

	@Column(value = "DEPT_ID_LIST")
	private Set<Integer> deptIds;

	@Transient
	private Set<Department> departments;

	@Column(value = "DOOR_NUMBER")
	private String doorNumber;

	@Column(value = "STREET_NAME")
	private String streetName;

	@Column(value = "AREA")
	private String area;

	@Column(value = "CITY")
	private String city;

	@Column(value = "STATE")
	private String state;

	@Column(value = "COUNTRY")
	private String country;

	@Column(value = "ZIP_CODE")
	private String zipCode;

	public Set<Integer> getDeptIds() {
		return deptIds;
	}

	public void setDeptIds(Set<Integer> deptIds) {
		this.deptIds = deptIds;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Integer> getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Set<Integer> roleIds) {
		this.roleIds = roleIds;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
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

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
