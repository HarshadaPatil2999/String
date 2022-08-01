package demo2;

public class RelaceFirstOccuranceOfChar {
	public static void main(String[] args) {
		String s1="java";
		
		String s2="Language";
		String s3="java";
		String s4=new String("Java");
		System.out.println(s1.replaceFirst("a", ""));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		
	}

}
