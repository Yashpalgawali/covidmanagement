package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.WardType;

@Repository("wardtyperepo")
public interface WardTypeRepository extends JpaRepository<WardType, Integer> {

}
