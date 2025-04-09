abstract class Main{
	abstract void sound();
	void eat(){
		System.out.println("Eating.........");
	}
}
class Dog extends Main{
	void sound(){
		System.out.println("Bark");
	}
}
public class Absani{
	public static void main(String[] args){
		Dog d=new Dog();
		d.sound();
		d.eat();
	}
}
