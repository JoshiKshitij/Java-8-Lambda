package com.ghost.basics.InbuiltInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
	
	// Supplier interface will tale no arrument but will return somthing

	static Integer operation(Supplier< Integer> supplier){
		return supplier.get();
	}
	
	public static void main(String[] args) {
			System.out.println(operation(()-> 1));
	}
}
