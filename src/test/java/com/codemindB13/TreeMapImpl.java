package com.codemindB13;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapImpl 

{
	public static void main(String args[])
	{
	TreeMap <Integer , String> empDetails = new TreeMap<Integer , String>();
	 empDetails.put(1234, "Namrata");
	 empDetails.put(2345, "prasad");
	 empDetails.put(444, "neha");
	 empDetails.put(111, "pavan");
	 empDetails.put(222, "puja");
	 
	 Set<Entry<Integer, String>> empD = empDetails.entrySet();
	 
	 Iterator<Entry<Integer , String>> It = empD.iterator();
	 while(It.hasNext())
	 {
		 Entry<Integer , String> e = It.next();
		 System.out.println(e.getKey()+":"+e.getValue());
	 }
	 
	 System.out.println("**************************************************************");
	 
	 TreeMap <Integer , String> empDetails2 = new TreeMap<Integer , String>();
	 empDetails2.put(555, "Advait");
	 empDetails2.putAll(empDetails);
	 
	 Set<Entry<Integer , String>> empD2 = empDetails2.entrySet();
	 
	 for(Entry<Integer ,String> e2 : empD2)
	 {
		 System.out.println(e2.getKey()+":"+e2.getValue());
	 }
	 
	 System.out.println("**************************************************************");
	 empDetails.clear();
	 System.out.println("****************** After using clear method****************************");
    Set<Entry<Integer , String>> empD3 = empDetails.entrySet();
	 
	 for(Entry<Integer ,String> e3 : empD3)
	 {
		 System.out.println(e3.getKey()+":"+e3.getValue());
	 }
	 
	 System.out.println("**************************************************************");
	 System.out.println("Contains key :"+empDetails.containsKey(1234)); 
	 System.out.println("Contains key :"+empDetails2.containsKey(1234));
	 
	 System.out.println("**************************************************************");
	 System.out.println("Contains values :"+empDetails.containsValue("Namrata")); 
	 System.out.println("Contains value :"+empDetails2.containsValue("Namrata"));
	 

	 System.out.println("**************************************************************");
	 System.out.println("empDetails is empty:"+empDetails.isEmpty());
	 System.out.println("empDetails2 is empty:"+empDetails2.isEmpty());
	 
	 System.out.println("****************************************************************");
	 System.out.println(empDetails2.get(555));
	 

	 System.out.println("****************************************************************");
	 Set<Integer> empkeys = empDetails2.keySet();
	 for(Integer empkeys2 : empkeys)
	 {
		 System.out.println(" emp keys:"+empkeys2);
	 }

	 System.out.println("****************************************************************");
    System.out.println("Size:"+empDetails.size());
    System.out.println("Size:"+empDetails2.size());
    
	 System.out.println("****************************************************************");
	 empDetails2.remove(1234);
	 empDetails2.remove(222 ,"puja");
	 
	 Set<Entry<Integer, String>> empD4 = empDetails2.entrySet();
	 Iterator<Entry<Integer , String>> It1 = empD4.iterator();
	 while(It1.hasNext())
	 {
		 Entry<Integer , String> e2 = It1.next();
		 System.out.println(e2.getKey()+":"+e2.getValue());
	 }
	 
	 System.out.println("****************************************************************");
	 empDetails2.replace(444,"Neha");
    Set<Entry<Integer , String>> empD5 = empDetails2.entrySet();
	 
	 for(Entry<Integer ,String> e4 : empD5)
	 {
		 System.out.println(e4.getKey()+":"+e4.getValue());
	 }
	 System.out.println("****************************************************************");
	 Collection<String> col = empDetails2.values();
	 for(String s : col)
	 {
		 System.out.println("emp name:"+s);
	 }
	}
}
