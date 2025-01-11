package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_department")
@SequenceGenerator(name="dept_seq",initialValue = 1,allocationSize = 1)
public class Department {

	@Id
	@GeneratedValue(generator = "dept_seq" , strategy = GenerationType.SEQUENCE)
	private Integer dept_id;
	
	private String dept_name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name= "hosp_id")
	private Hospital hospital;

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Department(Integer dept_id, String dept_name, Hospital hospital) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.hospital = hospital;
	}

	
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", hospital=" + hospital + "]";
	}

	public Department() {
		super();
	}
	
}
