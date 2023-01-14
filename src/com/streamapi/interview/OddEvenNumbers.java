package com.streamapi.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(11,2,3,45,44);
		
		List<Integer> even=numbers.stream()
		.filter(e -> e%2==0).
		collect(Collectors.toList());
		
		System.out.println(even);
		
		List<Integer> odd=numbers.stream()
				.filter(e -> e%2!=0).
				collect(Collectors.toList());
	
	
		System.out.println(odd);
	
	}

}
