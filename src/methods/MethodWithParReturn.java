package methods;

public class MethodWithParReturn {
	static int sumPR(int a,int b)
	{
		System.out.println("addition of 2 numbers a="+a+" b="+b);
		int c=a+b;
		return c;	
	}
	
public static void main(String[] args) {
		int a=sumPR(6,8);
		System.out.println(a);

	}

}
