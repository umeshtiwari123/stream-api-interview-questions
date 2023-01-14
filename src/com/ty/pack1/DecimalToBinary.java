package com.ty.pack1;

import java.util.Scanner;

public class DecimalToBinary {

	
	public static String isBinaryNumber(int input)
	{
		String binary="";
		int remainder;
		while(input!=0)
		{
			remainder=input%2;
			binary=remainder+binary;
			input=input/2;
		}
		return binary;
				
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int input=scanner.nextInt();
		String binary=isBinaryNumber(input);
		System.out.println(binary);
	}
}
