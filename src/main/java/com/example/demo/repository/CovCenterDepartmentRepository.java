package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenter;

@Repository("covcendeptrepo")
public interface CovCenterDepartmentRepository extends JpaRepository<CovCenDepartment, Integer> {

	
	List<CovCenDepartment> findByCovcenter(CovCenter covcenter);
	
	@Modifying
	@Transactional
	@Query("UPDATE CovCenDepartment c SET c.covcendeptname=:dept_name,c.covcenter.covcen_id=:center_id WHERE c.covcendeptid=:dept_id")
	public int updateCovCenDepartment(Integer dept_id,String dept_name,Integer center_id);
}
