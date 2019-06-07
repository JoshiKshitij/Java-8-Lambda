package com.ghost.basics.InbuiltInterfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
	
	// this interface has one accept method which takes an object nad return void
	// using this i can write nay logic in this method
	static void operation(List<Integer> numbers , Consumer<Integer> con){
		for (Integer integer : numbers) {
			con.accept(integer);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,-1,-11,141,245,-23);
			
		//print less than 5
		System.out.println("all no less than 5");
		operation(numbers, (num)->{if(num <5) {
			System.out.println(num);
		}});
		
		System.out.println("------------------------------");
		//print greater than 5
		System.out.println("all no greater than 5");
		operation(numbers, (num)->{if(num >5) {
			System.out.println(num);
		}});
	}

}
