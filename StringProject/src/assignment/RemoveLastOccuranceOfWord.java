package assignment;

public class RemoveLastOccuranceOfWord {
	public static void main(String[] args) {
		String s="java is good language and java is simple,java is robust";
		
		String str[]=s.split(" ");
		String s1="123ABC,456DEF";
		String str1[]=s1.split(",");
		
		System.out.println(str[str.length-1]);
		System.out.println(str.length);
		System.out.println(str1[0].compareTo(str1[1]));
		System.out.println(s.replaceAll("java", " "));
		System.out.println(s.replace("java", "JAVA"));
		int count=1;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("java"))
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println(count);
		}
	}

}
