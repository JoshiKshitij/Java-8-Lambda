package com.ghost.basics.usingInterface;

import java.util.function.Function;

public class MainRunner {
	
	// in order to use lambda 
	// functional interface is required
	
	public static void main(String[] args) {
			
		// using the refrece of a functional interface we can use lambda experssion
		
		// it gives the implimentaion of theta method withoud creating an object 
		// more readablity of code 
		
		AddInterface addNo = (int a , int b) -> a+b;
		// AddInterface addNo = (int a , int b) -> {a+b};
		// AddInterface addNo = (int a , int b) -> {return a+b};
		System.out.println(addNo.operation(2, 4));
		
		
		
		System.out.println("------------------------------------------");
		// it can be read as create an object of inter using annonumus class
		AddInterface object = new AddInterface() {
			
			@Override
			public int operation(int a, int b) {
				System.out.println("object of inner class");
				return a+b;
			}
		};
		
		System.out.println(object.operation(100, 210));
		
		Function<Integer, Integer> sqaure = (a) -> a*a;
		
	}


}
