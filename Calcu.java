import java.util.Scanner;
public class Calcu{
public static void main(String[] args)
{
int x;
Scanner a=new Scanner(System.in);
System.out.print("enter your 1st number:");
int num1=a.nextInt();
System.out.print("enter your 2nd number:");
int num2=a.nextInt();
System.out.print("enter your option:");
System.out.println("1.addition");
System.out.println("2.substraction");
System.out.println("3.division");
System.out.println("4.multiplication");
a.nextLine();
System.out.print("Enter your option (1-4): ");
String opt = a.nextLine();
while(true){
switch(opt)
{
	case "1":
		System.out.println("result="+(num1+num2));
		break;
	case "2":
		System.out.println("result="+(num1-num2));
		break;
	case "3":
		System.out.println("result="+(num1/num2));
		break;
	case "4":
		System.out.println("result="+(num1*num2));
		break;
	default:System.out.println("INVALID");
}
break;
}
a.close();
}
}


