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
@Table(name ="tbl_hosp_staff")
public class HospitalStaff {

	@Id
	@SequenceGenerator(name = "hosp_staff_seq",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "hosp_staff_seq" ,strategy = GenerationType.SEQUENCE)
	private Integer hosp_staff_id;
	
	private String hosp_staff_name;
	
	@ManyToOne
	@JoinColumn(name= "hosp_dept_id")
	private Department department;

	public Integer getHosp_staff_id() {
		return hosp_staff_id;
	}

	public void setHosp_staff_id(Integer hosp_staff_id) {
		this.hosp_staff_id = hosp_staff_id;
	}

	public String getHosp_staff_name() {
		return hosp_staff_name;
	}

	public void setHosp_staff_name(String hosp_staff_name) {
		this.hosp_staff_name = hosp_staff_name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public HospitalStaff(Integer hosp_staff_id, String hosp_staff_name, Department department) {
		super();
		this.hosp_staff_id = hosp_staff_id;
		this.hosp_staff_name = hosp_staff_name;
		this.department = department;
	}

	public HospitalStaff() {
		super();
	}
	
	
}
