package Java_adv_collection;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Comparable> h= new TreeSet<Comparable>();
		h.add("Hello");
		h.add("hi");
		h.add("Hello");
		h.add("hi");
		h.add("end");
		System.out.println("treeSet not accept duplicates:\t"+h);
		System.out.println("\t//treeSet not accept 'null' and accepts only homogeneous type of data");
	}

}
