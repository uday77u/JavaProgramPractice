package programs;

public class Prog3_Fibonacci10NumbersRangeUpto100usingForLoop {

	public static void main(String[] args) {
		System.out.println("Fibonacii 10 Numbers range of 100 using 'For loop' ");
		int a=0,b=1,c=0;
		System.out.print(c+"\t");
		for(int i=1;i<100;i++) {
			c=a+b;
			
			a=b;
			b=c;
			if(c>100)
				break;
			System.out.print(c+"\t");
		}
	}
}
