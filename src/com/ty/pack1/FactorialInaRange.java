package com.ty.pack1;

import java.util.Scanner;

public class FactorialInaRange {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int start=scanner.nextInt();
		System.out.println("Enter the Ending Number: ");
		int end=scanner.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int number=i;
			int i2=factorial(number);
			
			System.out.println("Factorial of a Number # "+number+" is "+factorial(number));
		}
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
