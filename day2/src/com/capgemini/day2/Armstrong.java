package com.capgemini.day2;


public class Armstrong {
	public static boolean checkAmstrongNumber(int num) {
		
	
	 int  n, temp, total = 0;
	 {
	  n = num;
     
     for( ;n!=0;n /= 10)
     {
         temp = n % 10;
         total = total + temp*temp*temp;
     }

     if(total == num)
         return true;
         else
        	 return false;
	 
	 } 
	}
}

