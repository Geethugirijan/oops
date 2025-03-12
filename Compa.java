import java.util.Scanner;
public class Compa{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the 1st string:");
		String s2=s1.nextLine();
		System.out.print("enter the 2nd string:");
		String s3=s1.nextLine();
		int a=s2.compareTo(s3);
		System.out.println("result:"+a);
	}
}
