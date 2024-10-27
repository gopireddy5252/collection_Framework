package com.collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class IterateElements {
	
	public static void delay() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	public static void iterate1(ArrayList<Integer> a1) throws InterruptedException
	{
		// a has 2 4 6 8 10
		System.out.println("iterating using for loop");
		for(int i=0;i<a1.size();i++)
		{
			Object obj=a1.get(i);
			Integer n=(Integer)obj;
			int num=n;
			System.out.print(num+" ");
			//delay();
		}
		System.out.println();
	}
	public static void iterate2(ArrayList <Integer> a1) throws InterruptedException
	{
		// a has 2 4 6 8 10
		System.out.println("iterate using for-each loop");
		for(Object obj:a1)
		{
			Integer i=(Integer)obj;
			int num=i;
			System.out.print(num+" ");
			//delay();
		}
		System.out.println();
	}
	public static void iterate3(ArrayList <Integer> a1) throws InterruptedException
	{
		// a has 2 4 6 8 10
		System.out.println("iterate usinfg Iterator");
		ListIterator itr=a1.listIterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			Integer i=(Integer)obj;
			int num=i;
			System.out.print(num+" ");
			//delay();
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList <Integer> a1=new ArrayList<Integer> ();
		// adding even number 1 to 10 into arrayList
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				a1.add(i);
			}
		}
		iterate1(a1);
		iterate2(a1);
		iterate3(a1);

	}

}
