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
@Table(name = "tbl_covcen_ward")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "covcenward_id" ,scope= CovCenWard.class)
public class CovCenWard {

	@Id
	@SequenceGenerator(name = "covcenward_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "covcenward_seq", strategy = GenerationType.SEQUENCE)
	private Integer covcenward_id;

	private Integer covcenward_num;

	@ManyToOne
	@JoinColumn(name = "covcendept_id")
	private CovCenDepartment covcenwarddept;

	@ManyToOne
	@JoinColumn(name = "covcenwardtype_id")
	private CovCenWardType covcenward_wardtype;

	@OneToMany(mappedBy = "covcendbed_ward")
	private List<CovCenBed> covcenward_beds;

	public Integer getCovcenward_id() {
		return covcenward_id;
	}

	public void setCovcenward_id(Integer covcenward_id) {
		this.covcenward_id = covcenward_id;
	}

	public Integer getCovcenward_num() {
		return covcenward_num;
	}

	public void setCovcenward_num(Integer covcenward_num) {
		this.covcenward_num = covcenward_num;
	}

	public CovCenDepartment getCovcenwarddept() {
		return covcenwarddept;
	}

	public void setCovcenwarddept(CovCenDepartment covcenwarddept) {
		this.covcenwarddept = covcenwarddept;
	}

	public CovCenWardType getCovcenward_wardtype() {
		return covcenward_wardtype;
	}

	public void setCovcenward_wardtype(CovCenWardType covcenward_wardtype) {
		this.covcenward_wardtype = covcenward_wardtype;
	}

	public List<CovCenBed> getCovcenward_beds() {
		return covcenward_beds;
	}

	public void setCovcenward_beds(List<CovCenBed> covcenward_beds) {
		this.covcenward_beds = covcenward_beds;
	}

	public CovCenWard(Integer covcenward_id, Integer covcenward_num, CovCenDepartment covcenwarddept,
			CovCenWardType covcenward_wardtype, List<CovCenBed> covcenward_beds) {
		super();
		this.covcenward_id = covcenward_id;
		this.covcenward_num = covcenward_num;
		this.covcenwarddept = covcenwarddept;
		this.covcenward_wardtype = covcenward_wardtype;
		this.covcenward_beds = covcenward_beds;
	}

	@Override
	public String toString() {
		return "CovCenWard [covcenward_id=" + covcenward_id + ", covcenward_num=" + covcenward_num + ", covcenwarddept="
				+ covcenwarddept + ", covcenward_wardtype=" + covcenward_wardtype + ", covcenward_beds="
				+ covcenward_beds + "]";
	}

	public CovCenWard() {
		super();
	}

}
