package assignment;

public class MakeVowelInCapitalLetter {
	public static void main(String[] args) {
		String s="hello,how are you?";
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]= (char)((int)ch[i]-32);
			}
			System.out.print(ch[i]);
		}
		
		
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//			{
//			   // s.charAt(i)=(char)((int)s.charAt(i)-32);
//			}
//		}
		
	}

}
