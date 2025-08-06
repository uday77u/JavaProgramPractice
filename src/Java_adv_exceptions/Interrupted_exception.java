package Java_adv_exceptions;

public class Interrupted_exception {

	public static void main(String[] args) 
	{

		for(int i=1;i<=10;i++) 
		{
			System.out.print(" "+i);
		
		    try
		     {
			Thread.sleep(2000);
		     }
		    catch(InterruptedException z) 
		     {
			
		     }
		}
	}

}
