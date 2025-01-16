package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_doctor")
@SequenceGenerator(name = "doc_seq", allocationSize = 1, initialValue = 1)
public class Doctor {

	@Id
	@GeneratedValue(generator = "doc_seq", strategy = GenerationType.AUTO)
	private Integer doctor_id;

	@Column(unique = true)
	private String doctor_num;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;

	@OneToMany(mappedBy = "doctor")
	private List<Patient> patients;

	
	
public Doctor(Integer doctor_id, String doctor_num, Department department, List<Patient> patients) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_num = doctor_num;
		this.department = department;
		this.patients = patients;
	}



//	@ManyToOne
//	@JoinColumn(name = "desig_id", unique = false)
//	private Designation designation;
//
//	public Doctor(Integer doctor_id, String doctor_num, Department department, List<Patient> patients,
//			Designation designation) {
//		super();
//		this.doctor_id = doctor_id;
//		this.doctor_num = doctor_num;
//		this.department = department;
//		this.patients = patients;
//		this.designation = designation;
//	}
//
//	public Integer getDoctor_id() {
//		return doctor_id;
//	}
//
//	public void setDoctor_id(Integer doctor_id) {
//		this.doctor_id = doctor_id;
//	}
//
//	public String getDoctor_num() {
//		return doctor_num;
//	}
//
//	public void setDoctor_num(String doctor_num) {
//		this.doctor_num = doctor_num;
//	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	public List<Patient> getPatients() {
//		return patients;
//	}
//
//	public void setPatients(List<Patient> patients) {
//		this.patients = patients;
//	}
//
//	public Designation getDesignation() {
//		return designation;
//	}
//
//	public void setDesignation(Designation designation) {
//		this.designation = designation;
//	}

	public Integer getDoctor_id() {
		return doctor_id;
	}



	public void setDoctor_id(Integer doctor_id) {
		this.doctor_id = doctor_id;
	}



	public String getDoctor_num() {
		return doctor_num;
	}



	public void setDoctor_num(String doctor_num) {
		this.doctor_num = doctor_num;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public List<Patient> getPatients() {
		return patients;
	}



	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}



	public Doctor() {
		super();
	}

}
