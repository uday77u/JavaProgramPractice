package Java_advance;

class Messanger{
	void send(int a)
	{
		System.out.println("send number\t\t-->"+a);
	}
	void send(String b)
	{
		System.out.println("send msg\t\t-->"+b);
	}
	void send(int a,String b)
	{
		System.out.println("send number and msg\t-->"+a+"\t"+b);
	}
	void send(String a,int b)
	{
		System.out.println("send msg and number\t-->"+a+"\t"+b);
	}
}

public class Method_overloading {

	public static void main(String[] args) {
		Messanger fb = new Messanger();
		fb.send(85);
		fb.send(null);
		fb.send(77, "hello");
		fb.send("hi", 14);

	}

}
