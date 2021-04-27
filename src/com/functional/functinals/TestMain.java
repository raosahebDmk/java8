package com.functional.functinals;

import java.util.function.Function;

public class TestMain {
	
	public static void main(String[] args) {
		//even number
		Function<Integer, String> fun = (a)->{
			if(a%2==0)
			{
				return "even number";
			}else {
				return "not even number";
			}
		};
		
		//prime number
		Function<Integer, String> fun1 = (a)->{
			int flag=0;
			for(int i=2;i<=a/2;i++)
			{				
				if(a%i==0)
				{
					flag = 1;
					return "is not prime number";
				}				
			}
			if(flag==0)
				return "is prime number";
			return "";
		};
		
		System.out.println(fun1.apply(13));
		System.out.println(fun1.apply(4));
	}

}
