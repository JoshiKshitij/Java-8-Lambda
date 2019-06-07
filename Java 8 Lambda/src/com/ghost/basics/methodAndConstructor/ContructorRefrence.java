package com.ghost.basics.methodAndConstructor;

public class ContructorRefrence {
	
	public static void main(String[] args) {
		StudentInterface face = Student :: new;
		face.getObject();
		face.getObject();
		
		System.out.println("--------------------------------------");
		
		
		// it will call the same constructor with the same no and same type of arrgumrmet
		StudentInterface2 interface2 = Student::new;
		interface2.getObject(1);
		interface2.getObject(2);
		
	}

}

class Student{

	public Student() {
		super();
		System.out.println("i am Student object");
	}
	public Student(int xid) {
		super();
		System.out.println("i am Student object no " +xid);
	}
	
	
}

interface StudentInterface{
	
	Student getObject();
	
}

interface StudentInterface2{
	Student getObject(int id);
}