package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CovertArrayToList {
//	public static ArrayList convertAtoL(String[] input) {
//		ArrayList al=new ArrayList();
//		if(input.length>0)
//		{
//		for(int i=0;i<input.length;i++)
//		{
//			al.add(input[i]);
//		}
//		}
//		else
//		{
//			System.out.println("String is empty");
//		}
//		return al;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1
		String[] str= {"abc","hr","cm","pm"};
		//System.out.println(convertAtoL(str));
		
		//#2
		//using asList() method
		
//		List all=Arrays.asList(str);
//		ArrayList a=new ArrayList(all);
//		a.forEach(System.out::println);
		
		//#3
		ArrayList a1=new ArrayList(Arrays.asList(str));
		System.out.println(a1);

	}

}
