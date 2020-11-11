package com.kg.myapp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.kg.myapp.dao.EmpRepository;
import com.kg.myapp.dao.IEmpRepository;
import com.kg.myapp.dao.IEmpService;
import com.kg.myapp.vo.EmpVO;

@Service
public class EmpService implements IEmpService {
	
	@Autowired
	@Qualifier("IEmpRepository")
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
		return empRepository.getEmpCount();
	}

	@Override
	public int getEmpCount(int deptId) {
		return empRepository.getEmpCount(deptId);
	}

	@Override
	public List<EmpVO> getEmpList() {
		return empRepository.getEmpList();
	}

	@Override
	public void updateEmp(EmpVO emp) {
		empRepository.deleteJobHistory(emp.getEmployeeId());
		empRepository.updateEmp(emp);
	}

	@Override
	public void insertEmp(EmpVO emp) {
		empRepository.insertEmp(emp);
	}

	@Override
	public void deleteEmp(int empId) {
		empRepository.deleteJobHistory(empId);
		empRepository.deleteEmp(empId);
		empRepository.updateManagers(empId);
	}

	@Override
	public void deleteJobHistory(int empId) {
		empRepository.deleteJobHistory(empId);
	}

	@Override
	public List<Map<String, Object>> getAllDeptId() {
		return empRepository.getAllDeptId();
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		return empRepository.getAllJobId();
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return empRepository.getAllManagerId();
	}

	@Override
	public EmpVO getEmpInfo(int empId) {
		return empRepository.getEmpInfo(empId);
	}

	@Override
	public List<Map<String, Object>> getEmpShow(int deptId) {
		return empRepository.getEmpShow(deptId);
	}

	@Override
	public int getEmpShow() {
		return empRepository.getEmpShow();
	}

	@Override
	public List<EmpVO> getEmpSearch(String name) {
		return empRepository.getEmpSearch(name);
	}

	@Override
	public int idCheck(int empId) {
		return empRepository.idCheck(empId);
	}


		
	}
	

