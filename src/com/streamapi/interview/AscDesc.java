package com.streamapi.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscDesc {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,10,20,30,15);
		
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
	
		System.out.println(sortedList);
	
		List<Integer> desSortedList=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
				System.out.println(desSortedList);
	}
}
