package Java_adv_collection;

import java.util.ArrayList;

public class Array_list_class {

	public static void main(String[] args) {
		ArrayList<Comparable> l1=new ArrayList<Comparable>();
		System.out.println("--1.add(object obj)--");
		l1.add(7);
		l1.add("sunday");
		l1.add('m');
		l1.add(23.3);
		l1.add(true);
		System.out.println("l1=\t"+l1);
		
		System.out.println("\n--2.add(int Index,object obj)--\tadd(2,\"Hello\")");
		l1.add(2,"Hello");
		System.out.println("l1=\t"+l1);
		ArrayList<Comparable> l2=new ArrayList<Comparable>();
		l2.add("l2_start");
		l2.add(7);
		l2.add("monday");
		l2.add(23);
		
		System.out.println("\n--3.addAll(collection c)--\tl1.addAll(l2)");
		System.out.println("l1=\t"+l1);
		System.out.println("l2=\t"+l2);
		l1.addAll(l2);
		System.out.println("after l1.addAll(l2)--l1=\t"+l1);
		System.out.println("after l1.addAll(l2)--l2=\t"+l2);
		
		System.out.println("\n--4.addAll(int Index,collection c)--\tl1.addAll(2,l2)");
		l1.addAll(2,l2);
		System.out.println("after l1.addAll(2,l2)--l1=\t"+l1);
		System.out.println("after l1.addAll(2,l2)--l2=\t"+l2);
		
		System.out.println("\n--5.removeAll(collection c)--\tl1.removeAll(l2)\t(Remove duplicates)");
		l1.removeAll(l2);
		System.out.println("after l1.removeAll(2,l2)--l1=\t"+l1);
		System.out.println("after l1.removeAll(2,l2)--l2=\t"+l2);
		
		System.out.println("\n--6.retainAll(collection c)--\tl1.retainAll(l2)\t(Remove unique values)");
		l1.retainAll(l2);
		System.out.println("after l1.retainAll(2,l2)--l1=\t"+l1);
		System.out.println("after l1.retainAll(2,l2)--l2=\t"+l2);
		
		l1.add(7);
		l1.add("sunday");
		l1.add('m');
		l1.add(23.3);
		l1.add(true);
		l1.add("extra");
		System.out.println("\nl1=\t"+l1);
		System.out.println("l2=\t"+l2);
		
		System.out.println("\n--7.remove(object obj)--\tl1.remove(\"extra\")");
		l1.remove("extra");            //doubt-- how to remove number in l1 it takes as index
		System.out.println("l1=\t"+l1);
		
		System.out.println("\n--8.remove(int Index)--\tl1.remove(1)");    
		l1.remove(1);
		System.out.println("l1=\t"+l1);
		
		System.out.println("\n--9.contains(object obj)--");
		System.out.println("contains(7) in l1:\t"+l1.contains(7));
		
		System.out.println("\n--10.get(int index)--");
		System.out.println("get(int index) in l1--> l1.get(15):\t"+l1.get(3)); //doubt--how it works
		
		System.out.println("\n--11.l1.size()--");
		System.out.println("size of l1:\t"+l1.size()); 
	}

}
