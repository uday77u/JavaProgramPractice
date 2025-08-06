package methodsInDiffClasses;
class SummationWR
{
	int sumR()
	{
		int a=5,b=8,sum=a+b;
		return sum;
	}
}

public class NonStaticWRetrnBwClasses {
	public static void main(String[] args) {
		SummationWR v = new SummationWR();
		System.out.println(v.sumR());
	}
}
