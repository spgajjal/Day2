package com.capgemini.day2;

import java.util.Scanner;

public class Marks {	

	
	public static Object calculateMarks(int i, int j, int k) {

		int s1,s2,s3;
		Scanner in = new Scanner(System.in);
		s1=in.nextInt();
		s2=in.nextInt();
		s3=in.nextInt();
		if(s1>60 && s2>60 && s3>60)
			System.out.println("Passed");
		else if(s1>60 && s2>60 || s2>60 && s3>60 || s3>60 && s1>60)
			System.out.println("Promoted");
		
		else 
			System.out.println("fail");
	

		return s1;
	}

		

}
