package Java_adv_collection;

import java.util.Vector;

public class Array_vectorList {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("abcd");
		v1.add(12);
		v1.add(null);
		v1.add(125.78);
		v1.add('a');
		v1.add(12);
		for(int i=1;i<=10;i++)
		{
			v1.add(i);
			//v1.add('a'+i);
		}	
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
	}
}