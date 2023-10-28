package com.java8.streams8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TopFiveDistinct {

	public static void main(String[] args) {
		
		List<Integer> inputList = Arrays.asList(1, 34, 56, 76, 54, 101, 99, 104, 23, 11, 99, 104);
		
		List<Integer> topFive = inputList.stream().distinct().sorted(Collections.reverseOrder()).limit(5).collect(Collectors.toList());
		
		System.out.println(topFive);
	}
}
