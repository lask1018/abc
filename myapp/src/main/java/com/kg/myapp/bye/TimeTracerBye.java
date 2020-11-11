package com.kg.myapp.bye;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTracerBye {
	
	@Around(value="within(com..ByeService)")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		System.out.println("클래스 : "+s.getDeclaringTypeName()+", 메서드"+s.getName()+" 시작.");
		System.out.println("시작시각 : "+new java.util.Date());
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("종료 시각 : "+new java.util.Date());
		System.out.println("클래스 : "+s.getDeclaringTypeName()+", 메서드"+s.getName()+" 종료.");
		System.out.printf("실행 시간 : %.4f",(endTime-startTime)/1000.0);
		return result;
	}
	

}
