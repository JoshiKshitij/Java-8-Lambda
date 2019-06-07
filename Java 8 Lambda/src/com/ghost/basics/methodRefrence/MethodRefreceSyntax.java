package com.ghost.basics.methodRefrence;

public class MethodRefreceSyntax {
	
	static void print() {
		System.out.println("i am printed");
	}
	
	static void println() {
		System.out.println("i am printedln");
	}
	
	public static void main(String[] args) {
		
		Thread th = new Thread(MethodRefreceSyntax :: print);
		th.start();
		
		Thread th3 = new Thread(MethodRefreceSyntax :: println);
		th3.start();
		
		
		// her the rum method is replcae by lambda
		Thread th2 = new Thread(()-> System.out.println("hel;o form ilmbda") );
		th2.start();
	}
}
