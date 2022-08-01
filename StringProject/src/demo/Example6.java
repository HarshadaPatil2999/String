package demo;

import java.util.Arrays;

public class Example6 {
	public static void main(String[] args) {
		String s="Java is a programming language";
		String st[]=s.split(" ");
		char str[]=s.toCharArray();
		
		System.out.println("length of Array st:"+st.length);
		
		System.out.println("Arrays of st:"+Arrays.toString(st));
		
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=' ')
			{
				System.out.print(str[i]+" ");
			}
		}
		
//		int cnt=0;
//		for(int i=0;i<str.length;i++)
//		{
//			if(str[i]==' ')
//			{
//				cnt++;
//			}
//		}
//		
//		char ch[]=new char[str.length-cnt];
//		int b=0;
//		for(int i=0;i<str.length;i++)
//		{
//			if(str[i]!=' ')
//			{
//				ch[b]=str[i];
//				b++;
//			}
//		}
//		System.out.println("Array of ch:"+Arrays.toString(ch));
//		 String s1=new String(ch);
//		System.out.print("String ofs1:"+s1);
	}

}
