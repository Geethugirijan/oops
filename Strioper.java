import java.util.Scanner;
public class Strioper{
	public static void main(String[] args){
		String str ="Hello world!";
		int len=str.length();
		System.out.println("length of the  string:"+len);
		
		String a=str.toUpperCase();
		System.out.println("result:"+a);
		
		String b=str.toLowerCase();
		System.out.println("result:"+b);
		
		String rep=str.replace('o','x');
		System.out.println("replaced:"+rep);
		
		String sub = str.substring(7,12);
		System.out.println("Substring:"+sub);
		
		boolean swith=str.startsWith("Hello");
		System.out.println("starts with:"+swith);
		
		boolean ewith=str.endsWith("world!");
		System.out.println("ends with:"+ewith);
		
		String tri="   Hello world!  ".trim();
		System.out.println("trimmed"+tri);
	}
}
