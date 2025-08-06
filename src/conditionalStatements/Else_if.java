package conditionalStatements;

public class Else_if {

	public static void main(String[] args) {
		System.out.println("-- elseif statement example--");
		int MarksScored=45;
		if(MarksScored<35 && MarksScored<100 && MarksScored>=0)
		{
			System.out.println("MarksScored:"+MarksScored+" is less than 35\nFail");
		}
		else if(MarksScored>35 && MarksScored<100 && MarksScored>=0)
		{
			System.out.println("MarksScored:"+MarksScored+" is more than 35\nPASS")	;
		}
		else
		{
			System.out.println("MarksScored:"+MarksScored+" marks are invalid\n");
		}

	}

}
