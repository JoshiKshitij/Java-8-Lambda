package com.ghost.basics.InbuiltInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateExample2 {

	static void printLogic(List<String> persons, Predicate<String> condition) {

		for (String name : persons) {
			if (condition.test(name)) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		List<String> persons = Arrays.asList("rupali", "mohan", "zehan", "akbar", "yumraj", "kshitij", "pooja",
				"dilair", "dharmu", "kangna");

		// i have a list print based on differnt logics
		printLogic(persons, (t) -> {if (t.charAt(0) >= 'r') {return true;  }	return false; });

	}

}
