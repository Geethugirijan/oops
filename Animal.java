class Ani
{
	String name;
	void makeSound()
	{
		System.out.println("some Genetic sound");
	}
}
class Dog extends Ani{
	void bark()
	{
		System.out.println(name+" says: WOOF! WOOF!");
	}
}
public class Animal
{
	public static void main(String[] args)
	{
		Dog D1=new Dog();
		D1.name="Buddy";
		D1.makeSound();
		D1.bark();
	}
}
