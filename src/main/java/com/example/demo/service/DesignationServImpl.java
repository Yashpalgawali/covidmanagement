package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Designation;
import com.example.demo.repository.DesignationRepository;

@Service("desigserv")
public class DesignationServImpl implements DesignationService {

	private final DesignationRepository desigrepo; 
	
	public DesignationServImpl(DesignationRepository desigrepo) {
		super();
		this.desigrepo = desigrepo;
	}

	@Override
	public Designation saveDesignation(Designation designation) {
		// TODO Auto-generated method stub
		return desigrepo.save(designation);
	}

	@Override
	public List<Designation> getAllDesignations() {
		// TODO Auto-generated method stub
		return desigrepo.findAll();
	}

	@Override
	public List<Designation> getAllDesignationsByDepartmentId(Integer dept_id) {
	 
		Department dept = new Department();
		 dept.setDept_id(dept_id);
		
		 return null;
		//return desigrepo.findByDepartment(dept);
	}

	@Override
	public Designation getDesignationById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Designation> desig = desigrepo.findById(id);
		if(!desig.isEmpty()) {
			return desig.get();
		}
		return null;
	}

	@Override
	public Designation updateDesignation(Designation designation) {
		
		return this.getDesignationById(designation.getDesig_id());
		
	}

}
