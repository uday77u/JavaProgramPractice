package methodsInDiffClasses;
class Summation1
{
		static int sumR()
		{
			int a=5,b=8,sum=a+b;
			return sum;
		}
}	
	
public class MethodWReturnBwClass {
	public static void main(String[] args) {
		System.out.println(Summation1.sumR());
}

}
