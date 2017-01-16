package com.spring.constructor;

public class HelloBean {
	private String helloWorld="hello";
	private String user="noone";
	public HelloBean(String helloWorld, String user) {
		this.helloWorld = helloWorld;
		this.user = user;
	}

	public String sayHelloWorld(){
		return helloWorld+" "+ user+"  !";
	}
	

}
