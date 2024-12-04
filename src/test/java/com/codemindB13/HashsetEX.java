package com.codemindB13;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class HashsetEX 
{
 public static void main(String args[])
 {
	 HashSet<Integer> hashset = new HashSet<Integer>();
	 hashset.add(10);
	 hashset.add(20);
	 hashset.add(30);
	 hashset.add(10);
	 hashset.add(null);
	 
	 Iterator<Integer> it = hashset.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 
	 
	 
 }
}
