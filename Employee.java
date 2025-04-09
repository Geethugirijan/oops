import java.util.Scanner;
class Details
{
	int emp_no;
	double salary;
	String name;
	void details(Scanner sc)
	{
		System.out.print("enter the id of employee:");
		emp_no=sc.nextInt();
		sc.nextLine();
		System.out.print("enter the name of employee:");
		name=sc.nextLine();
		System.out.print("enter the salary of employee:");
		salary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("id of employee:"+emp_no);
		System.out.println("name of employee:"+name);
		System.out.println("salary of employee:"+salary);
	}
}
public class Employee
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of employees:");
		int n= sc.nextInt();
		Details[] emparray=new Details[n];
		for(int i=0;i<n;i++)
		{
			emparray[i] = new Details();
			System.out.println("");
			System.out.println("enter the details of employee:"+(i+1));
			emparray[i].details(sc);
		}
		System.out.println("");
		System.out.print("enter employee no to search:");
		int searchno=sc.nextInt();
		boolean found=false;
		for(Details emp:emparray)
		{
			if(emp.emp_no==searchno)
			{
				System.out.println("EMPLOYEE FOUND");
				emp.display();
				found=true;
				break;
			}	
		}
		if(! found)
		System.out.println("employee with no "+searchno+" not found");
		
	}
}
