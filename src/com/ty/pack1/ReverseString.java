package com.ty.pack1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		
		
		
		System.out.println("Reverse String is :"+revString(str));
	}
	
	public static String revString(String str)
	{
		
		String rev="";
		
		if(str==null || str.length()<=1)
		{
			System.out.println("Please enter proper String");
		}
		else
		{
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		}
		return rev;
		
	}
}
