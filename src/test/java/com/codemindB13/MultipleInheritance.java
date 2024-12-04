package com.codemindB13;


public class MultipleInheritance 
{
	public static void main(String args[])
	{
	int c=30;
	newClass_1 n= new newClass_1();
	n.sum();
	n.testing();
	n.multiply();
	}
	}
	interface myInterface_1
	{
	public static final int b=20;
	int c=30;

	public abstract void sum();
	void testing();
	}
	interface myinterface_2
	{
		public static final int x=40;
		int y=40;
	}
	class newClass_1 implements myInterface_1,myinterface_2
	{
	public void sum()
	{
		int SUM = b+c;
		System.out.println("sum of two numbers::"+SUM);
	}
	public void testing()
	{
		System.out.println("It is testing method from myInterface");
	}
	public int multiply()
	{
	 return x*y;
	}
}
