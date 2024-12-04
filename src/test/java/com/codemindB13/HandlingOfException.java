package com.codemindB13;

public class HandlingOfException 
{
 public static void main(String args[])
 {
	 HandlingOfException hoe=new HandlingOfException();
	 int returnResult = hoe.division(10, 5);
	 System.out.println(returnResult);
 }
 public int division(int num1 , int num2)
 {
	 int result=0;
	 try
	 {
		 result = num1/num2;
		 String s = null;
		 s.charAt(4);
	 }
	 catch(ArithmeticException e)
	 {
		 
		 System.out.println("please divide by zero");
	 }
	 finally
	 {
		 System.out.println("always finally block executed");
	 }
	 
	 return result;
 }
}
