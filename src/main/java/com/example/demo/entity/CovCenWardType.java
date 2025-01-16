package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class CovCenWardType {

	@Id
	@GeneratedValue(generator = "cov_cen_ward_type_seq", strategy = GenerationType.SEQUENCE)
	private Integer cov_cen_ward_type_id;

	private String cov_cen_ward_type;
 
	public CovCenWardType(Integer cov_cen_ward_type_id, String cov_cen_ward_type) {
		super();
		this.cov_cen_ward_type_id = cov_cen_ward_type_id;
		this.cov_cen_ward_type = cov_cen_ward_type;
	}

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

	public CovCenWardType() {
		super();
	}

}
