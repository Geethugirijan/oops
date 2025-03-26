import java.util.Scanner;
import java.util.Arrays;
public class Sor
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the no.of strings:");
		int n= obj.nextInt();
		String[] a=new String[n+1];
		System.out.println("enter the strings:");
		for(int i=0;i<=n;i++)
		{
		
			a[i]=obj.nextLine();
		}
		Arrays.sort(a);
		System.out.print("sorted strings:");
		for(String str:a)
		{
			System.out.println(str);
		
		}
		
	}
}
