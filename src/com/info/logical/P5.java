package com.info.logical;

public class P5 {

	public static void main(String[] args) {
		
		String s1=new String("abc");
		String s2=new String("abc");
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		String s3="sugar";
		
		s3=s3.concat("cane");
		
		System.out.println(s3);
	}
}
