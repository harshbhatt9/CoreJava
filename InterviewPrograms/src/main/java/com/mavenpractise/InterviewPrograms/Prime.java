package com.mavenpractise.InterviewPrograms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Prime {

	static final Logger log = Logger.getLogger(Prime.class);
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		
		int start = s.nextInt();
		
		log.info("Enter First Number : " + start);
		
		System.out.println("Enter Second Number : ");
		
		int end = s.nextInt();
		
		log.info("Enter Second Number : " + end);
		
		for(int i = start; i < end; i++){
			
			if(isPrime(i))
			{
				System.out.print(i+" ");
				
				log.info(i);
			}
		}
		
	}

	public static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		
		
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}

		return true;
	}
	
}
