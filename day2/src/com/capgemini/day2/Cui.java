package com.capgemini.day2;



public class Cui {
	public static int checkCui(String userid,String password,String user,String pass)
	{
		
		if(userid.equals(user) && password.equals(pass))
		{
		return 1;	
		
		}
		else
			return 0;
	


}
}
