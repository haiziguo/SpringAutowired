package com.lzp.mySpringMin;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* @Qualifier("aa") */
@Component("aa")
public class MyImplatement implements MyInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

}
