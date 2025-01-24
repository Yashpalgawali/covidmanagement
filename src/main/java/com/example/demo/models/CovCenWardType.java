package com.example.demo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_covcen_wardtype")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "covcenwardtype_id",scope = CovCenWardType.class)
public class CovCenWardType {

	@Id
	@SequenceGenerator(name = "covcenwardtype_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "covcenwardtype_seq", strategy = GenerationType.SEQUENCE)
	private Integer covcenwardtype_id;

	private String covcenwardtype_name;

	@OneToMany(mappedBy = "covcenward_wardtype")
	private List<CovCenWard> covcenwardtypewards;

	public Integer getCovcenwardtype_id() {
		return covcenwardtype_id;
	}

	public void setCovcenwardtype_id(Integer covcenwardtype_id) {
		this.covcenwardtype_id = covcenwardtype_id;
	}

	public String getCovcenwardtype_name() {
		return covcenwardtype_name;
	}

	public void setCovcenwardtype_name(String covcenwardtype_name) {
		this.covcenwardtype_name = covcenwardtype_name;
	}

	public List<CovCenWard> getCovcenwardtypewards() {
		return covcenwardtypewards;
	}

	public void setCovcenwardtypewards(List<CovCenWard> covcenwardtypewards) {
		this.covcenwardtypewards = covcenwardtypewards;
	}

	public CovCenWardType(Integer covcenwardtype_id, String covcenwardtype_name, List<CovCenWard> covcenwardtypewards) {
		super();
		this.covcenwardtype_id = covcenwardtype_id;
		this.covcenwardtype_name = covcenwardtype_name;
		this.covcenwardtypewards = covcenwardtypewards;
	}

	public CovCenWardType() {
		super();
	}

	@Override
	public String toString() {
		return "CovCenWardType [covcenwardtype_id=" + covcenwardtype_id + ", covcenwardtype_name=" + covcenwardtype_name
				+ ", covcenwardtypewards=" + covcenwardtypewards + "]";
	}

}
