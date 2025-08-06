package Core_javaConcepts;

public class Variable_shadowing {

	int a=16; //global variable
	
	void disp(int a)
	{
		System.out.println("Local a:"+a);     //displays local variable
		
		System.out.println("global variable:"+this.a); //displays global variable
	}
	public static void main(String[] args) {
		Variable_shadowing m = new Variable_shadowing();
		m.disp(14); 

	}

}
