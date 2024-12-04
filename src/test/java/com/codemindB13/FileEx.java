package com.codemindB13;

import java.io.File;
import java.io.FileInputStream;

public class FileEx 
{
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\pavan\\OneDrive\\Desktop\\testing.rtf");
		//file.createNewFile();
		
		System.out.println(file.length());
		System.out.println(file.canRead());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		
		FileInputStream fileinputstream = new FileInputStream(file);
		
		int i =0;
		while(i!=-1)
		{
			i=fileinputstream.read();
			char c = (char) i;
			System.out.println(c);
		}
		
	}
}
