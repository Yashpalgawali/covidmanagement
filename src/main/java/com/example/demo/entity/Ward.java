package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_hosp_ward")
@SequenceGenerator(name = "hosp_ward_seq", initialValue = 1, allocationSize = 1)
public class Ward { 

	@Id
	@GeneratedValue(generator = "hosp_ward_seq", strategy = GenerationType.SEQUENCE)
	private Integer ward_id;

	private Integer ward_number;

	@ManyToOne
	@JoinColumn(name = "ward_type_id" , unique = false)
	@JsonBackReference("ward-type")
	private WardType wardtype;

	@ManyToOne
	@JoinColumn(name = "hosp_dept_id")
	@JsonManagedReference
	private Department department;
	
	@OneToMany(mappedBy = "ward")
	@JsonBackReference
	private List<Patient> patient;
	
	public Ward(Integer ward_id, Integer ward_number, WardType wardtype, Department department) {
		super();
		this.ward_id = ward_id;
		this.ward_number = ward_number;
		this.wardtype = wardtype;
		this.department = department;
	}

	public Integer getWard_id() {
		return ward_id;
	}

	public void setWard_id(Integer ward_id) {
		this.ward_id = ward_id;
	}

	public Integer getWard_number() {
		return ward_number;
	}

	public void setWard_number(Integer ward_number) {
		this.ward_number = ward_number;
	}

	public WardType getWardtype() {
		return wardtype;
	}

	public void setWardtype(WardType wardtype) {
		this.wardtype = wardtype;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Ward() {
		super();
	}

}
