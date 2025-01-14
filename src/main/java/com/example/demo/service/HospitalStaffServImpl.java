package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.HospitalStaff;
import com.example.demo.repository.HospitalStaffRepository;

@Service("hospstaffserv")
public class HospitalStaffServImpl implements HospitalStaffService {

	private HospitalStaffRepository hospstaffrepo;
	
	public HospitalStaffServImpl(HospitalStaffRepository hospstaffrepo) {
		super();
		this.hospstaffrepo = hospstaffrepo;
	}

	@Override
	public HospitalStaff saveHospitalStaff(HospitalStaff hospstaff) {

		return hospstaffrepo.save(hospstaff);
	}

	@Override
	public List<HospitalStaff> getAllHospitalStaff() {

		return hospstaffrepo.findAll();
	}

	@Override
	public HospitalStaff getHospitalStaffById(Integer hosp_staff_id) {
		
		Optional<HospitalStaff> hospstaffobj = hospstaffrepo.findById(hosp_staff_id);
		if(!hospstaffobj.isEmpty()) {
			return hospstaffobj.get();
		}
		else {
			return null;
		}
		
	}

	@Override
	public List<HospitalStaff> getHospitalStaffByHospitalId(Integer hosp_id) {
		List<HospitalStaff> hospstafflist = this.getAllHospitalStaff()
			.stream()
				.filter(staff -> staff.getDepartment().getHospital().getHosp_id().equals(hosp_id))
					.collect(Collectors.toList()); 
		
		return hospstafflist;
	}

	@Override
	public List<HospitalStaff> getHospitalStaffByHospitalDepartmentId(Integer hosp_dept_id) {
		
		List<HospitalStaff> hospstafflist = this.getAllHospitalStaff()
			.stream()
			.filter(staff-> staff.getDepartment().getDept_id().equals(hosp_dept_id))
				.collect(Collectors.toList());
		
		return hospstafflist;
	}

}
