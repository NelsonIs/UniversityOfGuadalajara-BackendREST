package com.udg.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Campus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long campusId;
	@NotNull
	@NotEmpty
	@Size(max = 100)
	private String name;
	@NotNull
	@NotEmpty
	@Size(max = 10)
	private String abbreviation;
	@NotNull
	@NotEmpty
	@Size(max = 300)
	private String address;
	
	public Long getCampusId() {
		return campusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}