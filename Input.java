import java.util.Scanner;
public class Input
{
	public static void main(String[] args)
	{
		System.out.print("Enter the 1st number:");
		Scanner a=new Scanner(System.in);
		int n1=a.nextInt();
		System.out.print("Enter the 2nd number:");
		Scanner b=new Scanner(System.in);
		int n2=b.nextInt();
		int sum=n1+n2;
		System.out.println("Sum = "+sum);
	}
}
