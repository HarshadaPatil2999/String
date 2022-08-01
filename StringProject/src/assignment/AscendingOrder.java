package assignment;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
 String s1="JAVA IS A GOOD PROGRAMMING LANGUAGE";
		
		
		//String s1="A B C D E";
		
		
		
		
		
		
		
		
		
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		
	
		String str[]=s1.split(" ");
		int a[]=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			int sum=0;
			for(int j=0;j<str[i].length();j++)
		{
			if(str[i].charAt(j)>='a' && str[i].charAt(j)<='z' )
			{
				sum=sum+(str[i].charAt(j)-96);
				
			}
			if(str[i].charAt(j)>='A' && str[i].charAt(j)<='Z' )
			{
				sum=sum+(str[i].charAt(j)-64);
				
			}
		}
			a[i]=sum;
	}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
			    {
					int t=a[i];
					a[i]=a[j];
				   a[j]=t;
				String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
//			System.out.println(str[i]+" "+a[i]);
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(str));
//		System.out.println((int)'a');
//		System.out.println((int)'A');
	}

}
