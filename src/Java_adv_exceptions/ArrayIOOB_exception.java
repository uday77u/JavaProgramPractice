package Java_adv_exceptions;

public class ArrayIOOB_exception {
	public static void main(String[] args) {
		System.out.println("---1st line starts Excuting---");
		int []arr= {1,7,9};
		try 
		{
			System.out.println(arr[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Handled ArrayIOOBExceptionkk the exception");
		}
		System.out.println("---last line is executed--");


	}
}
