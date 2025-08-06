package Java_adv_collection;

import java.util.ArrayList;

public class ArrayList_Generic {

	public static void main(String[] args) {
		System.out.println("generics(restrict the collection to store homogeneous data) \t");
		ArrayList<Float> l1=new ArrayList<Float>();
		l1.add(7.2f);
		l1.add(10.2f);
		l1.add(5.0f);
		l1.add(23.5f);
		l1.add(9.8f);
		l1.add(12.0f);
		l1.add(12.0f);
		System.out.println("l1=\t\t"+l1);
	}

}
