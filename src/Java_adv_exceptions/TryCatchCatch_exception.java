package Java_adv_exceptions;

public class TryCatchCatch_exception {

	public static void main(String[] args) {
		System.out.println("---1st line starts Excuting---");
		try 
		{
			System.out.println("---before exception statement in try---");
			int a=17/0;
			System.out.println(a);
			System.out.println("---after exception statement in try---");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Handled ArrayIOOBException the exception");
		}
		catch(Exception E) 
		{
			System.out.println("Default Exception Handler executed");
		}
		System.out.println("---last line is executed--");

}
}