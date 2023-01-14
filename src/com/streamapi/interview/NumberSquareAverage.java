package com.streamapi.interview;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		
	
	List<Integer> list=Arrays.asList(1,10,20,30,15);
	
		//1 100 400 900 225
		//400 900 225
		//1525/3 = 508.3333
	
	double avg=	list.stream()
			.map(e -> e*e)
			.filter(e-> e>100)
			.filter(e -> e>=900)
				.mapToInt(e->e).average()
					.getAsDouble();
	
	System.out.println(avg);
	}
}
