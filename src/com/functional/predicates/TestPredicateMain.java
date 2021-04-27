package com.functional.predicates;

import java.util.function.Predicate;

public class TestPredicateMain {
	
	public static void main(String[] args) {
		//even no check
		Predicate<Integer> p = (a)->(a%2==0);

		//pime no check
		Predicate<Integer> p1 = (a)->{
			boolean flag=true;
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					flag = false;
					
				}
			}
			
			return flag;
		};
		int i = 13;
		System.out.println(i+" is prime number : "+p1.test(i));
	}

}
