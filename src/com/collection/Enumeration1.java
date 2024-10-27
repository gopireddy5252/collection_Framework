package com.collection;
import java.util.Scanner;
import java.util.Vector;
import java.util.Enumeration;
public class Enumeration1 {
	public static void isEnumeration(Vector<Integer> v)
	{
		Enumeration<Integer> e=v.elements();
		System.out.println("iterating elements of using Enumeration...");
		int max=v.get(0);
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			int num=i;
			if(num>max)
			{
				max=num;
			}
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("max is: "+max);
	}

	public static void main(String[] args) {
		Vector<Integer> v=new Vector();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vector size: ");
		int size=sc.nextInt();
		System.out.println("enter "+size+" values");
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextInt());
		}
		System.out.print(v+" ");
		System.out.println();
		
		isEnumeration(v);

	}

}
