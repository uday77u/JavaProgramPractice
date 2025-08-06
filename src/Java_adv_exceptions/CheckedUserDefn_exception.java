package Java_adv_exceptions;

public class CheckedUserDefn_exception {
static void submit() throws  AccountRestriction
{

	int age=17;
	if(age>18)
	{
		System.out.println("application is submitted successfully");
	}
	else
	{
		throw new AccountRestriction("Invalid age");
	}
}
	public static void main(String[] args) {
		try 
		{
			submit();
		}
		catch( AccountRestriction a)
		{
			System.out.println(a.getmessage());
		}
 
	}

}
class  AccountRestriction extends Exception
{
	 String msg;
	 AccountRestriction(String msg)
	 {
		 
		 this.msg=msg;
	 }
	 public String getmessage()
	 {
		 
		 return msg;
	 }
}
