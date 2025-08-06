package Constructor_concept;

public class Constructor_overloading {
	Constructor_overloading(int i,String s)
	{
		System.out.println("Integer value:\t "+i+"\nString Value:\t"+s+"\n");
	}
	Constructor_overloading(String s,int i)
	{
		System.out.println("String Value:\t"+s+"\nInteger value:\t"+i+"\n");
	}
	Constructor_overloading(int i)
	{
		System.out.println("Only Integer value:\t"+i+"\n");
	}
	Constructor_overloading(String s)
	{
		System.out.println("Only String Value:\t"+s+"\n");
	}
	Constructor_overloading() 
	{
		System.out.println("No parameters passed\n");
	}
	public static void main(String[] args) {
		
		System.out.println("--Constructor_overloading--");
		new Constructor_overloading("Hello", 123);
		new Constructor_overloading(56);
		new Constructor_overloading("Hello");
		new Constructor_overloading();
		new Constructor_overloading(456,"Bye");
	}
	}

