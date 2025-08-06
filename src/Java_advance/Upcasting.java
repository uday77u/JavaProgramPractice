package Java_advance;

class super_class
{
	int spv=10;
	void super_property()
	{
		System.out.println("SUPER_class_Method");
	}
	void Sample()
	{
		System.out.println("Same name(Sample) --SuperMethod");
		
	}
}

class sub_class extends super_class
{
	int sbv=20;
	void sub_Property()
	{
		System.out.println("SUB_class_Method");
	}	
	void Sample()
	{
		System.out.println("Same name(Sample)  --Sub-Method executed");
		
	}
}

public class Upcasting {
	public static void main(String[] args) 
	{
		System.out.println("-----Class Upcasting--------");
		 super_class up = new sub_class();
		 up.super_property();
		 System.out.println("super_class variable\t"+up.spv);
		 up.Sample();
		 
		System.out.println("\n-----Class Downcasting-------");
		 sub_class dn = (sub_class) up;
		 dn.super_property();
		 dn.sub_Property();
		 System.out.println("super_class variable\t"+dn.spv);
		 System.out.println("sub_class variable\t"+dn.sbv);	
		 dn.Sample();
		 
		 System.out.println("\n-----normal homogenious object creation-------");
		 sub_class normal = new sub_class();
		 normal.sub_Property();
		 normal.super_property();
		 System.out.println("super_class variable\t"+normal.spv);
		 System.out.println("sub_class variable\t"+normal.sbv);
		 normal.Sample();
		 		
	}

}
