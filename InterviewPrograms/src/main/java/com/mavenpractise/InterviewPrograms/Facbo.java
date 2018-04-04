package com.mavenpractise.InterviewPrograms;

import org.apache.log4j.Logger;

public class Facbo {

	static final Logger log = Logger.getLogger(Facbo.class);
	
	static int n1 = 0, n2 = 1, n3 = 0;
	
	public static void main(String[] args) {

		int count=10;
		
		log.info(n1+" "+n2);
		
		fibonesisSeries(count-2);
		
	}

	static void fibonesisSeries(int count)
	{
		if(count > 0)
		{
		
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			log.info(""+n3);
		
			fibonesisSeries(count-1);
		}
	}
	
}
