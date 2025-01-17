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
@Table(name= "tbl_covcendoctor")
public class CovCenDoctor {
	@Id
	@SequenceGenerator(name  ="covcendoc_seq",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "covcendoc_seq",strategy = GenerationType.AUTO)
	private Integer covcendocid;
	
	private String covcendocname;
	
	@ManyToOne
	@JoinColumn(name= "cov_cen_dept_id")
	@JsonBackReference
	private CovCenDepartment covcendept;

	
	@Override
	public String toString() {
		return "CovCenDoctor [covcendocid=" + covcendocid + ", covcendocname=" + covcendocname + ", covcendept="
				+ covcendept + "]";
	}

	public Integer getCovcendocid() {
		return covcendocid;
	}

	public void setCovcendocid(Integer covcendocid) {
		this.covcendocid = covcendocid;
	}

	public String getCovcendocname() {
		return covcendocname;
	}

	public void setCovcendocname(String covcendocname) {
		this.covcendocname = covcendocname;
	}

	public CovCenDepartment getCovcendept() {
		return covcendept;
	}

	public void setCovcendept(CovCenDepartment covcendept) {
		this.covcendept = covcendept;
	}

	public CovCenDoctor(Integer covcendocid, String covcendocname, CovCenDepartment covcendept) {
		super();
		this.covcendocid = covcendocid;
		this.covcendocname = covcendocname;
		this.covcendept = covcendept;
	}

	public CovCenDoctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
