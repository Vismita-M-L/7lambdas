package com.techlabs.consumer;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> evenpredicate=(number)->number%2==0;
		if(evenpredicate.test(5));
		System.out.println("Number is even");
		else
	
			System.out.println("Number is odd");

	}

}
