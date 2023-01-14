package com.ty.pack1;

import java.util.Scanner;

public class FactorialofaNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		System.out.println(factorial(num));
	}

	public static int factorial(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
