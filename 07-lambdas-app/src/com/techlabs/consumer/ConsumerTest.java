package com.techlabs.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> consumer=(string)->{System.out.println(string);};
		consumer.accept("Hello there!");
		
		BiConsumer<Integer,Integer> biconsumer=(a,b)->{System.out.println(a+b);};
		biconsumer.accept(10,20);
		
		BiConsumer<Integer,String> con=(a,b)->System.out.println(b+":"+a);
          con.accept(10,"abc");
          
        
		
		
		

	}

}
