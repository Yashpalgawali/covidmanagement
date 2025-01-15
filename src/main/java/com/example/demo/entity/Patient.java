package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_patient")
@SequenceGenerator(name = "patient_seq", initialValue = 1, allocationSize = 1)
public class Patient {

	@Id
	@GeneratedValue(generator = "patient_seq", strategy = GenerationType.AUTO)
	private Integer patient_id;

	private String patient_number;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	@JsonBackReference
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "ward_id")
	@JsonBackReference
	private Ward ward;

	public Integer getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Integer patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_number() {
		return patient_number;
	} 

	public void setPatient_number(String patient_number) {
		this.patient_number = patient_number;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public Patient(Integer patient_id, String patient_number, Doctor doctor, Ward ward) {
		super();
		this.patient_id = patient_id;
		this.patient_number = patient_number;
		this.doctor = doctor;
		this.ward = ward;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
