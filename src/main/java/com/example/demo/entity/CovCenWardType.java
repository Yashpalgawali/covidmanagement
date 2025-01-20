package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cov_cent_ward_type")
@SequenceGenerator(name = "cov_cen_ward_type_seq", allocationSize = 1, initialValue = 1)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cov_cen_ward_type_id", scope = CovCenWardType.class)
public class CovCenWardType {

	@Id
	@GeneratedValue(generator = "cov_cen_ward_type_seq", strategy = GenerationType.SEQUENCE)
	private Integer cov_cen_ward_type_id;

	private String cov_cen_ward_type;

	@OneToMany(mappedBy = "covcenwardtype")
	@JsonIgnore
	private List<CovCenWards> covcenwards;

	public Integer getCov_cen_ward_type_id() {
		return cov_cen_ward_type_id;
	}

	public void setCov_cen_ward_type_id(Integer cov_cen_ward_type_id) {
		this.cov_cen_ward_type_id = cov_cen_ward_type_id;
	}

	public String getCov_cen_ward_type() {
		return cov_cen_ward_type;
	}

	public void setCov_cen_ward_type(String cov_cen_ward_type) {
		this.cov_cen_ward_type = cov_cen_ward_type;
	}

	public List<CovCenWards> getCovcenwards() {
		return covcenwards;
	}

	public void setCovcenwards(List<CovCenWards> covcenwards) {
		this.covcenwards = covcenwards;
	}

	public CovCenWardType(Integer cov_cen_ward_type_id, String cov_cen_ward_type, List<CovCenWards> covcenwards) {
		super();
		this.cov_cen_ward_type_id = cov_cen_ward_type_id;
		this.cov_cen_ward_type = cov_cen_ward_type;
		this.covcenwards = covcenwards;
	}

	public CovCenWardType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CovCenWardType [cov_cen_ward_type_id=" + cov_cen_ward_type_id + ", cov_cen_ward_type="
				+ cov_cen_ward_type + "]";
	}
	
	
}
