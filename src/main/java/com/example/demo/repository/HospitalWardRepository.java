package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ward;

@Repository("hospwardrepo")
public interface HospitalWardRepository extends JpaRepository<Ward, Integer> {

}
