package assignment;

import java.util.Arrays;

public class FindReverseOfString {
public static void main(String[] args) {
	String s1="java is a programming language";
	String s2[]=s1.split(" ");
	String rev="";
	String s3[]=new String[s2.length];
	char ch[]=s1.toCharArray();
	
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	
	System.out.println(rev+" ");
	for(int i=0;i<s2.length;i++)
	{
		for(int j=i+1;j<s2.length;j++)
		{
		String temp=s2[i];
		s2[i]=s2[j];
		s2[j]=temp;
		}
		System.out.print(s2[i]+" ");
	}
	
	
//	for(int i=s2.length-1;i>=0;i--)
//	{
//		System.out.print(s2[i]+" ");
//	}
	System.out.println();
	int cnt=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
		   cnt++;
	     }
		
	}if(cnt>0)
	{
		System.out.println(cnt);
	}
	
	
}
}
