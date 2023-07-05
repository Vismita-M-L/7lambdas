package com.techlabs.consumer;

import java.util.function.Function;

public class FunctionbifunctionTest {

	public static void main(String[] args) {
		Function<Integer,Integer> factFunction=(number1)->{
			int fact=1;
			for (int i=1;i<number1;i++);
			fact=fact*i;
					return fact;
		};

	}

}
