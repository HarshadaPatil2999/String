package demo2;

import java.util.Arrays;

public class FindVowel {
	public static void main(String[] args) {
		String s1="harshada";
		char ch[]=s1.toCharArray();
		char ch1=' ';
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')
			{
				cnt++;
				
				ch1=ch[i];
				
			}
			
			
	   }
		
		System.out.println(ch1+" "+cnt);
		
	}

}
