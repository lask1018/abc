package com.kg.myapp.main;

import java.util.List;

import org.omg.CORBA.Context;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.kg.myapp.dao.IEmpService;
import com.kg.myapp.service.EmpService;
import com.kg.myapp.vo.EmpVO;

public class EmpMain {
	
	public static void main(String[] args) {
		AbstractApplicationContext context =
		new GenericXmlApplicationContext("app-config.xml");
		IEmpService empService = context.getBean("empService",
		IEmpService.class);
		empService.deleteEmp(100);
}

}
	


