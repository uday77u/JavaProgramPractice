package methodsInDiffClasses;

class Summation
{
	static void sumP(int a,int b)
	{
		System.out.println("addition of 2 numbers a="+a+" b="+b);
		int c=a+b;
		System.out.println("sum:"+c);
	}
	
}



public class MethodWParBwClass {
	public static void main(String[] args) {
		Summation.sumP(13, 80);
	}

}
