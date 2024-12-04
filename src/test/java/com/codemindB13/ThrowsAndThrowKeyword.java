package com.codemindB13;

public class ThrowsAndThrowKeyword 
{
  public static void main(String args[])
  {
	  ThrowsAndThrowKeyword tat = new ThrowsAndThrowKeyword();
	  tat.divide(10, 0);
	  
  }
  public void divide(int num1 , int num2 , String userName)throws ArithmeticException , NullPointerException
  {
	  if(num2==0)
	  {
		  throw new ArithmeticException("please provide non zero number");
	  }
	  int result = num1/num2;
	  System.out.println(result);
	  System.out.println(userName.length());
  }
  
}
