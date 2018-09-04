package com.capgemini.day2;

public class SentenceCorrection {
	public static String correction(String input, String word, int position) {
		String fin = "";
		int i;
		for(i=0;i<input.length()-1;i++)
		{
			if(input.charAt(i)==input.charAt(i+1) && input.charAt(i)==' ')
			{
				
			}
			else
			{
				fin+=input.charAt(i);
			}
		}
		fin=fin+input.charAt(i);
		input=fin;
		fin="";
//		System.out.println("enter the word to be deleted");
//		System.out.println("Enter the position of the word");
		//int position = v.nextInt();
		int count = 0;
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ') {
				count++;
				if(count == (position - 1))
				{
					fin = input.substring(0, i+1)+input.substring(i+2+word.length());
				}
			}
		}
		// TODO Auto-generated method stub
		return fin;
	}

}
