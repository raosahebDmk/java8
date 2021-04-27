package com.functional.suppliers;

import java.util.function.Supplier;

public class TestSupplierMain {

	public static void main(String[] args) {
		
		Supplier<Integer> s = ()->10;
		
		System.out.println(s.get());
		int fact =1;
		for(int i=1;i<=5;i++)
		{
		   fact = fact*i;
		}
		System.out.println(fact);
	}
	
}
