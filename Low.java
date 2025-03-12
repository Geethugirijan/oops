import java.util.Scanner;
public class Low{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the string:");
		String s2=s1.nextLine();
		String a=s2.toLowerCase();
		System.out.println("result:"+a);
	}
}
