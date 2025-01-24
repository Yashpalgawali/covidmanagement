package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_covcen_patient")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "covcenpatient_id", scope = CovCenPatient.class)
public class CovCenPatient {

	@Id
	@SequenceGenerator(name = "covcenpatient_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "covcenpatient_seq", strategy = GenerationType.SEQUENCE)
	private Integer covcenpatient_id;

	private String covcenpatient_name;

	@ManyToOne
	@JoinColumn(name = "covcen_bed_id")
	private CovCenBed covcen_patient_bed;

	@ManyToOne
	@JoinColumn(name = "covcendoctor_id")
	private CovCenDoctor covcen_patient_doctor;

	public Integer getCovcenpatient_id() {
		return covcenpatient_id;
	}

	public void setCovcenpatient_id(Integer covcenpatient_id) {
		this.covcenpatient_id = covcenpatient_id;
	}

	public String getCovcenpatient_name() {
		return covcenpatient_name;
	}

	public void setCovcenpatient_name(String covcenpatient_name) {
		this.covcenpatient_name = covcenpatient_name;
	}

	public CovCenBed getCovcen_patient_bed() {
		return covcen_patient_bed;
	}

	public void setCovcen_patient_bed(CovCenBed covcen_patient_bed) {
		this.covcen_patient_bed = covcen_patient_bed;
	}

	public CovCenDoctor getCovcen_patient_doctor() {
		return covcen_patient_doctor;
	}

	public void setCovcen_patient_doctor(CovCenDoctor covcen_patient_doctor) {
		this.covcen_patient_doctor = covcen_patient_doctor;
	}

	public CovCenPatient(Integer covcenpatient_id, String covcenpatient_name, CovCenBed covcen_patient_bed,
			CovCenDoctor covcen_patient_doctor) {
		super();
		this.covcenpatient_id = covcenpatient_id;
		this.covcenpatient_name = covcenpatient_name;
		this.covcen_patient_bed = covcen_patient_bed;
		this.covcen_patient_doctor = covcen_patient_doctor;
	}

	public CovCenPatient() {
		super();
	}

}
