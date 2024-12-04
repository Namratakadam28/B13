package com.codemindB13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class IteratorExample 
{
 public static void main(String args[])
 {
	 ArrayList<Integer> it = new ArrayList();
	 it.add(10);
	 it.add(20);
	 it.add(40);
	 it.add(50);
	 it.add(70);
	 it.add(80);
	 Iterator<Integer> iterator_1 = it.iterator();
	 while(iterator_1.hasNext())
	 {
		 System.out.println(iterator_1.next());
	 }
 }
}
