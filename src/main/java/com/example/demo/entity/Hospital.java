package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="tbl_hosp")
public class Hospital {

	@Id
	@SequenceGenerator(name="hosp_seq", initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "hosp_seq" , strategy = GenerationType.SEQUENCE)
	private Integer hosp_id;
	
	private String hosp_name;

	public Integer getHosp_id() {
		return hosp_id;
	}

	public void setHosp_id(Integer hosp_id) {
		this.hosp_id = hosp_id;
	}

	public String getHosp_name() {
		return hosp_name;
	}

	public void setHosp_name(String hosp_name) {
		this.hosp_name = hosp_name;
	}

	public Hospital(Integer hosp_id, String hosp_name) {
		super();
		this.hosp_id = hosp_id;
		this.hosp_name = hosp_name;
	}

	public Hospital() {
		super();
	}
	
}
