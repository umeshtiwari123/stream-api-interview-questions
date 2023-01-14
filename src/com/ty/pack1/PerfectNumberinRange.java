package com.ty.pack1;

import java.util.Scanner;

public class PerfectNumberinRange {

	public static void main(String[] args) {
			
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int start=scanner.nextInt();
		System.out.println("Enter the Ending Number: ");
		int end=scanner.nextInt();
		for(int i=start;i<=end;i++)
		{
			int number=i;
			boolean b=isPerfect(number);
			if(b==true)
			{
				
				System.out.println(number+" is a Perfect Number");
			
			}
//			
		}
		
		
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
