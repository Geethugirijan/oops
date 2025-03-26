class Product
{	 
	String pname;
	String pcode;
	int price;
	Product(String a,String b,int c)
	{
		pname=a;
		pcode=b;
		price=c;
	}
	void display()
	{
		System.out.println("product name:"+pname);
		System.out.println("product id:"+pcode);
		System.out.println("product price:"+price);
	}
	void findLowest(Product p1,Product p2,Product p3)
	{
		Product lowest=p1;
		if(p2.price<lowest.price)
		{
			lowest=p2;
		}
		if(p3.price<lowest.price)
		{
			lowest=p3;
		}
		System.out.println("product with lowest price");
		System.out.println("product name:"+pname);
		System.out.println("product id:"+pcode);
		System.out.println("product price:"+price);					
	}
}	
class Productdemo
{ 
	public static void main(String[] args)
	{
		Product obj1=new Product("a123","tv",4000);
		Product obj2=new Product("b123","ac",5000);
		Product obj3=new Product("c123","fan",4500);
		obj1.display();
		obj2.display();
		obj3.display();
		obj1.findLowest(obj1,obj2,obj3);
	}
}

