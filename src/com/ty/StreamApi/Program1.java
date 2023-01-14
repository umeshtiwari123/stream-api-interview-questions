package com.ty.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program1 {

	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(6,5,2,8,1,7);
		
		//Stream<Integer> data=nums.stream();
		
		//Stream<Integer> mappedData=data.map(n -> n*3);
		//long count=data.count();
		
		//System.out.println(count);
		
		//data.forEach(n -> System.out.println(n));
		
		//mappedData.forEach(n -> System.out.println(n));
		//data.forEach(n -> System.out.println(n)); We can use Streams only once
		//Stream<Integer> sortedData=data.sorted();
		
		//sortedData.forEach(n -> System.out.println(n));
		
//		for(int n :nums)
//		{
//			System.out.println(n*2);
//		}
		
		Predicate<Integer> predi =new Predicate<Integer>() {

			@Override
			public boolean test(Integer n) {
				
				if(n%2==1)
					return true;
				else
					return false;
			}
			
		};
		
		nums.stream()
		.filter(predi)
		.sorted()
		.map(n->n*2)
		.forEach(n -> System.out.println(n));
		
	}
}
