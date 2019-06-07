package com.ghost.basics.methodAndConstructor;

public class MethodRefrence {
	
	static void sum(int x, int v){
		System.out.println("sum = "  + (x+v));
	}
	
	 void mul(int x, int v){
		System.out.println("mul = "  + (x*v));
	}
	
	public static void main(String[] args) {
		// if method is staic 
		Inter face = MethodRefrence ::sum;
		face.operation(12, 98);
		
		
		// if the methid is non satic object refence is required
		 face = new MethodRefrence() :: mul ;
		 face.operation(12,13);
		
	}
	

}

interface Inter{
	
	void operation(int a ,int b);
	
}


