package com.mavenpractise.ShortTechnique;

import org.apache.log4j.Logger;

public class BubbleSort {

	static final Logger log = Logger.getLogger(BubbleSort.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {15,2,3,1,9,8,20,11};
		
		log.info("Before Bubble Sort");
		
		for(int i : arr)
		{
			//System.out.println(i+" ");
			log.info(i);
		}
		
		bubSort(arr);
		
		log.info("After Bubble Sort");
		
		for(int i : arr)
		{
			//System.out.println(i+" ");
			log.info(i);
		}
	}

	public static void bubSort(int arr[])
	{
		
		int n = arr.length;
		int temp = 0;
		
		for(int i = 0; i<n;i++)
		{
			for(int j = 1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}



