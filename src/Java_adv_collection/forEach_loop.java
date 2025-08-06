package Java_adv_collection;

import java.util.LinkedHashSet;

public class forEach_loop {

	public static void main(String[] args) {
		System.out.println("--forEach loop for array--");
		String []s= {"Hello","56","45.85","'w'"};
		for(String a:s) 
		{
			System.out.println(a);
		}
		
		System.out.println("\n--forEach loop for collections--");
		LinkedHashSet l = new LinkedHashSet();
		l.add(14);
		l.add(25.36);
		l.add("Hello");
		l.add('k');
		l.add(true);
		System.out.println("l:\t"+l);
		for(Object obj:l) 
		{
			System.out.println(obj);
		}

	}

}
