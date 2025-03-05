public class Product
{
	String pcode;
	String pname;
	int price;
	public Product(String pcode,String pname,int price)
	{
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public static void findLowest(Product[] products)
	{
		Product minProduct=products[0];
		for(Product p:products)
		{
			if(p.price<minProduct.price)
			{
				minProduct=p;
			}
		}
		System.out.println("Lowest priced product ID is :"+minProduct.pcode);
	}
	public static void main(String[] args)
	{
		Product[] products={
		new Product("A123","TV",200),new Product("B123","RADIO",2100),new Product("C123","DVD",300)
		};
		findLowest(products);
	}
	
}
