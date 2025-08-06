package Java_advance;
interface intrfc1
{
	void disp1();
}
interface intrfc2
{
	void disp2();
}
class implemClass implements intrfc1,intrfc2
{
	public void disp1()
	{
		System.out.println("Interface1 disp1():properties\n");
	}
	public void disp2() 
	{
		System.out.println("Interface2 disp2():properties\n");
	}
}
public class diamond_problem extends implemClass
{

	public static void main(String[] args) 
	{
	    implemClass f1 = new implemClass();
		f1.disp1();
		f1.disp2();
	}

}
