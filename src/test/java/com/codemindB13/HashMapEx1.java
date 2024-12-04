package com.codemindB13;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 
{
	 public static void main(String[] args) 
	 {
		 HashMap<String , Integer> hashmap = new HashMap<String , Integer>();
		 hashmap.put("sunil", 25);
		 hashmap.put("anil", 27);
		 hashmap.put("amit", 26);
		 hashmap.put("abhira", 28);
		 
		// System.out.println(hashmap);
		 
		 //to access key's
		 for(Map.Entry<String, Integer> me : hashmap.entrySet())
		 {
			 System.out.println(me.getKey());
		 }
		 
		 //to acces values
		 
		 //to access key's
		 for(Map.Entry<String, Integer> me : hashmap.entrySet())
		 {
			 System.out.println(me.getValue());
		 }
		 
		 
	 }
}
