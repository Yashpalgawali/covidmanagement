package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service("docserv")
public class DoctorServImpl implements DoctorService {

	private final DoctorRepository docrepo;
	
	public DoctorServImpl(DoctorRepository docrepo) {
		super();
		this.docrepo = docrepo;
	}

	@Override
	public Doctor saveDoctor(Doctor doctor) {
	 
		return docrepo.save(doctor);
	}

	@Override
	public Doctor getDoctorbyDoctorId(Integer doc_id) {
		Optional<Doctor> docobj = docrepo.findById(doc_id);
		if(!docobj.isEmpty()) {
			return docobj.get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Doctor> getAllDoctors() {
	 
		return docrepo.findAll();
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
	 
		return null;
	}

	@Override
	public List<Doctor> getAllDoctorsByDepartmentId(Integer dept_id) {
		List<Doctor> doclist = docrepo.findAll()
										.stream()
										.filter(doc -> doc.getDepartment().getDept_id().equals(dept_id))
										.collect(Collectors.toList());
		return doclist;
	}

}
