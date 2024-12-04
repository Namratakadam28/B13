package com.codemindB13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetEx 
{
 public static void main(String args[])
 {
	 LinkedHashSet<Integer> linkedhash = new LinkedHashSet<Integer>();
	 linkedhash.add(100);
	 linkedhash.add(20);
	 linkedhash.add(30);
	 linkedhash.add(100);
	 linkedhash.add(null);
	 
 Iterator<Integer> it = linkedhash.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	 
	   ArrayList<Integer> linkedhash2 = new ArrayList<Integer>();
	   linkedhash2.add(40);
	   linkedhash2.add(50);
	   linkedhash2.add(30);
	   linkedhash2.add(40);
	   linkedhash2.add(45);
	   linkedhash2.add(25);
	   
	 System.out.println("Adding all elements of arraylist 2 to  linkedhash :");
	  linkedhash .addAll(linkedhash2);
	
	 System.out.println("*******************************************"); 
	 System.out.println("linkedhash contains element 20:"+linkedhash.contains(20));
	 System.out.println("linkedhash contains element 30:"+linkedhash.contains(30));
	 System.out.println("linkedhash contains element 30:"+linkedhash2 .contains(30));
	 
	 System.out.println("linkedhash contains all element of linkedhash2:"+linkedhash.containsAll(linkedhash2));
	 
	 System.out.println("********************************************");
	// System.out.println("getting elements of linkedhash of index value 3:"+linkedhash.get(3));
	//it will give exception // System.out.println("getting out of bound value:"+linkedhash.get(10));
	 System.out.println("**********************************************");
	 
	 System.out.println("Index of 40:"+linkedhash2.indexOf(40));
	// System.out.println("Index of 40:"+linkedhash.indexOf(40));
	 
	 System.out.println("*******************************************");
	 System.out.println("to check if arraylist 2 is empty:"+linkedhash2.isEmpty());
	 System.out.println("to check if arraylist 2 is empty:"+linkedhash.isEmpty());
	 
	 System.out.println("********************************************");
	 System.out.println("total size of arraylist:"+linkedhash.size());
	 System.out.println("total size of arraylist:"+linkedhash2.size());
	 
	 System.out.println("*********************************************");
	 List<Integer> linkedhash3 = linkedhash2.subList(2, 5);
         for (Integer a : linkedhash3) 
		{
			System.out.println(a);
		}
		System.out.println("******************************************");
		System.out.println("Adding element in the arraylist:");
		linkedhash.set(3,50);
		for (Integer a : linkedhash) 
		{
			System.out.println(a);
		}
		System.out.println("Removing element from arraylist:");
		linkedhash2.remove(2);
		for (Integer a : linkedhash2) 
		{
			System.out.println(a);
		}
		System.out.println("*******************************************");
		System.out.println("By using iterator:");
		Iterator<Integer> iterator_1 = linkedhash2.iterator();
		while(iterator_1.hasNext())
		{
			System.out.println(iterator_1.next());
		}
 }
}
