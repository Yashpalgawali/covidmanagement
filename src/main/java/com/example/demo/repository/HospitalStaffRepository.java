package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;
import com.example.demo.entity.HospitalStaff;

@Repository("hospstaffrepo")
public interface HospitalStaffRepository extends JpaRepository<HospitalStaff, Integer> {

	public List<HospitalStaff> findByDepartment(Department department);
}
