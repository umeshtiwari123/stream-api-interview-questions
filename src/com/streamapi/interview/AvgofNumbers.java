package com.streamapi.interview;

import java.util.Arrays;
import java.util.List;

public class AvgofNumbers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(-11,2,3,4,5,33,44,22,12,34,0);
		
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		
		System.out.println(avg);
	}
}
