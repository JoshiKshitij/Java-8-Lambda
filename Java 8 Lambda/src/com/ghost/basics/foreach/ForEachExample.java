package com.ghost.basics.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	private class People {
		int age;
		String firstName;
		String lastName;

		@Override
		public String toString() {
			return "People [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

		public People(int age, String firstName, String lastName) {
			super();
			this.age = age;
			this.firstName = firstName;
			this.lastName = lastName;
		}

	}

	public static void main(String[] args) {
		People people = new ForEachExample().new People(12, "Kshitij", "Joshi");

		List<People> peopleList = Arrays.asList(new ForEachExample().new People(21, "Kshitij", "Joshi"),
				new ForEachExample().new People(45, "Hemant", "Irani"),
				new ForEachExample().new People(65, "Kaju", "Sharma"),
				new ForEachExample().new People(43, "Kirti", "Kapoor"),
				new ForEachExample().new People(19, "Shimi", "John"),
				new ForEachExample().new People(28, "Vivek", "lal"));
		
			
				//using consumer interface
		        peopleList.forEach((per)->System.out.println(per));
		        
		        System.out.println("-------------------------------");
		        //or method refrence
		        peopleList.forEach(System.out::println);
		        
		        
		        
		        
	}

}