package com.mavenpractise.ShortTechnique;

import org.apache.log4j.Logger;

public class SelectionSort {

	static final Logger log = Logger.getLogger(SelectionSort.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {15,2,3,1,9,8,20,11};
		
		log.info("Before Selection Sort");
		
		for(int i : arr)
		{
			//System.out.println(i+" ");
			log.info(i);
		}
		
		selSort(arr);
		
		log.info("After Selection Sort");
		
		for(int i : arr)
		{
			//System.out.println(i+" ");
			log.info(i);
		}
	}

	public static void selSort(int arr[])
	{
		for(int i = 0; i<arr.length-1;i++)
		{
			int index = i;
			
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[index])
				{
					index = j;
				}
			}
			
			int smallNum = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNum;
		}
		
	}

}



