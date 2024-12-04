package com.codemindB13;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionFrameworkMethods 
{
   public static void main(String args[])
   {
	   ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
	   arraylist1.add(10);
	   arraylist1.add(20);
	   
	   ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
	   arraylist2.add(40);
	   arraylist2.add(50);
	   arraylist2.add(30);
	   arraylist2.add(40);
	   arraylist2.add(45);
	   
	   arraylist2.add(25);
	   
	   System.out.println("Adding all elements of arraylist 2 to arraylist1:");
	   arraylist1.addAll(arraylist2);
	
	  for(int i=0;i<arraylist1.size();i++)
	//   for(Integer i : arraylist1)
	   {
		  System.out.println(arraylist1.get(i));
	   }
	   
	  
	 System.out.println("*******************************************"); 
	 System.out.println("arraylist1 contains element 20:"+arraylist1.contains(20));
	 System.out.println("arraylist1 contains element 30:"+arraylist1.contains(30));
	 System.out.println("arraylist1 contains element 30:"+arraylist2 .contains(30));
	 
	 System.out.println("arraylist1 contains all element of arraylist2:"+arraylist1.containsAll(arraylist2));
	 
	 System.out.println("********************************************");
	 System.out.println("getting elements of arraylist1 of index value 3:"+arraylist1.get(3));
	//it will give exception // System.out.println("getting out of bound value:"+arraylist1.get(10));
	 System.out.println("**********************************************");
	 
	 System.out.println("Index of 40:"+arraylist2.indexOf(40));
	 System.out.println("Index of 40:"+arraylist1.indexOf(40));
	 
	 System.out.println("*******************************************");
	 System.out.println("to check if arraylist 2 is empty:"+arraylist2.isEmpty());
	 System.out.println("to check if arraylist 2 is empty:"+arraylist1.isEmpty());
	 
	 System.out.println("********************************************");
	 System.out.println("total size of arraylist:"+arraylist1.size());
	 System.out.println("total size of arraylist:"+arraylist2.size());
	 
	 System.out.println("*********************************************");
	 List<Integer> arrayList3 = arraylist2.subList(2, 5);
         for (Integer a : arrayList3) 
		{
			System.out.println(a);
		}
		System.out.println("******************************************");
		System.out.println("Adding element in the arraylist:");
		arraylist1.set(3,50);
		for (Integer a : arraylist1) 
		{
			System.out.println(a);
		}
		System.out.println("Removing element from arraylist:");
		arraylist2.remove(2);
		for (Integer a : arraylist2) 
		{
			System.out.println(a);
		}
		System.out.println("*******************************************");
		System.out.println("By using iterator:");
		Iterator<Integer> iterator_1 = arraylist2.iterator();
		while(iterator_1.hasNext())
		{
			System.out.println(iterator_1.next());
		}
 }
}