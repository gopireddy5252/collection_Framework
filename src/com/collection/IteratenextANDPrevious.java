package com.collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
public class IteratenextANDPrevious {
	public static void isforloop(ArrayList<String> names)
	{
		System.out.println("iterating using for loop: ");
		for(int i=0;i<names.size();i++)
		{
			Object obj=names.get(i);
			String student=(String)obj;
			System.out.print(student+" ");
			
		}
	}
	public static void isforEachloop(ArrayList<String> names)
	{
		System.out.println("iterating using for each loop");
		for(Object obj: names)
		{
			String student=(String)obj;
			System.out.print(student+" ");
		}
	}
	public static void iterate(ArrayList<String> names)
	{
		System.out.println(" use iterator() to iterate through each name forwading");
		ListIterator li=names.listIterator();
		while(li.hasNext())
		{
			Object obj=li.next();
			String student=(String)obj;
			System.out.print(student+" ");
		}
		System.out.println();
		System.out.println("use iterator() to iterate through each name backwording");
		while(li.hasPrevious())
		{
			Object obj=li.previous();
			String student=(String)obj;
			System.out.print(student+" ");
		}
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> names=new ArrayList <String> ();
		System.out.println("Enter ArrayList size: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter  "+(i+1)+" name:");
			String name=sc.nextLine();
			names.add(name);
		}
		System.out.println("ArrayList names are: ");
		for(int i=0;i<names.size();i++)
		{
			System.out.print(names.get(i)+" ");
		}
		System.out.println();
		for(int i=0;i<names.size();i++)
		{
			Object obj=names.get(i);
			String s=(String)obj;
			System.out.println("the length of "+s+" is: "+s.length());
		}
		System.out.println();
		isforloop(names);
		System.out.println();
		isforEachloop(names);
		System.out.println();
		iterate(names);
		
	}

}
