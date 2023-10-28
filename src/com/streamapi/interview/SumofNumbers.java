package com.streamapi.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumofNumbers {

	public static void main(String[] args) {
		
			
		List<Integer> list= Arrays.asList(1,4,5,7);
		
		
		List<Integer> sum1 = list.stream().map(e ->e+5).collect(Collectors.toList());
		Optional<Integer> sum2 = list.stream().reduce((a,b) -> a+b);

		System.out.println(sum1);
		System.out.println(sum2.get());
		
	
		
	}
}
