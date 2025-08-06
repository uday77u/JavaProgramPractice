package programs;

import java.util.Scanner;

public class Prog2_FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Find the factorial of the number");
		System.out.print("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is:"+fact);
		sc.close();
	}
}
