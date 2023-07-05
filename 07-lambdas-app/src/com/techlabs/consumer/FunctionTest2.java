package com.techlabs.consumer;

import java.util.function.Function;

public class FunctionTest2 {

	public static void main(String[] args) {
		Function<Integer,Integer> factFunction=(number1)->{
			int fact=1;
			int i=1;
			for (int i<number1;i++);
			fact=fact*i;
					return fact;
		};
		Function<Integer,Integer> squareFunction=(number)->number*number;
		System.out.println(factFunction.andThen(squareFunction).apply(5));

	}

}
