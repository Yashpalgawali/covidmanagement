package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bed;

@Repository("bedrepo")
public interface BedRepository extends JpaRepository<Bed, Integer> {

}
