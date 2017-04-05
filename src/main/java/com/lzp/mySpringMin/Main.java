package com.lzp.mySpringMin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyBean myBean = (MyBean) context.getBean("myBean2");
		// TODO Auto-generated method stub
		myBean.getMyBeanByName().out();
		myBean.out();
	}

}
