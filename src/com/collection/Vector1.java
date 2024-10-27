package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Vector1 {
	public static Integer iterate1(Vector<Integer> v)
	{
		int max=v.get(0);
		for(int i=1;i<v.size();i++)
		{
			Integer it=(Integer)v.get(i);
			int num=it;
			if(num>max)
			{
				max=num;
			}
		}
		return max;
//		int max=v.get(0);
//		for(Object obj: v)
//		{
//			Integer i1=(Integer)obj;
//			int n=i1;
//			if(n<max)
//			{
//				continue;
//			}	
//			else
//			{
//				max=n;
//			}
//		}
//		return max;
		
		
		
		//int max=0;
//		for(int i=0;i<v.size();i++)
//		{
//			Integer it=(Integer)v.get(i);
//			int n=it;
//			if(n>max)
//			{
//				max=n;
//			}
//			
//		}
//		return max;
	}
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.print(v+" ");
		System.out.println();
		int m=iterate1(v);
		System.out.println(m);	
		
		
	}
}
