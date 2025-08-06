package Java_adv_collection;

import java.util.ArrayList;
import java.util.List;

class Array {
static List<Integer> arlist ( int [ ] acc ) {
List<Integer> l1 = new ArrayList<Integer>();
l1.add(acc [0]);
l1.add(acc [1]);
l1.add(acc [2]);
return l1;
} }

public class Array_listArrayToList 
{

	public static void main(String [] args) 
	{
		int []abb = {10,20 ,30};
		System.out.println(Array.arlist (abb));    //not getting 
		//List l2 = arlist(); 

	}

}
