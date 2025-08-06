package Java_adv_exceptions;

public class StackWinding_exception {
	static void disp4() 
	{
		System.out.println(1/0);
	}
	static void disp3() 
	{
		disp4();
	}	
	static void disp2() 
	{
		disp3();
	}
	static void disp1() 
{
	disp2();
}
	public static void main(String[] args) {
		try 
		{
			disp1();
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception is handled in main()");
			e.printStackTrace();
		}
	}

}
