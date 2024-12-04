package com.codemindB13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionUsage {

	public static void main(String[] args) 
	{
		ArrayList<Integer> empIds = new ArrayList<Integer>();
		empIds.add(4546);
        empIds.add(3545);
        empIds.add(4547);
        empIds.add(4745);
        empIds.add(4645);
        
        Iterator<Integer> it = empIds.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        System.out.println("**************************************");
        
        Collections.sort(empIds);
        
        Iterator<Integer> it1 = empIds.iterator();
        while(it.hasNext())
        {
        	System.out.println(it1.next());
        }
		
        System.out.println("**************************************");
        
        Collections.reverse(empIds);
        
        Iterator<Integer> it2 = empIds.iterator();
        while(it.hasNext())
        {
        	System.out.println(it2.next());
        }
		
        
        
	}

}
