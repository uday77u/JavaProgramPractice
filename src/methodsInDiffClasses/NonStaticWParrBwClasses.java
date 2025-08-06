package methodsInDiffClasses;

class SummationP
{
	public void sumP(int a,int b)
	{
		System.out.println("addition of 2 numbers a="+a+" b="+b);
		int c=a+b;
		System.out.println("sum:"+c);
	}	
}

public class NonStaticWParrBwClasses {
	public static void main(String[] args) {
		SummationP m= new SummationP();
		m.sumP(4,8);

}
}