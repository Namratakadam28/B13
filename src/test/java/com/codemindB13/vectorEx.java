package com.codemindB13;
import java.util.Vector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class vectorEx 
{
	public static void main(String args[])
	{
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(15);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(null);
		for(Integer i : v)
			
		{
			System.out.println(i);
		}
	}

}
