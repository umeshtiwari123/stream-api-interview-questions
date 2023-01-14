package com.ty.pack1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOddEven {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,11,12,13,14,15,16);
		
		List<Integer> evenList=numbers.stream().filter(k->k%2==0).collect(Collectors.toList());
		
		System.out.println("Even Numbers List are :"+evenList);
		
		List<Integer> oddList=numbers.stream().filter(e->e%2!=0).collect(Collectors.toList());
		
		System.out.println("Odd Numbers List are :"+oddList);
		
//		List<Integer> abc= numbers.stream().filter(w->w%4==0).collect(Collectors.toList());
//		
//			System.out.println(abc);
	}

}
