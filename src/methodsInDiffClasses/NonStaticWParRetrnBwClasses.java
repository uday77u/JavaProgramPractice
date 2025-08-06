package methodsInDiffClasses;
class SummationWPR
{
	int sumPR(int a,int b)
	{
		System.out.println("addition of 2 numbers a="+a+" b="+b);
		int c=a+b;
		return c;	
	}
}


public class NonStaticWParRetrnBwClasses {
	public static void main(String[] args) {
		SummationWPR m = new SummationWPR();
		System.out.println(m.sumPR(41, 53));
	}

}
