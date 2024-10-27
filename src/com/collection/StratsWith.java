package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class StratsWith {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>(Arrays.asList("abc","bca","anv","bro"));
		for(String s:a1)
		{
			if(s.startsWith("a"))
			{
				System.out.println(s);
			}
		}
		for(String s1:a1)
		{
			if(s1.endsWith("a"))
			{
				System.out.println(s1);
			}
		}
		
		// convert uppercase
		for(String s3:a1)
		{
			System.out.print(s3.toUpperCase()+" ");
		}

	}

}
