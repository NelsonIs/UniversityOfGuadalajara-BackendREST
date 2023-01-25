package com.udg.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Major {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long majorId;
	@NotNull
	@NotEmpty
	@Size(max = 50)
	private String name;
	@NotNull
	@Min(value = 1, message = "The minium number of semesters should be 1")
	private int numOfSemesters;
	@NotNull
	@Enumerated(value = EnumType.STRING)
	private AreasOfMajors area;
	
	public Long getMajorId() {
		return majorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfSemesters() {
		return numOfSemesters;
	}
	public void setNumOfSemesters(int numOfSemesters) {
		this.numOfSemesters = numOfSemesters;
	}
	public AreasOfMajors getArea() {
		return area;
	}
	public void setArea(AreasOfMajors area) {
		this.area = area;
	}
}