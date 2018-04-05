package com.mavenpractise.InterviewPrograms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class EvenOdd {

	static final Logger log = Logger.getLogger(EvenOdd.class);
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int x= s.nextInt();
		
		log.info("Enter Number : " + x);
		
		if(isEvenOdd(x))
		{
				System.out.print(x+" ");
		}
		
	}

	public static boolean isEvenOdd(int n)
	{
		
		if(n%2==0)
		{
			log.info("Number is Even");
			return false;
		}
		else
		{
			log.info("Number is Odd");
			return true;
		}
	}
	
}
