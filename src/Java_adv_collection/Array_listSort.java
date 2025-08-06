package Java_adv_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_listSort {
	public static void main(String[] args) {
		System.out.println("sort using collection class\t");
		ArrayList<Double> l1=new ArrayList<Double>();
		System.out.println("--1.add(object obj)--");
		l1.add(7.2);
		l1.add(10.2);
		l1.add(5.0);
		l1.add(23.5);
		l1.add(9.8);
		l1.add(12.0);
		l1.add(12.0);
		System.out.println("l1=\t\t"+l1);
		Collections.sort(l1);            //list elements must be same data type;
		System.out.println("sorted l1=\t"+l1);
		
System.out.println("\n---sort using Array class---");
int []arr= {12,87,9,45};
System.out.println("array elements:");
for(int a:arr)
{
	System.out.print(a+" ");
}
System.out.println("\n\nsorted array elements:");
Arrays.sort(arr);
for(int a:arr)
{
	System.out.print(a+" ");
}
		}
	}

