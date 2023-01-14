package com.info.logical;

import java.util.StringJoiner;

public class P2 {

	public static void main(String[] args) {
		/*
		 * A,B,C
		 * P:Q
		 * A,B,C,P:Q
		 * [A,B,C,P:Q]
		 */
		

				StringJoiner sj1=new StringJoiner(",","[","]");
				
				sj1.add("A").add("B").add("C");

				System.out.println(sj1);
				
				StringJoiner sj2=new StringJoiner(":");
				
				sj2.add("P").add("Q");

				System.out.println(sj2);
			
				sj1.merge(sj2);

				System.out.println(sj1);
				
		}
	}

