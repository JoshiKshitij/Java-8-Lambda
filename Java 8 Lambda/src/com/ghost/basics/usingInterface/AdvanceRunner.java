package com.ghost.basics.usingInterface;

public class AdvanceRunner {
	
	static int  addTwoNo(AddInterface addInterface,int a,int b) {
		return addInterface.operation(a, b);
	}
	
	
	public static void main(String[] args) {
		// we can directy pass the implimentaion into a method using lambda experssion
		// no need to give the datatype of parameter also 
		int sumIs = addTwoNo(( a , b) -> a+b,2,6 );
		System.out.println("sum of a and b is === >>  " +sumIs);
		
		
		// we can give any inmplimeation like
		
		int mulIs =addTwoNo(( a, b) -> {
			System.out.println("this will print the multiplication of a and b");
			return a*b;
		} ,5,5);
		
		System.out.println("mul of a nad b is --> " +mulIs);
	}
}
