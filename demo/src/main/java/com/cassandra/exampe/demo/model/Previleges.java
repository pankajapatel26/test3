package com.cassandra.exampe.demo.model;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "tms_previleges")
public class Previleges {

	@PrimaryKeyColumn(name = "PREVILEGE_ID", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	private int previlegeId;

	@Column(value = "CREATION")
	private int creation;

	@Column(value = "DELETION")
	private int deletion;

	@Column(value = "UPDATION")
	private int updation;

	@Column(value = "READ")
	private int read;

	public int getPrevilegeId() {
		return previlegeId;
	}

	public void setPrevilegeId(int previlegeId) {
		this.previlegeId = previlegeId;
	}

	public int getCreation() {
		return creation;
	}

	public void setCreation(int creation) {
		this.creation = creation;
	}

	public int getDeletion() {
		return deletion;
	}

	public void setDeletion(int deletion) {
		this.deletion = deletion;
	}

	public int getUpdation() {
		return updation;
	}

	public void setUpdation(int updation) {
		this.updation = updation;
	}

	public int getRead() {
		return read;
	}

	public void setRead(int read) {
		this.read = read;
	}

}
