package com.codemindB13;

public class ThisKeywordSimpleEx 
{
	public static void main(String args[])
	{
		ThisClass th = new This class();
		th.show(10);
	}
}
class ThisClass
{
	
int a;
void show(int a)
{
	this.a=a;
	System.out.println(a);
}
}

