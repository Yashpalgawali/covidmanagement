package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cov_cen_patient")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "covcen_patient_id", scope = CovCenPatient.class)
public class CovCenPatient {
	@Id
	@SequenceGenerator(name = "covcen_patient_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "covcen_patient_seq")
	private Integer covcen_patient_id;

	private String covcen_patient_name;

	@OneToOne
	@JoinColumn(name = "covcen_bed_id")
	private CovCenBed covcenbed;

	@ManyToOne
	@JoinColumn(name = "covcen_doc_id")
	private CovCenDoctor covcendoctor;

	@ManyToOne
	@JoinColumn(name = "covcen_dept_id")
	private CovCenDepartment covcendept;

	public Integer getCovcen_patient_id() {
		return covcen_patient_id;
	}

	public void setCovcen_patient_id(Integer covcen_patient_id) {
		this.covcen_patient_id = covcen_patient_id;
	}

	public String getCovcen_patient_name() {
		return covcen_patient_name;
	}

	public void setCovcen_patient_name(String covcen_patient_name) {
		this.covcen_patient_name = covcen_patient_name;
	}

	public CovCenBed getCovcenbed() {
		return covcenbed;
	}

	public void setCovcenbed(CovCenBed covcenbed) {
		this.covcenbed = covcenbed;
	}

	public CovCenDoctor getCovcendoctor() {
		return covcendoctor;
	}

	public void setCovcendoctor(CovCenDoctor covcendoctor) {
		this.covcendoctor = covcendoctor;
	}

	public CovCenDepartment getCovcendept() {
		return covcendept;
	}

	public void setCovcendept(CovCenDepartment covcendept) {
		this.covcendept = covcendept;
	}

	public CovCenPatient(Integer covcen_patient_id, String covcen_patient_name, CovCenBed covcenbed,
			CovCenDoctor covcendoctor, CovCenDepartment covcendept) {
		super();
		this.covcen_patient_id = covcen_patient_id;
		this.covcen_patient_name = covcen_patient_name;
		this.covcenbed = covcenbed;
		this.covcendoctor = covcendoctor;
		this.covcendept = covcendept;
	}

	public CovCenPatient() {
		super();
	}

	@Override
	public String toString() {
		return "CovCenPatient [covcen_patient_id=" + covcen_patient_id + ", covcen_patient_name=" + covcen_patient_name
				+ "]";
	}
	
}
