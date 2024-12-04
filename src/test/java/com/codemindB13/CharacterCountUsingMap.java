package com.codemindB13;

import java.util.HashMap;

public class CharacterCountUsingMap 
{
	public static void main(String[] args)
	{
		String s= "Welcome to codemind";
		 HashMap<Character , Integer> hashmap = new HashMap<Chracter , Integer>();
		  for(int i =0;i<s.length();i++)
		  {
			  if(!(hashmap.containsKey(s.charAt(i))))
			  {
				  hashmap.put(s.charAt(i),1);
			  }
		  
		  else(!(hashmap.containsKey(s.charAt(i))))
		  {
			  hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1);
		  
		  }
		  }
		  Set<Entry<Character , Integer>> charCountSet =hashmap.entrySet();
	}
}
