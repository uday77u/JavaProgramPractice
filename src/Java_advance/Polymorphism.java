package Java_advance;

class Animal
{
	void noise(){
		System.out.println("some noise");
	}
}
class Cat extends Animal
{
	void noise(){
		System.out.println("meow meow");
	}
}
class Dog extends Animal
{
	void noise(){
		System.out.println("bow bow");
	}
}
class Snake extends Animal
{
	void noise(){
		System.out.println("hiss hiss");
	}
}
class Single_pt{
	static void connector(Animal a){
		a.noise();
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		System.out.println("----single_pt_contact---");
		Cat c=new Cat();
		Dog d = new Dog();
		Snake s = new Snake();
		Single_pt.connector(c);
		Single_pt.connector(d);
		Single_pt.connector(s);
		
		System.out.println("\n----internal actions of polymorphism or upcasting----");
		Animal a1=new Cat();
		Animal a2=new Dog();
		Animal a3=new Snake();
		a1.noise();
		a2.noise();
		a3.noise();
		
		System.out.println("\nhomogemeous object creation");
		Cat c2=new Cat();
		Dog d2 = new Dog();
		Snake s2 = new Snake();
		c2.noise();
		d2.noise();
		s2.noise();
		
	}
}


