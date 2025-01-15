package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

	@OneToMany(mappedBy = "designation")
	private List<Doctor> doctor;

	public Designation(Integer desig_id, String desig_name, List<Doctor> doctor) {
		super();
		this.desig_id = desig_id;
		this.desig_name = desig_name;
		this.doctor = doctor;
	}

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

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public Designation() {
		super();
	}

}
