package Core_javaConcepts;

public class Variables {
	
	//---------------Global Variables------------------
	static int g1=12;    //with initialization
	int g2;              //without initialization
	static int arr[];
	char g3;
	static char g4;
	
	public static void main(String[] args) {
		
	//---------------Local Variables------------------

		byte a=5,b=12;
		short s=45;
		int i=a+b;
		long l=7;
		float f=1.2f;
		double d=1.5;
		double d1=f+d;
		char c='4';
		char c1='u';
		String st = "Hello";
		
		System.out.println("a+b:"+a+b);
		System.out.println("i:"+i);
		System.out.println("f:"+f+" d:"+d+" d1"+d1);
		System.out.println(s);
		System.out.println(d1);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(st);
		
		System.out.println("\n---global variables---");
		System.out.println(g1);
		
		Variables v = new Variables();
		System.out.println(v.g2);
		System.out.println(arr);
		
		System.out.println(v.g3); //no output
		System.out.println(g4);
	}

}
