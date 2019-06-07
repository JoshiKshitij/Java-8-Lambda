package com.ghost.basics.ExceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ExceptionAndWrapperLamda {
	
	static void operation(BiConsumer<Integer, Integer> consumer , List<Integer> numbers , int newNo){
		for (Integer integer : numbers) {
			consumer.accept(integer, newNo);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,12,14,26,123,141,4567,568,6,678,3456796,7,8,9);
		
		//operation((a,b) -> {System.out.println(a*b);}, numbers, 10);
		//this will give u 10 ,20, 90 etc 
		
		//exceptionhandling
		operation(wrapperLambda((a,b) -> {System.out.println(a/b);}), numbers, 0);
		System.out.println("---------------------");
		operation(wrapperLambda((a,b) -> {System.out.println(a/b);}), numbers, 9);
		System.out.println("---------------------");
		operation(wrapperLambda((a,b) -> {System.out.println(a%b);}), numbers, 2);
		System.out.println("---------------------");
	}
	
	static BiConsumer<Integer, Integer>wrapperLambda(BiConsumer<Integer, Integer> con){
	return (a,b)->{
		try {
			con.accept(a, b);
		} catch (Exception e) {
			System.out.println("exception handled in wrapper lambda");
		}
	};	
	}
}
