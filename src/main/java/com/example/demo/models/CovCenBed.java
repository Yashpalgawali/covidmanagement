package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_covcen_bed")
public class CovCenBed {

	@Id
	@SequenceGenerator(name = "covcenbed_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "covcenbed_seq", strategy = GenerationType.SEQUENCE)
	private Integer covcenbed_id;

	private String covcenbed_num;

	@ManyToOne
	@JoinColumn(name = "covcenward_id")
	private CovCenWard covcendbed_ward;

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

	public CovCenWard getCovcendbed_ward() {
		return covcendbed_ward;
	}

	public void setCovcendbed_ward(CovCenWard covcendbed_ward) {
		this.covcendbed_ward = covcendbed_ward;
	}

	public CovCenBed(Integer covcenbed_id, String covcenbed_num, CovCenWard covcendbed_ward) {
		super();
		this.covcenbed_id = covcenbed_id;
		this.covcenbed_num = covcenbed_num;
		this.covcendbed_ward = covcendbed_ward;
	}

	@Override
	public String toString() {
		return "CovCenBed [covcenbed_id=" + covcenbed_id + ", covcenbed_num=" + covcenbed_num + ", covcendbed_ward="
				+ covcendbed_ward + "]";
	}

	public CovCenBed() {
		super();
	}

}
