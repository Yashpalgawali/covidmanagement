package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenWardType;
import com.example.demo.entity.CovCenWards;
import com.example.demo.repository.CovCenWardRepository;

@Service("covcenwardserv")
public class CovCenWardServImpl implements CovCenWardService {

	private final CovCenWardRepository covcenwardrepo;

	private final CovCenDeptService covcendeptserv;

	public CovCenWardServImpl(CovCenWardRepository covcenwardrepo, CovCenDeptService covcendeptserv) {
		super();
		this.covcenwardrepo = covcenwardrepo;
		this.covcendeptserv = covcendeptserv;
	}

	@Override
	public CovCenWards saveCovCenWards(CovCenWards covcenward) {

		return covcenwardrepo.save(covcenward);
	}

	@Override
	public List<CovCenWards> getAllCovCeWards() {

		return covcenwardrepo.findAll();
	}

	@Override
	public CovCenWards getCovCenWardByWardId(Integer ward_id) {
		Optional<CovCenWards> obj = covcenwardrepo.findById(ward_id);
		if (!obj.isEmpty()) {
			return obj.get();
		} else {
			return null;
		}
	}

	@Override
	public CovCenWards updateCovCenWards(CovCenWards covcenward) {
		int res = covcenwardrepo.updateCovidCenterWardById(covcenward.getCovcenward_id(), covcenward.getCovcenwardnum(),
				covcenward.getCovcenwardtype().getCov_cen_ward_type_id());
		if (res > 0)
			return this.getCovCenWardByWardId(covcenward.getCovcenward_id());
		else
			return null;
	}

	@Override
	public List<CovCenWards> getAllCovCeWardByWardtype(Integer ward_type_id) {
		CovCenWardType wardtype = new CovCenWardType();
		wardtype.setCov_cen_ward_type_id(ward_type_id);
		return covcenwardrepo.findByCovcenwardtype(wardtype);
	}

	@Override
	public List<CovCenWards> getAllCovCeWardByDepartment(Integer dept_id) {
		CovCenDepartment deptObj = covcendeptserv.getCovCentDepartmentById(dept_id);
		return covcenwardrepo.findByCovcendept(deptObj);

	}

}
