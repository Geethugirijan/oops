import java.util.Scanner;
public class Chat{
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the word:");
		String s2=s1.nextLine();
		char ch=s2.charAt(1);
		System.out.println("result= "+ch);
		}
	}
