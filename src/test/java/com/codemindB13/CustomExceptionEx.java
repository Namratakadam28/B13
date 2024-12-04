package com.codemindB13;


public class CustomExceptionEx 
{

  String getMessage()
  {
	  return "This is Exception";
  }
}
class Exception1 extends CustomExceptionEx 
{
	String getMessage()
	{
		return "this is custome exception";
	}
}
try
{
	
	
}
catch(Exception1 e)
{
	System.out.println(e.getMessage());
}

