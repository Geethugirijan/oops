import java.util.Scanner;
class Employee{
	int emp_id;
	String name;
	double salary;
	String address;
	
}
class Teacher extends Employee{
	String dept;
	String subject;
	Teacher(int emp_id,String name,double salary,String address,String dept,String subject){
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.dept=dept;
		this.subject=subject;
	}
	void display() {
		System.out.println(" ");
		System.out.println("EMPLOYEE ID : "+emp_id);
		System.out.println("NAME : "+name);
		System.out.println("SALARY : "+salary);
		System.out.println("ADDRESS : "+address);
		System.out.println("DEPARTMENT : "+dept);
		System.out.println("SUBJECT TAUGHT : "+subject);
}
}
public class Mainsec{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of teachers :");
		int n=sc.nextInt();
		sc.nextLine();
		Teacher[] teachers=new Teacher[n];
		for(int i=0;i<n;i++)
		{
			System.out.println(" ");
			System.out.println("Enter the details for the teacher :"+(i+1));
			System.out.print("EMPLOYYE ID :");
			int emp_id=sc.nextInt();
			sc.nextLine();
			System.out.print("NAME : ");
			String name=sc.nextLine();
			System.out.print("SALARY : ");
			double salary=sc.nextDouble();
			sc.nextLine();
			System.out.print("ADDRESS : ");
			String address=sc.nextLine();
			System.out.print("DEPARTMENT : ");
			String dept=sc.nextLine();
			System.out.print("SUBJECT TAUGHT (comma-separated): ");
			String subject=sc.nextLine();
			teachers[i]=new Teacher(emp_id,name,salary,address,dept,subject);
		}
		System.out.println(" ");
		System.out.println("---Teachers Details---");
		for(Teacher t:teachers){
		t.display();
		}
	}
}
				
