package com.codemindB13;

import java.util.ArrayList;

public class ArrayListExample
{
 public static void main(String args[])
  {
	// ArrayList arraylist = new ArrayList();
	 ArrayList<Integer> arraylist = new ArrayList<Integer>();  //generalization'
	 
	 arraylist.add(10);
	 arraylist.add(20);
	 arraylist.add(30);
	 arraylist.add(40);
	 arraylist.add(10);
	 
	 
	 for(Object o : arraylist)
	 {
		 System.out.println(o);
	 }
			 
		System.out.println("Changes are done"); 
			 
 }
}
