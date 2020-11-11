package com.kg.myapp.dao;

import java.util.List;
import java.util.Map;

import com.kg.myapp.vo.EmpVO;

public interface IEmpRepository {
	
		int getEmpShow();
		int getEmpCount();
		int getEmpCount(int deptId);
		List<EmpVO> getEmpList();
		EmpVO getEmpInfo(int empId);
		void updateEmp (EmpVO emp);
		void insertEmp (EmpVO emp);
		void deleteEmp (int empId);
		void deleteJobHistory(int empId);
		public List<Map<String,Object>> getAllDeptId();
		public List<Map<String,Object>> getAllJobId();
		public List<Map<String,Object>> getAllManagerId();
		public List<Map<String, Object>> getEmpShow(int deptId);
		public List<EmpVO> getEmpSearch(String name);
		public void updateManagers(int empId);
		public int idCheck(int empId);
		//public List<Map<String,Object>> getUpdateCount(int empId);
		
	}

	
