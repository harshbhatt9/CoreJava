package com.mavenpractise.InterviewPrograms;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Palin {

	static final Logger log = Logger.getLogger(Palin.class);
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String ori, rev = "";
		
		System.out.println("Enter String : ");
		
		ori = s.nextLine();
		
		log.info("Enter String : " + ori);
		
		int len = ori.length();
		
		for(int i = len-1; i >= 0; i--)
			
			rev = rev + ori.charAt(i);
			
		    log.info(rev);
		
			if(ori.equals(rev))
				log.info("Enter String is Palindrom ");
			else
				log.info("Enter String is not Palindrom ");
			
	
	}
}