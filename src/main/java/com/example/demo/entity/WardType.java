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
@Table(name = "tbl_ward_type")
@SequenceGenerator(name = "ward_type_seq",allocationSize = 1,initialValue = 1)
public class WardType {

	@Id
	@GeneratedValue(generator = "ward_type_seq" ,strategy = GenerationType.SEQUENCE)
	private Integer ward_type_id;
	
	private String ward_type;

	@OneToMany(mappedBy = "wardtype")
	@JsonManagedReference
	private List<Ward> ward;
	
	public Integer getWard_type_id() {
		return ward_type_id;
	}

	public void setWard_type_id(Integer ward_type_id) {
		this.ward_type_id = ward_type_id;
	}

	public String getWard_type() {
		return ward_type;
	}

	public void setWard_type(String ward_type) {
		this.ward_type = ward_type;
	}

	public WardType(Integer ward_type_id, String ward_type) {
		super();
		this.ward_type_id = ward_type_id;
		this.ward_type = ward_type;
	}

	public WardType() {
		super();
	}
	
}
