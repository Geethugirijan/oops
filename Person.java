class Pers{
	String name;
	int phone;
	public void Showaddress(){
		System.out.println("Name:"+name);
		System.out.println("phone"+phone);
		System.out.println(" ");
	}
}
class Teacher extends Pers
{
}
class Students extends Pers
{
}
class Staff extends Pers
{
}
public class Person
{
	public static void main(String[] args)
	{
		Teacher t1= new Teacher();
		t1.name="john";
		t1.phone=2496;
		System.out.println("TEACHER");
		t1.Showaddress();
		Students s1= new Students();
		s1.name="abhi";
		s1.phone=6547;
		System.out.println("STUDENT");
		s1.Showaddress();
		Staff st1=new Staff();
		st1.name="arun";
		st1.phone=4564;
		System.out.println("STAFF");
		st1.Showaddress();
		
	}
}
