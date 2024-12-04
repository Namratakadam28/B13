package com.codemindB13;

public class RunTimeException 
{
 public static void main(String args[])
 {
	 RunTimeException  runTimeException = new   RunTimeException();
	 runTimeException.add(20, 5); 
	 runTimeException.testNullPointer();
	 runTimeException.testNumberFormat("1234sd");
	 runTimeException.testIndexOutOfBound(9);
	 runTimeException.testArrayIndexOutOfBound(7);
 }
 public void add(int a , int b)
 {
	 System.out.println(a/b);
 }
  public void testNullPointer()
  {
   String s = null;
   System.out.println(s.length());
   
  }
  public void testNumberFormat(String s)
  {
	  int a = Integer.parseInt(s);
	  System.out.println(a+10);
  }
  
  public void testIndexOutOfBound(int index)
  {
	  String s = "Codemind";
	  
	  System.out.println(s.charAt(index));
  }
  public void testArrayIndexOutOfBound(int index)
  {
	  int a[] = {10,20,30,50,33};
	  System.out.println(a[index]);
  }
}

