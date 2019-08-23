package com.java.spring_aop_maven.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

	@After("execution(public String getName())")
	public void loggingAdvice(){
	System.out.println("Advice run get method called");
}
}