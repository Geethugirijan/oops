import java.util.Scanner;
public class Start{
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		System.out.print("enter 1st string:");
		String s2=s1.nextLine();
		System.out.print("enter 2nd string:");
		String s3=s1.nextLine();
		boolean a=s2.startsWith(s3);
		System.out.println("result: "+a);
	}
}
