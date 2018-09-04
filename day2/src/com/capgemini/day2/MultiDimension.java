package com.capgemini.day2;

public class MultiDimension {
public static int search(int[][] elements, int rows, int columns, int search) {
		
		for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        		if(search==elements[i][j])
        		{
        			//System.out.println("element found");
        			return 1;
        		}
        	}
        }

		// TODO Auto-generated method stub
		return 0;
	}
	

}
