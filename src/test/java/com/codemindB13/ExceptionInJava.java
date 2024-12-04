package com.codemindB13;

public class ExceptionInJava
{
public static void main(String args[])
{
	ExceptionInJava exp = new ExceptionInJava();
	System.out.println(exp.calculatePercentage(30,0));
}
public int calculatePercentage(int a , int b)
{
	int c = a/b;
	System.out.println("After Devision");
	return c;
}
}

