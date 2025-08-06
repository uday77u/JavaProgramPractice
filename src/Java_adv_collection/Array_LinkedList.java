package Java_adv_collection;

import java.util.LinkedList;

public class Array_LinkedList {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("hello");
		l1.add('a');
		l1.add(null);
		l1.add(12);
		l1.add(45.78);
		l1.add("end");
		l1.add(12);
		System.out.println(l1);
		System.out.println("l1.get(2):\t"+l1.get(2));
		System.out.println("l1.peek:\t"+l1.peek());
		System.out.println("l1.poll()\t"+l1.poll());
	}

}
