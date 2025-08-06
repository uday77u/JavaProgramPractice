package methods;

public class MethodWithParameter_Addition {
	static void sumP(int a,int b)
	{
		System.out.println("addition of 2 numbers a="+a+" b="+b);
		int c=a+b;
		System.out.println("sum:"+c);
	}
	public static void main(String[] args) {
		sumP(13,5);
		
	}

}
