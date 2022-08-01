package demo2;

import java.util.Arrays;

public class LowerCaseToUpperCase {
	public static void main(String[] args) {
		String s1="java is a programming language";
		char ch[]=s1.toCharArray();
		for(int j=0;j<ch.length;j++)
		{
		//	int i=(int)ch[j];
			ch[j]=(char)(ch[j]-32);
			
		}
		//System.out.println(Arrays.toString(ch));
		String s2=new String(ch);
		System.out.println(s2);
		
		
		
		
		
		

}
}