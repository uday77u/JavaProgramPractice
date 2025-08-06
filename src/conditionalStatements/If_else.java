package conditionalStatements;

public class If_else {

	public static void main(String[] args) {
		System.out.println("-- if-else statement example--\n");
		
		int MarksScored=72;
		if(MarksScored<35)
		{
			System.out.println(MarksScored+" is less than 35\nResult:Fail");
		}
		else
		{
			System.out.println(MarksScored+" is more than 35\nResult:Pass");
		}
	}

}
