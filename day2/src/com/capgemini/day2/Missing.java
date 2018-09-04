package com.capgemini.day2;

import java.util.Arrays;

public class Missing {

	public static int findMissing(int[] arr) {
		Arrays.sort(arr);
		int i=0,j=arr.length,missingNumber=0;
		for(int k=1;k<arr.length;k++)
		{
			int l=Arrays.binarySearch(arr,k);
			if(l<0)
			{
				missingNumber=k;
				
			}
			else {
				continue;
			}
		}
		// TODO Auto-generated method stub
		return missingNumber;
	}
}