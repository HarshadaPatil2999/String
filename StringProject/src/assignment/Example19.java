package assignment;

public class Example19 {
	public static void main(String[] args) {
		String s1="Avinash is a cricket player and he is a captain of the team";
		System.out.println(s1.substring(8, 50));
		
		
		String s2="abcdfeadfh";
		
		char ch[]=s2.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{ int cnt=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
			       cnt++;
				}
		}
			if(cnt>0)
				System.out.println(cnt +" "+ch[i]);
		}
	}

}
