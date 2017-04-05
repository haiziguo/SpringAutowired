package com.lzp.mySpringMin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyBean {

	private MyBeanByName myBeanByName;

	private MyBeanByContructor myBeanByContructor;

	public MyBeanByContructor getMyBeanByContructor() {
		return myBeanByContructor;
	}

	@Autowired
	public MyBean(MyBeanByContructor myBeanByContructor) {
		this.myBeanByContructor = myBeanByContructor;
	}

	public void out() {

		myBeanByContructor.out();
		myInterface.test();
	}

	public MyBeanByName getMyBeanByName() {
		return myBeanByName;
	}

	@Autowired
	public void setMyBeanByName(MyBeanByName myBeanByName) {
		this.myBeanByName = myBeanByName;
	}

	@Autowired
	@Qualifier("aa")
	private MyInterface myInterface;
}
