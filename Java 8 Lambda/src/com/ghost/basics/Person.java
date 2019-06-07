package com.ghost.basics;

public class Person {
	
	public int age;
	public String name ;
	public String status;
	
	
	
	public Person(int age, String name, String status) {
		super();
		this.age = age;
		this.name = name;
		this.status = status;
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", status=" + status + "]";
	}
	
	
	
}
