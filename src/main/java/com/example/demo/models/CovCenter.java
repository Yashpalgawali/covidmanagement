package com.example.demo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_covcenter")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "covcenter_id",scope = CovCenter.class)
public class CovCenter {
	
	@Id
	@SequenceGenerator(name = "covcenter_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "covcenter_seq",strategy = GenerationType.SEQUENCE)
	private Integer covcenter_id;
	
	private String covcenter_name;
	
	@OneToMany(mappedBy = "covcenter")
	private List<CovCenDepartment> covcendept;

	public Integer getCovcenter_id() {
		return covcenter_id;
	}

	public void setCovcenter_id(Integer covcenter_id) {
		this.covcenter_id = covcenter_id;
	}

	public String getCovcenter_name() {
		return covcenter_name;
	}

	public void setCovcenter_name(String covcenter_name) {
		this.covcenter_name = covcenter_name;
	}

	public List<CovCenDepartment> getCovcendept() {
		return covcendept;
	}

	public void setCovcendept(List<CovCenDepartment> covcendept) {
		this.covcendept = covcendept;
	}

	public CovCenter(Integer covcenter_id, String covcenter_name, List<CovCenDepartment> covcendept) {
		super();
		this.covcenter_id = covcenter_id;
		this.covcenter_name = covcenter_name;
		this.covcendept = covcendept;
	}

	@Override
	public String toString() {
		return "CovCenter [covcenter_id=" + covcenter_id + ", covcenter_name=" + covcenter_name + ", covcendept="
				+ covcendept + "]";
	}

	public CovCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
