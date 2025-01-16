package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

	public Designation(Integer desig_id, String desig_name) {
		super();
		this.desig_id = desig_id;
		this.desig_name = desig_name;
	}

//	@OneToOne(mappedBy = "designation")
//	private Doctor doctor;
//
//	public Designation(Integer desig_id, String desig_name, Doctor doctor) {
//		super();
//		this.desig_id = desig_id;
//		this.desig_name = desig_name;
//		this.doctor = doctor;
//	}
//
//	public Integer getDesig_id() {
//		return desig_id;
//	}
//
//	public void setDesig_id(Integer desig_id) {
//		this.desig_id = desig_id;
//	}
//
//	public String getDesig_name() {
//		return desig_name;
//	}
//
//	public void setDesig_name(String desig_name) {
//		this.desig_name = desig_name;
//	}
//
//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}

	public Designation() {
		super();
	}

}
