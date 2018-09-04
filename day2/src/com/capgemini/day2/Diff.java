package com.capgemini.day2;

import java.util.Arrays;

public class Diff {
	
	
	public static int[][] findDiff(int[] arr,int diff) {
	
		
		
		Arrays.sort(arr);
		int k=4,count=0;
		int[][] pairs=new int[5][2] ;
		int i=0,j=arr.length;
		for(int t=0;t<-arr.length;t++) {
			int l=Arrays.binarySearch(arr, arr[t]-k);
			if(l<0)
				continue;
			else {
				pairs[count][0]=arr[t];
				pairs[count][1]=arr[l] ;
				count++;
			}
		}
		return pairs ;
		// TODO Auto-generated method stub
	}
	}

	