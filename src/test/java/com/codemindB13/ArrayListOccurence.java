package com.codemindB13;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class ArrayListOccurence 
{
	public static void main(String args[]) 
	{
		ArrayList<String> rivernames = new ArrayList();
		int count=0;
		rivernames.add("Ganga");
		rivernames.add("Krishna");
		rivernames.add("Yamuna");
		rivernames.add("Sarswati");
		rivernames.add("Ganga");
		for(int i=0;i<rivernames.size();i++)
		{
			if(rivernames.get(i)=="Ganga")
			count=count+1;
		}
	  System.out.println("The occurence of ganga:"+count);
	}
}
