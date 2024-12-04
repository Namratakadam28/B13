package com.codemindB13;
import java.io.File;
import java.io.InputStream;



public class CompileTimeException 
{
	public static void main(String args[])
	{
	CompileTimeException c = new CompileTimeException();
	System.out.println(c.calculatePercentage(30,20));
	File file = new File("");
	
    }

public int calculatePercentage(int a , int b)
{
	int c = a/b;
	System.out.println("After Devision");
	return c;
}
}
	

