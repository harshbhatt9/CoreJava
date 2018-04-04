package com.mavenpractise.InterviewPrograms;

import org.apache.log4j.Logger;

public class Facto {

	static final Logger log = Logger.getLogger(Facto.class);
	
	public static void main(String[] args) {

		int i,fact = 1, number = 5;
		
		fact =  factorial(number);
		
		log.info("Factorial of "+number+" is :"+fact);
		
	}

	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	
}
