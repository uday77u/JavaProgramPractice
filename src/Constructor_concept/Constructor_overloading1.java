package Constructor_concept;

public class Constructor_overloading1 {

		Constructor_overloading1(int id,String name)
		{
														//how to use 'this' keyword in constructor
			System.out.println("Id:\t "+id+"\nname:\t"+name+"\n");
		}
		Constructor_overloading1(String name,int id)
		{
			this(52,"pqr");
			System.out.println("name:\t"+name+"\nid:\t"+id+"\n");
		}
		Constructor_overloading1(int i)
		{
			this("xyz",56);
			System.out.println("Only id:\t"+i+"\n");
		}
		Constructor_overloading1(String s)
		{
			this(12);
			System.out.println("Only name:\t"+s+"\n");
		}
		Constructor_overloading1() 
		{
			this("abcd");
			System.out.println("No parameters passed\n");
		}
		public static void main(String[] args) {
			
			System.out.println("--Constructor_overloading--");
			//new Constructor_overloading1("Hello", 123);
			//new Constructor_overloading1(56);
			//new Constructor_overloading1("Hello");
			new Constructor_overloading1();
			//new Constructor_overloading1(456,"Bye");
		}

}
