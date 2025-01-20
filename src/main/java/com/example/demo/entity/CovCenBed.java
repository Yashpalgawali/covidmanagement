package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cov_cen_bed")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "covcenbed_id", scope = CovCenBed.class)
public class CovCenBed {

	@Id
	@SequenceGenerator(name = "cov_cen_bed_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "cov_cen_bed_seq", strategy = GenerationType.AUTO)
	private Integer covcenbed_id;

	private String covcenbed_num;

	@ManyToOne
	@JoinColumn(name = "cov_cen_ward_id")
	private CovCenWards covcenward;

	public Integer getCovcenbed_id() {
		return covcenbed_id;
	}

	public void setCovcenbed_id(Integer covcenbed_id) {
		this.covcenbed_id = covcenbed_id;
	}

	public String getCovcenbed_num() {
		return covcenbed_num;
	}

	public void setCovcenbed_num(String covcenbed_num) {
		this.covcenbed_num = covcenbed_num;
	}

	public CovCenWards getCovcenward() {
		return covcenward;
	}

	public void setCovcenward(CovCenWards covcenward) {
		this.covcenward = covcenward;
	}

	public CovCenBed(Integer covcenbed_id, String covcenbed_num, CovCenWards covcenward) {
		super();
		this.covcenbed_id = covcenbed_id;
		this.covcenbed_num = covcenbed_num;
		this.covcenward = covcenward;
	}

	@Override
	public String toString() {
		return "CovCenBed [covcenbed_id=" + covcenbed_id + ", covcenbed_num=" + covcenbed_num + ", covcenward="
				+ covcenward + "]";
	}

	public CovCenBed() {
		super();
	}

}
