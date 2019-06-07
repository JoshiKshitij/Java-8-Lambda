package com.ghost.basics.usingInterface;


// @FunctionalInterface optional just to enforce that this iterface is a functional interface
@FunctionalInterface
public interface AddInterface {
	
	// define a abstract method
	
	int operation(int a, int b);
	
	
	default void  square(int a) {
		// a functional interface can have only one abstract method 
	}

}
