package com.ghost.basics.InbuiltInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class predicateExample1 {
	
	// its a function interface given by java to use lambda expersions
	static boolean operation(Predicate predicate, Object o) {
		return predicate.test(o);
	};
	
	static boolean  methOneTest() {
		System.out.println("app started ");
		System.out.println("enter any no if greater 0 will return true esle zero");
		Integer x = new Scanner(System.in).nextInt();

		return operation((Object t) -> {
			if (x > 0) {
				return true;
			}
			return false;
		}, x);
	}
	
	
	public static void main(String[] args) {
		methOneTest();

	}
}
