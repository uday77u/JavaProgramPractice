package Java_adv_exceptions;

public class NullPointer_exception {

	public static void main(String[] args) {
		System.out.println("---1st line starts Excuting---");
		NullPointer_exception np=new NullPointer_exception();
		np=null;
		try 
		{
			System.out.println(np.hashCode());
			
		}
		catch(NullPointerException e) 
		{
			System.out.println("Handled NullPointer_exception the exception");
		}
		System.out.println("---last line is executed--");

	}

}
