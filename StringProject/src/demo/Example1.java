package demo;

public class Example1 {
	public static void main(String[] args) {
		
	
	String s="aAZy0bN1 nghge34 ABfyj56";
	//int sum1=(int)'a'+(int)'A'+(int)'Z'+(int)'y'+(int)'0'+(int)'b'+(int)'N'+(int)'1';
	
	
	//System.out.println(sum1);
	
	//char ch[]=s.toCharArray();
	String str[]=s.split(" ");
	int sum=0;
	
	for(int i=0;i<str.length;i++)
		{
			
		for(int j=0;j<str[i].length();j++)
		{
			if(str[i].charAt(j)>='0' && str[i].charAt(j)<='9')
			{
				 sum=sum+str[i].charAt(j)-48;
			}
		   if(str[i].charAt(j)>='a' &&str[i].charAt(j)<='z')
			{
				 sum=sum+str[i].charAt(j);
			}
		 if(str[i].charAt(j)>='A' && str[i].charAt(j)<='Z')
			{
				sum=sum+str[i].charAt(j);
			}
		
			 
		}
		}
		
		System.out.println(sum);
		
		
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].charAt(i)>=str[j].charAt(j))
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			System.out.print(str[i]+" ");
			
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	for(int i=0;i<ch.length;i++)
//	{
//		
//	
//		if(ch[i]>='0' && ch[i]<='9')
//		{
//			 sum=sum+ch[i]-48;
//		}
//	   if(ch[i]>='a' && ch[i]<='z')
//		{
//			 sum=sum+ch[i]-96;
//		}
//	 if(ch[i]>='A' && ch[i]<='Z')
//		{
//			sum=sum+ch[i]-64;
//		}
//	
//		 
//	}
//	
//	System.out.println(sum);
//	
//	
//	
//	
//	for(int i=0;i<ch.length;i++)
//	{
//		for(int j=i+1;j<ch.length;j++)
//		{
//			if(ch[i]>ch[j])
//			{
//				char temp=ch[i];
//				ch[i]=ch[j];
//				ch[j]=temp;
//			}
//		}
//		System.out.print(ch[i]+" ");
//		
//	}

}
}