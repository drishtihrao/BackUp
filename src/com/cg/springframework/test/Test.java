package com.cg.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springframework.organization.Organization;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization org = (Organization) context.getBean("org");
		System.out.println(org);
	}
	
}
