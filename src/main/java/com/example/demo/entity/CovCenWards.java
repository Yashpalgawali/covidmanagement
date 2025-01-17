package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cov_cen_wards")
public class CovCenWards {

	@Id
	@SequenceGenerator(name = "covcenward_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "covcenward_seq", strategy = GenerationType.AUTO)
	private Integer covcenward_id;

	private String covcenwardnum;

	@ManyToOne
	@JoinColumn(name = "ward_type_id")
	private CovCenWardType covcenwardtype;

	@ManyToOne
	@JoinColumn(name = "dept_id")
	@JsonBackReference
	private CovCenDepartment covcendept;

	public CovCenWards(Integer covcenward_id, String covcenwardnum, CovCenWardType covcenwardtype,
			CovCenDepartment covcendept) {
		super();
		this.covcenward_id = covcenward_id;
		this.covcenwardnum = covcenwardnum;
		this.covcenwardtype = covcenwardtype;
		this.covcendept = covcendept;
	}

	public CovCenDepartment getCovcendept() {
		return covcendept;
	}

	public void setCovcendept(CovCenDepartment covcendept) {
		this.covcendept = covcendept;
	}

	public Integer getCovcenward_id() {
		return covcenward_id;
	}

	public void setCovcenward_id(Integer covcenward_id) {
		this.covcenward_id = covcenward_id;
	}

	public String getCovcenwardnum() {
		return covcenwardnum;
	}

	public void setCovcenwardnum(String covcenwardnum) {
		this.covcenwardnum = covcenwardnum;
	}

	public CovCenWardType getCovcenwardtype() {
		return covcenwardtype;
	}

	public void setCovcenwardtype(CovCenWardType covcenwardtype) {
		this.covcenwardtype = covcenwardtype;
	}

	@Override
	public String toString() {
		return "CovCenWards [covcenward_id=" + covcenward_id + ", covcenwardnum=" + covcenwardnum + ", covcenwardtype="
				+ covcenwardtype + ", covcendept=" + covcendept + "]";
	}

	public CovCenWards() {
		super();
	}

}
