package Java_adv_collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add("hello");
		h.add("hi");
		h.add(null);
		h.add(56);
		h.add(75.36);
		h.add(null);
		h.add(56);
		h.add(56);
		h.add(null);
		h.add("bye");
		System.out.println(h);

	}

}
