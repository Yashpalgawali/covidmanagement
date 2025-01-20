package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenWardType;
import com.example.demo.entity.CovCenWards;

@Repository("covcenwardrepo")
public interface CovCenWardRepository extends JpaRepository<CovCenWards, Integer> {

	public List<CovCenWards> findByCovcenwardtype(CovCenWardType covcenwardtype);
	
	public List<CovCenWards> findByCovcendept(CovCenDepartment covcendept);
	
	@Transactional
	@Modifying
	@Query("UPDATE CovCenWards c SET c.covcenwardnum=:covcenwardnum, c.covcenwardtype.cov_cen_ward_type_id=:ward_type_id WHERE c.covcenward_id=:wardid")
	public int updateCovidCenterWardById(Integer wardid ,  String covcenwardnum ,Integer ward_type_id);
}
