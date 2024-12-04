package com.codemindB13;


public class ExceptionExampleTryCatch
{
 public static void main(String args[])
 {
	 int arr[]= {10,20,30,35,40};
	 int a=20,c;
	 try
	 {
		 System.out.println(arr[4]);
		 c=a/0;
		 
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	// catch(Exception e)
	 {
		 System.out.println("index 20 is not available please check");
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Arithmatic exception");
	 }
	 catch(Exception e)
	 {
		 System.out.println("Final exception class");
	 }
System.out.println("outside try and catch bloack");
}
 
}