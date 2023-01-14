package com.info.logical;

public class P1 {

	public static void main(String[] args) {
		
		int num=123;
		
		int count=0;
		
		while(num>0)
		{
			count++;
			num/=10;
		}
		
		System.out.println(count);
	}
}
