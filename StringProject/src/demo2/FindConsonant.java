package demo2;

public class FindConsonant {
	public static void main(String[] args) {
		String s1="Patil Harshada";
		char ch[]=s1.toCharArray();
		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')
//			{
//			
//				ch[i]=' ';
//			}
//			if(ch[i]!=' ')
//			{
//				System.out.print(ch[i]);
//			}
//			
//		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!='u')
			{
				System.out.print(ch[i]);
			}
		}
	}

}
