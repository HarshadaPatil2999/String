package demo;



public class CheckStringAnagramUsingsortMethod {
	public static void main(String[] args) {
		String s1="Harshada";
		String s2="adahsraH";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
//		
//		System.out.println(Arrays.toString(ch1));
//		System.out.println(Arrays.toString(ch2));
//		
		
		
		
		int cnt=0;
		for(int i=0;i<ch1.length;i++)
		{
	       	if(ch1[i]==ch2[i] )
				{
					cnt++;
				}
		}
		
		if(cnt==ch1.length)
		  {
			System.out.println("Anagram String");
		   }
		
		else
		  {
			System.out.println("not Anagram String");
		  }
	}

}
