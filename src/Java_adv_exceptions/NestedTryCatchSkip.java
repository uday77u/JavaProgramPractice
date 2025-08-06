package Java_adv_exceptions;

public class NestedTryCatchSkip {
	public static void main(String[] args) {
		System.out.println("---1st line starts Excuting---");
		int []arr= {1,7,9};
		try 
		{
			System.out.println(arr[3]);
			try 
			{
				int a=17/0;
				System.out.println(a);
				
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Handled Arithmetic exception");
			}

		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Handled ArrayIOOBException the exception");
		}
		System.out.println("---last line is executed--");


	}


}
