import java.util.Scanner;
public class Search
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the no.of elements:");
		int n= obj.nextInt();
		int[] a=new int[n+1];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
		
			a[i]=obj.nextInt();
		}
		System.out.print("enter the element to search:");
		int ele=obj.nextInt();
		int index=-1;
		for(int i=0;i<=n;i++)
		{
			if(a[i] == ele)
			{
				index=i+1;
				break;
			}
		}
		if(index !=-1)
		{
			System.out.println("Element is found at the index:"+index);
		}
		else
		{
			System.out.println("Element is not found");
		}
	}
}
		
