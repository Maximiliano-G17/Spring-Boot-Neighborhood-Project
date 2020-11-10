package com.spring.boot.neighborhood_project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "families")
public class Family {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long houseId;
	
	private int members;
	
	private double profits;
	
	private Integer phone;
	
	private int children;
	
	public Long getHouseId() {
		return houseId;
	}

	public int getMembers() {
		return members;
	}
	
	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public double getProfits() {
		return profits;
	}

	public void setProfits(double profits) {
		this.profits = profits;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Family [houseID=" + houseId + ", members=" + members + ", profits=" + profits + ", phone=" + phone
				+ ", children=" + children + "]";
	}	
}