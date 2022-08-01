package assignment;

import java.util.Scanner;

public class UserPassword {
	
	String u,p;
	
	UserPassword(String u, String p)
	{
		this.u=u;
		this.p=p;
	}
	
	void checkUserName()
	{
		for(int i=0;i<u.length();i++)
		{
			if(u.charAt(i)==' ')
			{
				
				System.out.println("Username does not contains any Space");
			}
			
		}
		
		
	}
	
	void checkPassword()
	{
	
		if(p.length()>=8)
		{
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			for(int i=0;i<p.length();i++)
			{
				if(p.charAt(i)>='a' && p.charAt(i)<='z')
				{
					a++;
				}
			   if(p.charAt(i)>='A' && p.charAt(i)<='Z')
				{
					b++;
				}
				
			   if(p.charAt(i)>='0' && p.charAt(i)<='9')
				{
					c++;
				}
			   if(p.charAt(i)=='@' || p.charAt(i)=='#')
				{
					d++;
				}
				
				
				
			}
			 if(a==0)
				{
					System.out.println("Password must have a character");
				}
			  if(b==0)
				{
					System.out.println("Password must have upper character");
				}
			  if(c==0)
				{
					System.out.println("Password must have digit");
				}
			  if(d==0)
				{
					System.out.println("Password must have at least @ or #");
				}
			  if(a!=0 && b!=0 && c!=0 && d!=0)
				
				 {
					 System.out.println("Password is valid");
				 }

		}
		else
		{
			System.out.println("Password must at least 8 character");
//			int a=0;
//			int b=0;
//			int c=0;
//			int d=0;
//			for(int i=0;i<p.length();i++)
//			{
//				if(p.charAt(i)>='a' && p.charAt(i)<='z')
//				{
//					a++;
//				}
//				 if(p.charAt(i)>='A' && p.charAt(i)<='Z')
//				{
//					b++;
//				}
//				 if(p.charAt(i)>='0' && p.charAt(i)<='9')
//				{
//					c++;
//				}
//				 if(p.charAt(i)=='@' && p.charAt(i)=='#')
//				{
//					d++;
//				}
//			}
//			if(a==0)
//			{
//				System.out.println("Password must have a character");
//			}
//			 if(b==0)
//			{
//				System.out.println("Password must have upper character");
//			}
//			 if(c==0)
//			{
//				System.out.println("Password must have digit");
//			}
//			 if(d==0)
//			{
//				System.out.println("Password must have at least @ or #");
//			}
//		
	}
	}
	

}
