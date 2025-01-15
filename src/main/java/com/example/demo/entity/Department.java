package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_hosp_department")
@SequenceGenerator(name = "dept_seq", initialValue = 1, allocationSize = 1)
public class Department {

	@Id
	@GeneratedValue(generator = "dept_seq", strategy = GenerationType.SEQUENCE)
	private Integer dept_id;

	private String dept_name;

	@ManyToOne
	@JoinColumn(name = "hosp_id")
	@JsonBackReference   // Prevent serializing the hospital from the department side
	private Hospital hospital;

	@OneToMany(mappedBy = "department")
	@JsonManagedReference  // Serialize the list of doctors in the department
	private List<Doctor> doctor;

	public Department(Integer dept_id, String dept_name, Hospital hospital, List<Doctor> doctor) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.hospital = hospital;
		this.doctor = doctor;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public Department() {
		super();
	}

}
