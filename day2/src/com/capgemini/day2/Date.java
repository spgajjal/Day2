package com.capgemini.day2;



public class Date {

	public static String findAllDate(String date) {
		
		 int x=date.length();
		
		 String temp="";
		 for(int i=0;i<x;i++)
		
		 {
			 char ch=date.charAt(i);
			 if(ch == ',')
				 temp=temp+'/';
			 else
				 temp=temp+ch;
			 
	 }
	 String n=""+temp.charAt(3)+temp.charAt(4);
	 int mn=Integer.parseInt(n);
	 String m="";
	 switch(mn)
	 {
	 case 1:
		 m="jan";break;
	 case 2:
		 m="feb";break;
	 case 3:
		 m="mar";break;
	 case 4:
		 m="apr";break;
	 case 5:
		 m="may";break;
	 case 6:
		 m="june";break;
	 case 7:
		 m="july";break;
	 case 8:
		 m="aug";break;
	 case 9:
		 m="sep";break;
	 case 10:
		 m="oct";break;
	 case 11:
		 m="nov";break;
	 case 12:
		 m="dec";break;
		 default:
		 System.out.println("enter month");
		 
	 }
		date=temp.substring(0,3)+ m +temp.substring(5);
		return date; 
 }

	
	}
