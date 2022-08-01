package demo2;



public class FindAverageOfDigit {
	public static void main(String[] args) {
		String s1="a5i9gfj4tabc";
		int sum=0;
		int cnt=0;
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j='0';j<='9';j++)
			{
				if(ch[i]==j)
				{
					sum=sum+(ch[i]-48);
					cnt++;
				}
				
			}
		}
		System.out.println(sum);
		float avg=sum/cnt;
		System.out.println(avg);
		
		
//		for(int i='0';i<='9';i++)
//		{
//			for(int j=0;j<s1.length();j++)
//			{
//				if(i==s1.charAt(j))
//				{
//					sum=sum+(i-48);
//					cnt++;
//				}
//			}
//		}
//		System.out.println(sum);
//		
//		int avg=sum/cnt;
//		System.out.println(avg);
//		
		
		
		
		
		
		
		
		
		
//		char ch[]=s1.toCharArray();
//		for(int j='0';j<='9';j++)
//		{
//			for(int i=0;i<ch.length;i++)
//			{
//				if(ch[i]==j)
//				{
//					sum=sum+(j-48);
//					cnt++;
//				}
//				
//			}
//			
//		} System.out.println("Sum:"+sum);
//		
//		int avg=sum/cnt;
//		System.out.println("Average:"+avg);
//		
	}

}
