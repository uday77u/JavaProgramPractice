package programs;

public class Prog4_Fibonacci10NumbersRangeUpto100usingWhileLoop {
	public static void main(String[] args) {
		System.out.println("Fibonacii 10 Numbers range of 100 using 'While loop' ");
		int a=0,b=1,c=0;
		System.out.print(c+"\t");
		int i=1;
		while(i<100) {
			c=a+b;
			
			a=b;
			b=c;
			if(c>100)
				break;
			System.out.print(c+"\t");
			i++;
		}
		
	}
	
}
