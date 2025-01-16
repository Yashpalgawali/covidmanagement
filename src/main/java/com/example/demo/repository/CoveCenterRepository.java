package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CovCenter;
import java.util.List;
import com.example.demo.entity.CovCenDepartment;


@Repository("covcenrepo")
public interface CoveCenterRepository extends JpaRepository<CovCenter, Integer> {


		
}
