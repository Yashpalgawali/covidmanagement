package com.example.demo.models;

import java.util.List;

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
@Table(name = "tbl_covcen_doctor")
public class CovCenDoctor {

	@Id
	@SequenceGenerator(name = "covcendoctor_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "covcendoctor_seq", strategy = GenerationType.SEQUENCE)
	private Integer covcendoctor_id;

	private String covcendoctor_name;

	@ManyToOne
	@JoinColumn(name = "covcendept_id")
	private CovCenDepartment covcendoctor_dept;

	@OneToMany(mappedBy = "covcen_patient_doctor")
	private List<CovCenPatient> covcen_doctor_patients;

	public Integer getCovcendoctor_id() {
		return covcendoctor_id;
	}

	public void setCovcendoctor_id(Integer covcendoctor_id) {
		this.covcendoctor_id = covcendoctor_id;
	}

	public String getCovcendoctor_name() {
		return covcendoctor_name;
	}

	public void setCovcendoctor_name(String covcendoctor_name) {
		this.covcendoctor_name = covcendoctor_name;
	}

	public CovCenDepartment getCovcendoctor_dept() {
		return covcendoctor_dept;
	}

	public void setCovcendoctor_dept(CovCenDepartment covcendoctor_dept) {
		this.covcendoctor_dept = covcendoctor_dept;
	}

	public List<CovCenPatient> getCovcen_doctor_patients() {
		return covcen_doctor_patients;
	}

	public void setCovcen_doctor_patients(List<CovCenPatient> covcen_doctor_patients) {
		this.covcen_doctor_patients = covcen_doctor_patients;
	}

	public CovCenDoctor(Integer covcendoctor_id, String covcendoctor_name, CovCenDepartment covcendoctor_dept,
			List<CovCenPatient> covcen_doctor_patients) {
		super();
		this.covcendoctor_id = covcendoctor_id;
		this.covcendoctor_name = covcendoctor_name;
		this.covcendoctor_dept = covcendoctor_dept;
		this.covcen_doctor_patients = covcen_doctor_patients;
	}

	public CovCenDoctor() {
		super();
	}

	@Override
	public String toString() {
		return "CovCenDoctor [covcendoctor_id=" + covcendoctor_id + ", covcendoctor_name=" + covcendoctor_name
				+ ", covcendoctor_dept=" + covcendoctor_dept + ", covcen_doctor_patients=" + covcen_doctor_patients
				+ "]";
	}
	
}
