package programs;

import java.util.Scanner;

public class Prog5_PrimeNumber {

	public static void main(String[] args) {
		//find number is prime or not
		System.out.print("Enter number is:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		int count=0;
		for(int i=num;i>1;i--) {
			if(num%i==0)
				count++;
		}
		if(count>1)
			System.out.println(num+" is composit Number");
		else if (count==0) 
			System.out.println(num+" is nether be prime Number nor be composit ");
		else
			System.out.println(num+" is prime Number");
	}
}

/*Improved alternate logic for optimized looping
 * package programs;

import java.util.Scanner;

public class Prog5_PrimeNumber {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num <= 1) {
			System.out.println(num + " is neither prime nor composite.");
		} else {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " is a composite number.");
		}
	}
}

 * */

