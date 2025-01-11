package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_designation")
@SequenceGenerator(name = "desig_seq", allocationSize = 1, initialValue = 1)
public class Designation {

	@Id
	@GeneratedValue(generator = "desig_seq", strategy = GenerationType.SEQUENCE)
	private Integer desig_id;

	private String desig_name;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

	public Integer getDesig_id() {
		return desig_id;
	}

	public void setDesig_id(Integer desig_id) {
		this.desig_id = desig_id;
	}

	public String getDesig_name() {
		return desig_name;
	}

	public void setDesig_name(String desig_name) {
		this.desig_name = desig_name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Designation(Integer desig_id, String desig_name, Department department) {
		super();
		this.desig_id = desig_id;
		this.desig_name = desig_name;
		this.department = department;
	}

	public Designation() {
		super();
	}

}
