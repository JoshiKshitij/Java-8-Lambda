package com.ghost.basics.InbuiltInterfaces;

import java.util.function.Function;

public class FunctionalExample {
	
	private static  int operation(Function< Integer, Integer> function,int x) {
	return function.apply(x);
	}
	
	public static void main(String[] args) {
		// 1st way
		System.err.println(operation(x  -> x*x*x, 3 ));
		
		System.out.println("-------------------");
		
		Function< Integer, Integer> fun = (num) -> (num *num )/10;
		System.out.println(fun.apply(12));
	}

}
