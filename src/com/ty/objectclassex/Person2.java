package com.ty.objectclassex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import objectClass.Person;

public class Person2 {

	public static void main(String[] args)  {
//		Scanner read = new Scanner(System.in);
//		System.out.println("Enter the Number of User Detalies has to be added!");
//		int userCount  = read.nextInt();
//		List<Person> listOfPerson = new ArrayList<>();
//		while (userCount>0) {
//			Person p = new Person();
//			System.out.println("Enter the Name");read.nextLine();
//			p.setName(read.nextLine());
//			System.out.println("Enter the Age");
//			p.setAge(read.nextInt());
//			System.out.println("Enter the Salary");
//			p.setSal(read.nextInt());
//			listOfPerson.add(p);
//			userCount--;
//		}
		/*
		 * int index = 1; for (Person person : listOfPerson) { for (int i = index; i <
		 * listOfPerson.size(); i++) { Person p2 = listOfPerson.get(i); if
		 * ((person.getName().equals(p2.getName()))&&(person.getAge()==p2.getAge())) {
		 * System.out.println(p2.getName()); } } ++index; }
		 */
		
		Person p1 = new Person();
		p1.setName("Raj");
		p1.setAge(21);
		p1.setSal(20000);
		
		Person p2 = new Person();
		p2.setName("Raju");
		p2.setAge(27);
		p2.setSal(50000);
		
		Person p3 = new Person();
		p3.setName("Raju");
		p3.setAge(27);
		p3.setSal(20000);
		List<Person> listOfPerson = Arrays.asList(p1,p2,p3);
		
		listOfPerson.stream().collect(Collectors.groupingBy(Person:: getAge)).values().stream()
			.filter(person -> person.size() > 1)
			.forEach(person -> System.out.println("Persion With Same Detalies = "+person));
	try {
		((Iterable<Person>) Comparator.comparing(Person :: getName).thenComparingInt(Person :: getAge)).forEach(person -> System.out.println("Persion With Same Details = "+person) );
	}catch (Exception e) {
		
	}
	}

}
