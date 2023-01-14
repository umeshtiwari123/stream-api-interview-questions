package com.ty.lambdaExps;


@FunctionalInterface
interface A
{
	void show();
	String toString();
}

//class B extends Object implements A{
//
//	@Override
//	public void show() {
//		System.out.println("Hi");
//	}
//	
//}




public class Demo {

	public static void main(String[] args) {
		
		A obj=()-> 
		 {
				System.out.println("Hi in Show");
		 };
			
		
		obj.show();
	} 
}
