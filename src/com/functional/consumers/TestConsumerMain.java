package com.functional.consumers;

import java.util.function.Consumer;

public class TestConsumerMain {
	
	public static void main(String[] args) {
		
		Consumer<String> c = (a)->System.out.println(a);
		c.accept("test");
	}

}
