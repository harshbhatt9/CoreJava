package com.mavenpractise.InterviewPrograms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class ArmStrong {

	static final Logger log = Logger.getLogger(ArmStrong.class);
	
	public static void main(String[] args) {

		int c = 0, a, temp;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int x= s.nextInt();
		
		log.info("Enter Number : " + x);
		
		temp = x;
		
		log.info("Temporary Number :" + temp);
		
		while (x > 0)
		{
			
			a = x%10;
			x = x/10;
			
			c = c + (a*a*a);
			
			
		}
			if(temp==c)
			{
					log.info("Armstrong Number");
			}
			else
			{
					log.info("Not Armstrong Number");
			}
		
	}
	
} 