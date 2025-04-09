public class Method{
	public static void greet(){
		System.out.println("Welcome!");
	}
	public void sayhello()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args){
		Method.greet();
		Method obj=new Method();
		obj.sayhello();
	}
}

