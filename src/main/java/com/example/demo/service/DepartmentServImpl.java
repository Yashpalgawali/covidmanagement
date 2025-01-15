package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Hospital;
import com.example.demo.repository.DepartmentRepository;

@Service("deptserv")
public class DepartmentServImpl implements DepartmentService {

	private final DepartmentRepository deptrepo;
	
	public DepartmentServImpl(DepartmentRepository deptrepo) {
		super();
		this.deptrepo = deptrepo;
	}

	@Override
	public Department saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		return deptrepo.save(dept);
	}

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return deptrepo.findAll();
	}

	@Override
	public List<Department> getAllDepartmentByHospitalId(Integer hosp_id) {
		Hospital hosp = new Hospital();
		hosp.setHosp_id(hosp_id);
		
		return deptrepo.findByHospital(hosp);
	}

	@Override
	public Department getDepartmentByDeptId(Integer id) {
		Optional<Department> dept_obj = deptrepo.findById(id);
		
		return dept_obj.get();
	}

	@Override
	public Department updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		
		return this.getDepartmentByDeptId(dept.getDept_id());
		 
	}

}
