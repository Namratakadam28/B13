package com.codemindB13;

public class ThisKeywordInJava
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
 
 public int add(int num1,int num2)
 {
	 System.out.println(this.hashCode());
	 return num1-num2;
 }
}

