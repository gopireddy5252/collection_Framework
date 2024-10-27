package com.practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Iteratortheelements {
	private static void iterate3(ArrayList<Integer> a) throws InterruptedException
	{
		System.out.println("using for loop");
		for(int i=0;i<a.size();i++)
		{
			Object obj=a.get(i);
			Integer i1=(Integer)obj;
			int num=i1;
			System.out.print(num+" ");
			
		}
		System.out.println();
	}
	private static void iterate2(ArrayList<Integer> a)throws InterruptedException
	{
		System.out.println("using for-each loop");
		for(Object obj:a)
		{
			Integer i=(Integer)obj;
			int num=i;
			System.out.print(num+" ");
		}
		System.out.println();
	}
	private static void iterate1(ArrayList<Integer> a) throws InterruptedException
	{
		System.out.println("using iterate the elements in listIterator");
		ListIterator<Integer> e=a.listIterator();
		while(e.hasNext())
		{
			Object obj=e.next();
			Integer i=(Integer)obj;
			int num=i;
			System.out.print(num+" ");
		}
		System.out.println();
	}
	private static void ieterate5(Vector<Integer> a)
	{
		System.out.println("using Enumeration..");
		Enumeration e=a.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer) e.nextElement();
			int i1=i;
			System.out.print(i1+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				a.add(i);
			}
		}
		iterate1(a);
		iterate2(a);
		iterate3(a);
		Vector<Integer> vector=new Vector<Integer>();
		vector.add(2);
		vector.add(4);
		vector.add(7);
		ieterate5(vector);
		
	}

}
