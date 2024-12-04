package com.codemindB13;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;
public class HashMapEx 
{
  public static void main(String args[])
  {
	  HashMap<Integer , String> empDetails = new HashMap<Integer,String>();
	  empDetails.put(1234, "Namrata");
	  empDetails.put(1534, "prasad");
	  empDetails.put(9876, "neha");
	  empDetails.put(5678, null);
	  empDetails.put(1234, null);
	  empDetails.put(null, "Namrata");
	  empDetails.put(null, "Nam");
	  
	  Set<Entry<Integer,String>> set = empDetails.entrySet();
	  for(Entry<Integer,String> e : set)
			  {
		         System.out.println(e.getKey()+ ":" + e.getValue());
		         
			  }
	  System.out.println("******************************************");
    
	  Iterator<Entry<Integer,String>> it=empD.iterator();
	  
	  HashMap<Integer , String> empDetails2 = new HashMap<Integer,String>();
	  empDetails2.put(9999,"pavan");
	  empDetails2.putAll(empDetails);
	  Set<Entry<Integer,String>> empD2 = empDetails2.entrySet();
	  for(Entry<Integer , String> e2:empD2)

	  {
		  System.out.println(e2.getKey()+":"+e2.getValue());
	  }
	  System.out.println("******************************************");
	  empDetails.clear();
	  for(Entry<Integer , String> e2:empD2)

	  {
		  System.out.println(e2.getKey()+":"+e2.getValue());
	  }
	  System.out.println("******************************************");
	  System.out.println("contains key:"+empDetails2.containsKey(9999));
	  System.out.println("contains key:"+empDetails2.containsKey(0202));
	  
	  System.out.println("******************************************");
	  System.out.println("contains value:"+empDetails2.containsValue(9999));
	  System.out.println("contains value:"+empDetails2.containsValue(0202));
	  System.out.println("******************************************");
	  System.out.println(empDetails2.get(9999));
	  System.out.println("******************************************");
	  Set<Integer> empIds = empDetails2.keySet();
	  for(Integer empID : empIds)
	  {
		  System.out.println("emp id :"+empID);
	  }
	  System.out.println("******************************************");
	  System.out.println("size:"+empDetails2.size());
	  System.out.println("******************************************");
	  empDetails2.remove(1010);
	  empDetails2.remove(9999,"pavan");
	  
	  empDetails2.replace(789, "yuvraj");
	  Set<Entry<Integer,String>> empD22 = empDetails2.entrySet();
	  for(Entry<Integer , String> empD33 : empD22)
	  {
		  System.out.println(empD33.getKey()+":"+empD33.getValue());
	  }
	  
	  
  }
}
