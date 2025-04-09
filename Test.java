interface interfaceOne{
	public void show();
}
interface interfaceTwo{
	public void display();
}
class A implements interfaceOne,interfaceTwo{
	public void show(){
		System.out.println("SHOWSOMETHING");
	}
	public void display()
	{
		System.out.println("DISPLAY SOMETHING");
	}
}
public class Test{
	public static void main(String[] args)
	{
		A a=new A();
		a.show();
		a.display();
	}
}
