package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;
import com.example.demo.entity.Hospital;

@Repository("deptrepo")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	public  List<Department> findByHospital(Hospital hospital);
}
