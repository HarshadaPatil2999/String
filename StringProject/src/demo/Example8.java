package demo;

import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {
		String s1="s3fgh5t6d2";
		char ch[]=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		int sum=0;
//		for(int i=48;i<=57;i++)
//		{
//			for(int j=0;j<ch.length;j++)
//			{
//				if(i==ch[j])
//				{
//					
//					sum=sum+(i-48);
//					
//				}
//			}
//		}
//		System.out.print(sum);
//	
		
	   for(int i=(char)'0';i<=(char)'9';i++)
			{
				for(int j=0;j<ch.length;j++)
				{
					if(i==ch[j])
					{
						
						sum=sum+(ch[i]-48);
						
					}
				}
			}
			System.out.print(sum);
			
			
			
			
//			for(int i=0;i<10;i++)
//			{
//				for(int j=0;j<ch.length;j++)
//				{
//					if(i==(ch[j]-48))
//					{
//						
//						sum=sum+i;
//						
//					}
//				}
//			}
//			System.out.print(sum);
			
//		char i=(char)65;
//		System.out.println(i);
//		int j=(char)'0';
//		System.out.println(j);
//		int g=(char)'a';
//		System.out.println(g);
//		int t=(char)'c';
//		System.out.println(t);
//		
//		int l=(char)'9';
//     System.out.println(l);
//     char h=(int)58;
//     System.out.println(h);
}
}