package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.WardType;

public interface WardTypeService {

	public WardType saveWardType(WardType wardtype);
	
	public List<WardType> getAllWardTypes();
	
	public WardType getWardTypeById(Integer id);
	
	public int updateWardType(WardType wardtype);
}
