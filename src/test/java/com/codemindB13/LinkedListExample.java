package com.codemindB13;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class LinkedListExample 
{
 public static void main(String args[])
 {
	 LinkedList<Integer> linkedlist= new LinkedList<Integer>();
	 linkedlist.add(20);
	 linkedlist.add(25);
	 linkedlist.add(50);
	 linkedlist.add(20);
	 linkedlist.add(40);
	 linkedlist.add(30);
	 linkedlist.add(null);
	 for(Integer i : linkedlist)
	 {
		 System.out.println(i);
	 }
 }
}
