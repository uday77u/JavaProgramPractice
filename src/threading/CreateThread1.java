package threading;
class Samp1 extends Thread
{
	public void run() 
	{
		System.out.println("--samp1 run() get executed");	
	}
}

class Samp2 extends Thread
{
	public void run() 
	{
		System.out.println("\n--samp2 run() get executed ");
	}
}

public class CreateThread1 {

	public static void main(String[] args) {
		Samp1 s1=new Samp1();
		Thread t1 = new Thread(s1);
		t1.start();
		
		Samp2 s2=new Samp2();
		Thread t2 = new Thread(s2);
		t2.start();
	}

}
