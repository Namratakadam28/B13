package com.codemindB13;

public class ThisKeywordInJava1 
{

int a=20;
int b=30;

public static void main(String args[])
{

 ThisKeywordInJava tkw = new ThisKeywordInJava();
 int sum = tkw.add(tkw.a,tkw.b);
 System.out.println(sum);
 System.out.println(tkw.hashCode());
}

public int add(int a,int b)
{
 this.a=a;
 this.b=b;
 return a+b;
 sub(100,50);
}

public void sub(int a , int b)
{
	System.out.println(a-b);
}
}
