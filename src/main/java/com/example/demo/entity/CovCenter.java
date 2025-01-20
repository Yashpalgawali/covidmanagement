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
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@SequenceGenerator(name = "covcenseq", allocationSize = 1, initialValue = 1)
@Table(name = "tbl_cov_center")
// @JsonIdentityInfo is used because the "covcenter" reference was not included in the result. used same in the CovCenDepartment entity 
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "covcen_id", scope = CovCenter.class)
public class CovCenter {

	@Id
	@GeneratedValue(generator = "covcenseq", strategy = GenerationType.AUTO)
	private Integer covcen_id;

	private String covcennum;

	@OneToMany(mappedBy = "covcenter")
	@JsonIgnore
	private List<CovCenDepartment> covcendept;


	@Override
	public String toString() {
		return "CovCenter [covcen_id=" + covcen_id + ", covcennum=" + covcennum + "]";
	}

	public CovCenter(Integer covcen_id, String covcennum, List<CovCenDepartment> covcendept) {
		super();
		this.covcen_id = covcen_id;
		this.covcennum = covcennum;
		this.covcendept = covcendept;
	}

	public Integer getCovcen_id() {
		return covcen_id;
	}

	public void setCovcen_id(Integer covcen_id) {
		this.covcen_id = covcen_id;
	}

	public String getCovcennum() {
		return covcennum;
	}

	public void setCovcennum(String covcennum) {
		this.covcennum = covcennum;
	}

	public List<CovCenDepartment> getCovcendept() {
		return covcendept;
	}

	public void setCovcendept(List<CovCenDepartment> covcendept) {
		this.covcendept = covcendept;
	}

	public CovCenter() {
		super();
	}

}
