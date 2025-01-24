package com.example.demo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@Table(name = "tbl_covcen_dept")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "covcendept_id",scope = CovCenDepartment.class)
public class CovCenDepartment {
	@Id
	@SequenceGenerator(name = "covcendept_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "covcendept_seq",strategy = GenerationType.SEQUENCE)
	
	private Integer covcendept_id;

	private String covcendept_name;

	@ManyToOne
	@JoinColumn(name = "covcenter_id")
	private CovCenter covcenter;

	@OneToMany(mappedBy = "covcenwarddept")
	private List<CovCenWard> covcendeptwards;

	@OneToMany(mappedBy = "covcendoctor_dept")
	private List<CovCenDoctor> covcendept_doctor;

	public Integer getCovcendept_id() {
		return covcendept_id;
	}

	public void setCovcendept_id(Integer covcendept_id) {
		this.covcendept_id = covcendept_id;
	}

	public String getCovcendept_name() {
		return covcendept_name;
	}

	public void setCovcendept_name(String covcendept_name) {
		this.covcendept_name = covcendept_name;
	}

	public CovCenter getCovcenter() {
		return covcenter;
	}

	public void setCovcenter(CovCenter covcenter) {
		this.covcenter = covcenter;
	}

	public List<CovCenWard> getCovcendeptwards() {
		return covcendeptwards;
	}

	public void setCovcendeptwards(List<CovCenWard> covcendeptwards) {
		this.covcendeptwards = covcendeptwards;
	}

	public List<CovCenDoctor> getCovcendept_doctor() {
		return covcendept_doctor;
	}

	public void setCovcendept_doctor(List<CovCenDoctor> covcendept_doctor) {
		this.covcendept_doctor = covcendept_doctor;
	}

	public CovCenDepartment(Integer covcendept_id, String covcendept_name, CovCenter covcenter,
			List<CovCenWard> covcendeptwards, List<CovCenDoctor> covcendept_doctor) {
		super();
		this.covcendept_id = covcendept_id;
		this.covcendept_name = covcendept_name;
		this.covcenter = covcenter;
		this.covcendeptwards = covcendeptwards;
		this.covcendept_doctor = covcendept_doctor;
	}

	public CovCenDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CovCenDepartment [covcendept_id=" + covcendept_id + ", covcendept_name=" + covcendept_name
				+ ", covcenter=" + covcenter + ", covcendeptwards=" + covcendeptwards + ", covcendept_doctor="
				+ covcendept_doctor + "]";
	}

	
}
