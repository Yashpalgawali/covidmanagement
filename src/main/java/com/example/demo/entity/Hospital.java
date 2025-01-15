package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_hosp")
public class Hospital {

	@Id
	@SequenceGenerator(name = "hosp_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "hosp_seq", strategy = GenerationType.SEQUENCE)
	private Integer hosp_id;

	private String hosp_name;

	@OneToMany(mappedBy = "hospital")
	@JsonManagedReference
	private List<Department> department;

	public Integer getHosp_id() {
		return hosp_id;
	}

	public void setHosp_id(Integer hosp_id) {
		this.hosp_id = hosp_id;
	}

	public String getHosp_name() {
		return hosp_name;
	}

	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public Hospital(Integer hosp_id, String hosp_name, List<Department> department) {
		super();
		this.hosp_id = hosp_id;
		this.hosp_name = hosp_name;
		this.department = department;
	}

	public Hospital() {
		super();
	}

}
