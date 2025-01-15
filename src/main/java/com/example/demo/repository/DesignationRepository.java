package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Designation;

@Repository("desigrepo")
public interface DesignationRepository extends JpaRepository<Designation, Integer> {

	//public List<Designation> findByDepartment(Department department);
}
