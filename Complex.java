import java.util.Scanner;
public class Complex
{
	int real;
	int imaginary;
	public Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	public void display()
	{
		System.out.println(real+"+"+imaginary+"i");
	}
	public static void sum(int r1,int i1,int r2 ,int i2)
	{
		int sumReal=r1+r2;
		int sumImaginary=i1+i2;
		System.out.println("after addition="+sumReal+"+"+sumImaginary+"i");
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the real part of 1st complex number:");
		int real1=sc.nextInt();
		System.out.println("enter the imaginary part of 1st complex number:");
		int img1=sc.nextInt();
		System.out.println("enter the real part of 2nd complex number:");
		int real2=sc.nextInt();
		System.out.println("enter the imaginary part of 2nd complex number:");
		int img2=sc.nextInt();
		Complex first=new Complex(real1,img1);
		Complex second=new Complex(real2,img2);
		System.out.print("1st complex number:");
		first.display();
		System.out.print("2nd complex number:");
		second.display();
		sum(first.real,first.imaginary,second.real,second.imaginary);
	}
}
