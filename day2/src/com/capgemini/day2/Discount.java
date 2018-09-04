package com.capgemini.day2;

public class Discount {		
	
public static double checkDiscount( ) {
	// TODO Auto-generated method stub
	double newitem=100;
	double discount;
	double newItemPrice;
discount=0.35*newitem;
newItemPrice=newitem-discount;
return newItemPrice;
}
}
