package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "tbl_bed")
@SequenceGenerator(name = "bed_seq",allocationSize = 1,initialValue = 1)
public class Bed {

	@Id
	@GeneratedValue(generator = "bed_seq" ,strategy = GenerationType.AUTO)
	private Integer bed_id;
	
	private Integer bed_number;
	
	@ManyToOne
	@JoinColumn(name = "ward_id")
	private Ward ward;

	public Integer getBed_id() {
		return bed_id;
	}

	public void setBed_id(Integer bed_id) {
		this.bed_id = bed_id;
	}

	public Integer getBed_number() {
		return bed_number;
	}

	public void setBed_number(Integer bed_number) {
		this.bed_number = bed_number;
	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

	public Bed(Integer bed_id, Integer bed_number, Ward ward) {
		super();
		this.bed_id = bed_id;
		this.bed_number = bed_number;
		this.ward = ward;
	}

	public Bed() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
