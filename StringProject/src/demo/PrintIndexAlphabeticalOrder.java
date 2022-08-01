package demo;

import java.util.Arrays;

public class PrintIndexAlphabeticalOrder {
	public static void main(String[] args) {
		String s1="the quick brown fox jumps over the lazy dog";
	
		char ch[]=s1.toCharArray();
		System.out.println(ch.length);
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(i==ch[j])
				{
					System.out.println(i+" "+j);
				}
			}
	}
		
//		char ch1='a';
//		for(int j=0;j<=26;j++)
//		{
//			if(ch1<='z')
//			{
//				for(int i=0;i<ch.length;i++)
//				{
//					if(ch1==ch[i])
//					{
//						System.out.println(ch1+" "+i);
//					}
//				}
//				ch1++;
//			}
//		}
//		
//		
		
		
		
		
		
		
		
	}

}
