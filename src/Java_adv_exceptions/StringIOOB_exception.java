package Java_adv_exceptions;

public class StringIOOB_exception {
	public static void main(String[] args) {
		System.out.println("---1st line starts Excuting---");
		String s= "Today";
		try 
		{
			System.out.println(s.charAt(5));
			
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("Handled StringIOOBException the exception");
		}
		System.out.println("---last line is executed--");

	}

}
