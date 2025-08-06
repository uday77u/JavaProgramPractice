package programs;

import java.util.Scanner;

public class Prog1_EvenOddNumber {

	public static void main(String[] args) {
		System.out.println("Program for find even or odd number");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		
		/*if(num%2==0)
			System.out.println(num+" is Even");
		else
			System.out.println(num+" is Odd");
			*/
		System.out.println(num%2==0?num+" is Even":num+" is Odd");//Tertiary operator
		sc.close();
		

	}

}
