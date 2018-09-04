package com.capgemini.day2;

public class Compoundintrst {
	public static double[] Compoundintrst(double a,double r,int t) {
	double simpleInterest=(a*t*r)/100; 
	double Compoundintrst = a*Math.pow(1.0+r/100,t)-a;
	double interests[]= {simpleInterest,Compoundintrst} ;
return interests;
}
}
