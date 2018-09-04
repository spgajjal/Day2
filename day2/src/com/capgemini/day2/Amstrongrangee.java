package com.capgemini.day2;

public class Amstrongrangee {

	public static int[] findallAmstrongNumber(int start, int end) {
		int number;
		int digit;
		
		int sum;
		int allAmstrongNumbers[] = new int[6];
		int index = 0;
		for(int i = start; i <= end; i++) {
			number = i;
			sum = 0;
			while(number != 0) {
				digit = number % 10;
				sum = sum + digit * digit * digit;
				number = number / 10;
			}
			if(sum == i)
				allAmstrongNumbers[index++] = i;
		}
		return allAmstrongNumbers;
	}

}
