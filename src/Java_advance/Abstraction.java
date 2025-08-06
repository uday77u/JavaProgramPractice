package Java_advance;
interface Animal_intrfc
{
	void noise();
	
}
class CatI implements Animal_intrfc
{
	public void noise(){
		System.out.println("meow meow");
	}
}
class DogI implements Animal_intrfc
{
	public void noise(){
		System.out.println("bow bow");
	}
}
class SnakeI implements Animal_intrfc
{
	public void noise(){
		System.out.println("hiss hiss");
	}
}
class Single_ptI{
	static void connectorI(Animal_intrfc a){
		a.noise();
	}
}


public class Abstraction {

	public static void main(String[] args) {
		System.out.println("----single_pt_contact---");
		CatI c=new CatI();
		DogI d = new DogI();
		SnakeI s = new SnakeI();
		Single_ptI.connectorI(c);
		Single_ptI.connectorI(d);
		Single_ptI.connectorI(s);

	}

}
