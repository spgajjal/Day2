package com.capgemini.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse {
	
	public static String findAllReverse(String string) {
		
	
	{
	String fin=" ";
	String words[]=string.split(" ");
	for(int i=0;i<words.length;i++)
	{
	String reverse ="";
	for(int j=words[i].length()-1;j>=0;j--)
	{
		reverse+=words[i].charAt(j);
	}
	fin+=reverse+" ";
	}
	return fin;
	}
	}
}

	



