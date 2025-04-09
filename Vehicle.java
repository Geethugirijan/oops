class Vehi
{
	String name;
	String color;
	void horn()
	{
		System.out.println("HONK HONK");
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
		}
}
class Car extends Vehi{
	void beep()
	{
		System.out.print(name+"'s horn sound is ");
	}	
}
public class Vehicle
{
	public static void main(String[] args)
	{
		Car c1= new Car();
		c1.name="BMW";
		c1.color="black";
		c1.display();
		c1.beep();
		c1.horn();
	}
}


