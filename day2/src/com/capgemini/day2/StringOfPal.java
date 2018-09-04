package com.capgemini.day2;

public class StringOfPal {
	String rev(String r)
	{
		String re="";
		for(int i=r.length()-1;i>=0;i--)
		{
			re=re+r.charAt(i);
		}
		return re;
	}

	public static String[] check(String[] input) {
		String str2="";
		String pal[]= new String[10];
		int j=0;
		
		StringOfPal st=new StringOfPal();
		
		for(int i=0;i<input.length;i++)
		{
			str2=st.rev(input[i]);
			if(input[i].equals(str2))
			{
				pal[j]=input[i];
				j++;
			}				
		}
		System.out.println("Number of palindromes are:"+j);
		for(int i=0;i<j-1;i++)
		{
			for(int x=0;x<j-1-i;x++)
			{
				if(pal[x].length()<pal[x+1].length())
				{
					String temp=pal[x+1];
					pal[x+1]=pal[x];
					pal[x]=temp;
				}
			}
		}
//		for(int i=0;i<j;i++)
//		{
//			System.out.print(pal[i]+" ");
//		}
		// TODO Auto-generated method stub
		return pal;
	}


}
