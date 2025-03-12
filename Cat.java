import java.util.Scanner;
public class Cat{
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		System.out.print("enter 1st string:");
		String s2=s1.nextLine();
		System.out.print("enter 2nd string:");
		String s3=s1.nextLine();
		String s4=s2.concat(s3);
		System.out.println("resultant ="+s4);
		}
	}
		
