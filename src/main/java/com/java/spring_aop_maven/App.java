package com.java.spring_aop_maven;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.spring_aop_maven.service.ShapeService;

public class App 
{
	public static void main(String[] args) {
		System.out.println("executing...");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getTriangle().getName());
		}
}
