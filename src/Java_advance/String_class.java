package Java_advance;

public class String_class {

	public static void main(String[] args) {
		System.out.println("without new operator");
		String s1="Hello";
		String s2="Hello";
		System.out.println("s1:\t"+s1);
		System.out.println("s2:\t"+s2);
		System.out.println("compare values(s1 & s2):\t"+s1.equals(s2)); 
		System.out.print("compare addresses(s1 & s2):\t");
		System.out.println(s1==s2);             
		
		s2="Hi";                           //s2 is assign new value
		System.out.println("\ns1:\t s2:");
		System.out.println(s1+"\t"+s2);   //s1 value is not changed (immutable) 
		
		System.out.println("\n with new operator");
		String sn1=new String("Hello");
		String sn2=new String("Hello");
		System.out.println("sn1:\t"+sn1);
		System.out.println("sn2:\t"+sn2);
		System.out.println("compare values(sn1 & sn2):\t"+sn1.equals(sn2));    
		System.out.print("compare addresses(sn1 & sn2):\t");
		System.out.println(sn1==sn2);
		
		sn2="Hi";
		System.out.println("\nsn1:\t sn2:");
		System.out.println(sn1+"\t"+sn2+"\n");  //sn1 value is not changed (immutable) 
		
		           
	}

}
