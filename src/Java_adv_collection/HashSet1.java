package Java_adv_collection;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("hello");
		h.add("hi");
		h.add(null);
		h.add(56);
		h.add(75.36);
		h.add(null);
		h.add(56);
		h.add(56);
		h.add(null);
		System.out.println("random output:\t\t"+h);
		System.out.println("\nduplicates(56 is duplicate value) are not allowed in hashset:\n"+h);
		if(h.contains(75.36)) 
		{
			System.out.println("\nh.contains(75.36):\t"+h.contains(75.36));
		}
		System.out.print("Objects/Elements of o using for each loop :\t");
		for(Object o:h)
		{
			System.out.print(" "+o);
		}

		
	}

}
