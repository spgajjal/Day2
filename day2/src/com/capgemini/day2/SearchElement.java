package com.capgemini.day2;

public class SearchElement {
public static int element(int[] input, int ele) {
		
		int size=input.length;
		for(int i=0;i<size;i++)
		{
			if(ele==input[i])
			{
				System.out.println("Element found");
				return 1;
			}
			if(i==14) {
				System.out.println("element not found");
				
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
