package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CovCenter;

@Repository("covcenrepo")
public interface CoveCenterRepository extends JpaRepository<CovCenter, Integer> {

	@Transactional
	@Modifying
	@Query("UPDATE CovCenter c SET c.covcennum=:name WHERE c.covcen_id=:centerid")
	public int updateCovidCenter(Integer centerid, String name);
		
}
