package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "tbl_covcen_department")
//@JsonIdentityInfo is used because the "covcenter" reference was not included in the result
// when tried to get all the departments with respective "covcenter".
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "covcendeptid",scope = CovCenDepartment.class)
public class CovCenDepartment {

	@Id
	@SequenceGenerator(name = "covcendept_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "covcendept_seq", strategy = GenerationType.AUTO)
	private Integer covcendeptid;

	private String covcendeptname;

	@ManyToOne
	@JoinColumn(name = "covcen_id")
	private CovCenter covcenter;

	@OneToMany(mappedBy = "covcendept")
	@JsonManagedReference
	private List<CovCenDoctor> covcendoctor;

	@OneToMany(mappedBy = "covcendept")
	@JsonIgnore
	private List<CovCenWards> covcenwards;

	public Integer getCovcendeptid() {
		return covcendeptid;
	}

	public void setCovcendeptid(Integer covcendeptid) {
		this.covcendeptid = covcendeptid;
	}

	public String getCovcendeptname() {
		return covcendeptname;
	}

	public void setCovcendeptname(String covcendeptname) {
		this.covcendeptname = covcendeptname;
	}

	public CovCenter getCovcenter() {
		return covcenter;
	}

	public void setCovcenter(CovCenter covcenter) {
		this.covcenter = covcenter;
	}

	public List<CovCenDoctor> getCovcendoctor() {
		return covcendoctor;
	}

	public void setCovcendoctor(List<CovCenDoctor> covcendoctor) {
		this.covcendoctor = covcendoctor;
	}

	public List<CovCenWards> getCovcenwards() {
		return covcenwards;
	}

	public void setCovcenwards(List<CovCenWards> covcenwards) {
		this.covcenwards = covcenwards;
	}

	public CovCenDepartment(Integer covcendeptid, String covcendeptname, CovCenter covcenter,
			List<CovCenDoctor> covcendoctor, List<CovCenWards> covcenwards) {
		super();
		this.covcendeptid = covcendeptid;
		this.covcendeptname = covcendeptname;
		this.covcenter = covcenter;
		this.covcendoctor = covcendoctor;
		this.covcenwards = covcenwards;
	}

	

	@Override
	public String toString() {
		return "CovCenDepartment [covcendeptid=" + covcendeptid + ", covcendeptname=" + covcendeptname + ", covcenter="
				+ covcenter + "]";
	}

	public CovCenDepartment() {
		super();
	}
	
	
}
