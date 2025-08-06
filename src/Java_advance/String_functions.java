package Java_advance;

public class String_functions {
public static void main(String[] args) {
	String s="Monday day";
	System.out.println(s);
	System.out.println("length:\t\t\t"+s.length());
	System.out.println("charAt(3):\t\t"+s.charAt(3));  
	System.out.println("indexOf('y'):\t\t"+s.indexOf('y')); 
	System.out.println("indexOf(3):\t\t"+s.indexOf(3));
	System.out.println("lastIndexOf('y'):\t"+s.lastIndexOf('y')+"\n");
	
	char arr[]=s.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]+":"+i);
	}
	System.out.println("\nsubstring(3):\t\t"+s.substring(3));
	System.out.println("substring(3, 8):\t"+s.substring(3, 8));
	System.out.println("subSequence(3, 8):\t"+s.subSequence(3, 8));
	
	System.out.println("\n toUpperCase():\t"+s.toUpperCase());
	System.out.println("toLowerCase():\t"+s.toLowerCase());
	System.out.println("contains(mon)\t"+s.contains("mon"));
	System.out.println("contains(Mon)\t"+s.contains("Mon"));
	System.out.println("concat(Special):\t"+s.concat(" Special"));
	
	String s1="monday day";
	System.out.println("\ns:"+s+"\ts1:"+s1);
	System.out.println("s.equals(s1):\t\t"+s.equals(s1));
	System.out.println("equalsIgnoreCase(s1):\t"+s.equalsIgnoreCase(s1));
	
}
}
