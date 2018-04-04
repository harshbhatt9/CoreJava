package com.mavenpractise.ShortTechnique;

import org.apache.log4j.Logger;

public class InsertionSort {

	static final Logger log = Logger.getLogger(InsertionSort.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {15,2,3,1,9,8,20,11};
		
		log.info("Before Insertion Sort");
		
		for(int i : arr)
		{
			//System.out.println(i+" ");
			log.info(i);
		}
		
		insSort(arr);
		
		log.info("After Insertion Sort");
		
		for(int i : arr)
		{
			//System.out.println(i+" ");
			log.info(i);
		}
	}

	public static void insSort(int arr[])
	{
		
		int n = arr.length;
		
		for(int j = 1; j < n; j++)
		{
			int key = arr[j];
			
			int i = j-1;
			
				while((i > -1) && (arr[i] > key))
				{
					arr[i+1] = arr[i];
					i--;
				}
			arr[i+1] = key;
		}
	}
}



