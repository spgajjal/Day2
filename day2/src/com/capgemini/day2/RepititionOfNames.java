package com.capgemini.day2;

public class RepititionOfNames {
public static int countRepeat(String[] names, String search) {
		
		
		int i,count=0;
		for(i=0;i<names.length;i++)
		{
			if(names[i].compareTo(search)==0)
				count++;
		}
		
		// TODO Auto-generated method stub
		return count;
	}
}
