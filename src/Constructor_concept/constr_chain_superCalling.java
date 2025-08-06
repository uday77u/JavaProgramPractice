package Constructor_concept;
class a1
{
	a1(String name,int id)
	{
		System.out.println("m1");
		System.out.println("name: "+name+"\tid: "+id);
	}
}
class a2 extends a1
{
	a2(int id,String name)
	{
		super("hello",7);
		System.out.println("\nm2");
		System.out.println("id: "+id+"\tname: "+name);
	}
}
class a3 extends a2
{
	a3(String name)
	{
		super(6,"hi");
		System.out.println("\nm3");
		System.out.println("name: "+name);
	}
}
class a4 extends a3
{
	a4(int id)
	{
		super("hello");
		System.out.println("\nm4");
		System.out.println("id: "+id);
	}
}
class a5 extends a4
{
	a5()
	{
		super(56);
		System.out.println("\nm4");
		System.out.println("no parameter is passed(default constructor)");
	}
}
public class constr_chain_superCalling extends a5
{

	public static void main(String[] args) {

		new a5();
	}

}
