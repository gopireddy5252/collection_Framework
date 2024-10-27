package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LabFruit {
	public static void isForLoop(ArrayList<String> s)
	{
		System.out.println("Traversing using for loop:");
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s.get(i));
		}
		
		System.out.println("Traversing using while loop:");
			
		int i=0;
		while(i<s.size())
			{
				System.out.println(s.get(i));
				i++;
			}
				

		System.out.println("Traversing using enhanced for loop:");
			for(String obj:s)
			{
				
				System.out.println(obj+" ");
			}
			System.out.println("Traversing using Iterator:");
			Iterator i1=s.iterator();
			while(i1.hasNext())
			{
				String s2=(String)i1.next();
				System.out.println(s2);
			}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ArrayList size: ");
		int size1=sc.nextInt();
		sc.nextLine();
		ArrayList<String> str=new ArrayList <String>();
		System.out.println("Enter "+size1+" eleemnts: ");
		for(int i=0;i<size1;i++)
		{
			System.out.println("Enter "+(i+1)+" element:");
			str.add(sc.nextLine());
		}
		isForLoop(str);
		

	}

}
