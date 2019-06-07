package com.ghost.basics.collectionExpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ghost.basics.Person;

public class Runner {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person(42, "Yadav Khan", "Married"),
				new Person(27, "Kedar nath", "Single"), new Person(18, "Irfan pandit", "Single"),
				new Person(19, "Krishna alam", "Single"), new Person(31, "Sunna sarkar", "Married"),
				new Person(36, "Mohan Kirat", "Married"), new Person(60, "Chirag segal", "Married"));

		// sorting based on name

		Collections.sort(persons, (Person o1, Person o2) -> o1.name.compareTo(o2.name) );

		for (Person person : persons) {
			System.out.println(person);
		}
		System.out.println("--------------------------------------------");
		System.out.println("sorting based on age");
		Collections.sort(persons, (Person p1 ,Person p2)-> p1.age > p2.age ? 1 :  p1.age < p2.age ? -1 : 0 ) ;

		for (Person person : persons) {
			System.out.println(person);
		}
		 
		// create a own condition
		
		
	}

}
