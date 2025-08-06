package Java_adv_collection;

import java.util.ArrayList;

public class Array_listGet {

	public static void main(String[] args) {
		ArrayList<Comparable> l1=new ArrayList<Comparable>();
		l1.add(7);
		l1.add("sunday");
		l1.add('m');
		l1.add(23.3);
		l1.add(true);
		
		System.out.println("Print ArrayList elements");
		for(int i=0;i<l1.size();i++)
		{
		System.out.print(" "+l1.get(i));
		}
		
		int arr[]= {10,20,30,40};
		System.out.println("\n\nPrint Array elements");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("\n\nPrint String elements");
		String s="hello";
		for(int i=0;i<s.length();i++) 
		{
			System.out.print(" "+s.charAt(i));
		}
	}

}
