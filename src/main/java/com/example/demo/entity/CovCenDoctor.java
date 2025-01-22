package com.example.demo.entity;

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
@Table(name= "tbl_covcendoctor")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "covcendocid",scope = CovCenDoctor.class)
public class CovCenDoctor {
	@Id
	@SequenceGenerator(name  ="covcendoc_seq",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "covcendoc_seq",strategy = GenerationType.AUTO)
	private Integer covcendocid;
	
	private String covcendocname;
	
	@ManyToOne
	@JoinColumn(name= "cov_cen_dept_id")
//	@JsonBackReference
	private CovCenDepartment covcendept;

	@OneToMany(mappedBy = "covcendoctor")
	private List<CovCenPatient> covcenpatients;

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

	public List<CovCenPatient> getCovcenpatients() {
		return covcenpatients;
	}

	public void setCovcenpatients(List<CovCenPatient> covcenpatients) {
		this.covcenpatients = covcenpatients;
	}

	public CovCenDoctor(Integer covcendocid, String covcendocname, CovCenDepartment covcendept,
			List<CovCenPatient> covcenpatients) {
		super();
		this.covcendocid = covcendocid;
		this.covcendocname = covcendocname;
		this.covcendept = covcendept;
		this.covcenpatients = covcenpatients;
	}

	public CovCenDoctor() {
		super();
	}

	@Override
	public String toString() {
		return "CovCenDoctor [covcendocid=" + covcendocid + ", covcendocname=" + covcendocname + "]";
	}
	
}
