package demo;

public class Example1 {
public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		StringBuffer sb4=new StringBuffer(" language");
		StringBuffer sb3=new StringBuffer();
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.append(sb4));
		System.out.println(sb1.charAt(2));
		System.out.println(sb1.indexOf("v"));
		System.out.println(sb1.indexOf("a", 5));
		System.out.println(sb1.lastIndexOf("a"));
		
		System.out.println(sb1.substring(5));
		System.out.println(sb1.substring(2, 8));
		System.out.println(sb1.append(sb3));
		System.out.println(sb1.replace(5, 8, "LAN"));
		sb1.setCharAt(2, 'A');
		System.out.println(sb1);
		
		
		
	}


}
