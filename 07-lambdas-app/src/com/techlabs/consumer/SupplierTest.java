package com.techlabs.consumer;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> supplier=()-> "Hello World";
		System.out.println("Hi "+supplier.get());

	}

}
