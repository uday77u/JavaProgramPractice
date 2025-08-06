package Java_adv_collection;

import java.util.Stack;

public class Array_stack {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.add("Hello");
		st.add(45);
		st.add('g');
		st.add(41.78);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());

	}

}

