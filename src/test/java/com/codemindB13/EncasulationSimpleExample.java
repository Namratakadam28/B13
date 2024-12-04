package com.codemindB13;

public class EncasulationSimpleExample 
{
 public static void main(String args[])
 {
	 student s = new student();
	 s.setRollNo(101);
	System.out.println(s.getRollNo());
 }
}
class student
{
	int roll_no;
	String name;
    void setRollNo(int roll_no)
    {
    	roll_no=a;
    }
    void getName(String name)
    {
    	name=b;
    }
}