package com.codemindB13;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx 
{
  public static void main(String args[])
  {
	  TreeSet<Integer> treeset = new TreeSet<Integer>();
	  treeset.add(10);
	  treeset.add(30);
	  treeset.add(10);
	  treeset.add(40);
	//  treeset.add(null);
	  Iterator<Integer> it = treeset.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
  }
}
