package com.capgemini.day2;
import java.util.Scanner;
public class Bubble {

	public static int[]  Bubblesort(int[] ar) {
		
		for( int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<=14;i++) 
		
		{
			System.out.println(ar[i]+" ");
		}	
	return ar;
	
	}
	}


