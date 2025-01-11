package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;
import com.example.demo.entity.Designation;
import com.example.demo.entity.Hospital;

@Repository("desigrepo")
public interface DesignationRepository extends JpaRepository<Designation, Integer> {

	public List<Designation> findByDepartment(Department department);
}
