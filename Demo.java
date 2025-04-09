class Mobile{
	String brand;
	int price;
	static String name;
	public void show()
	{
		System.out.println(brand +":"+ name +":"+ price);
	}
}
public class Demo{
	public static void main(String[] args)
	{
		Mobile obj1= new Mobile();
		obj1.brand="APPLE";
		obj1.price=50000;
		Mobile.name="SMART PHONE";
		Mobile obj2= new Mobile();
		obj2.brand="SAMSUNG";
		obj2.price=45000;
		Mobile.name="SMART PHONE";
		obj1.show();
		obj2.show();
	}
}
