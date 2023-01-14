package com.ty.pack1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to be checked for Perfect Number");
		int num	=scanner.nextInt();
		boolean res=isPerfect(num);
		if(res)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
			System.out.println(num+" is not a Perfect Number");
		
	}
	
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for(int factor=1;factor<num;factor++)
		{
			if(num%factor==0)
				sum+=factor;
		}
		return sum==num;
	}

}
