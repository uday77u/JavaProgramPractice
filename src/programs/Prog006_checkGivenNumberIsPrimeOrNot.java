package programs;

public class Prog006_checkGivenNumberIsPrimeOrNot {
	public static void main(String[] args) {
		//to check given number is prime or not
		int num=10;
		boolean flag=false;
		System.out.println("Enter the number to ckeck prime or not:");
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
				System.out.println(num+" is'Not Prime'");
				break;
			}
			else {
				flag=false;
				System.out.println(num+"is 'Prime'");
			}
				
			}
		}
	
		

}
