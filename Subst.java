import java.util.Scanner;
public class Subst{
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		System.out.print("enter 1st string:");
		String s2=s1.nextLine();
		String a=s2.substring(2,6);
		System.out.println("result="+a);
	}
}
