package com.cjp.sdutycommons.Reflect;

public class SubjectImpl implements ISubject {

	@Override
	public String say(String name, int age) {
		 return "name: "+name + ">>>age: " + age;
	}

}
