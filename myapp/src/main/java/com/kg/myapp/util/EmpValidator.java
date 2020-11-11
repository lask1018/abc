package com.kg.myapp.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.kg.myapp.vo.EmpVO;

	@Component
	public class EmpValidator implements Validator{
		
		@Override
		public boolean supports(Class<?> clazz) {
		return EmpVO.class.isAssignableFrom(clazz);
		}
		
		@Override
		public void validate(Object target, Errors errors) {
		EmpVO form = (EmpVO)target;
		if(form.getEmployeeId() <= 206) {
		errors.rejectValue("employeeId", "emp.employeeId", "사원번호는 207번 이상");
	}
	}
	}
