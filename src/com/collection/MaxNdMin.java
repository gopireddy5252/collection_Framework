package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxNdMin {
	public static void findmaxandmin(ArrayList a)
	{
		int max=0;
		for(int i=0;i<a.size();i++)
		{
			Integer i1=(Integer)a.get(i);
			int num=i1;
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(90);
		a.add(50);
		
		//#1
		findmaxandmin(a);
		
		//#2
		System.out.println("max is:"+Collections.max(a));
		System.out.println("min is:"+Collections.min(a));
		
		//#3
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(10,20,90,-10));
		int min=Collections.max(a1);
		int max=Collections.min(a1);
		if(min==max)
		{
			System.out.println("all elements are same");
		}
		else
		{
			System.out.println("min: "+min+"   max: "+max);
		}
	}
}
