package assignment;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		String s1="Hello how are you?";
      	char ch[]=s1.toCharArray();
      
		String s2="";
		System.out.println(!s2.contains(""+ch));
      	
      	for(int i=0;i<ch.length;i++)
      	{
      		if(s2.contains(""+ch[i]) && ch[i]=='o'|| ch[i]=='r')
      		{
      			s2=s2+""+ch[i];
      		}
      		
      	}
      	System.out.println(s2);
      	
      	
	}

}
