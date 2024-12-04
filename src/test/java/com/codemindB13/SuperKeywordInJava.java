package com.codemindB13;

public class SuperKeywordInJava 
{
 public static void main(String args[])
 {
	 SuperChild sc = new SuperChild();
	 sc.add();
 }
}
 class SuperParent
 {
	 int a=10;
	 public void add(int a)
	 {
		 System.out.println(this.a+a);
	 }
	 
 }
 class SuperChild extends SuperParent
 {
	 int a=20;
	 public void add()
	 {
		 super.add(30);
		 System.out.println(a+super.a);
	 }
 }