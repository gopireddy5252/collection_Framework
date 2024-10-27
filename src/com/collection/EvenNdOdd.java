package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNdOdd {
	public static void isFindEvenOdd(ArrayList<Integer> a1,int size)
	{
		ArrayList<Integer> e=new ArrayList<Integer>();
		ArrayList<Integer> o=new ArrayList<Integer>();
		for(int i=0;i<=size;i++)
		{
			if(i%2==0)
			{
				e.add(i);
			}
			else
			{
				o.add(i);
			}
		}
		
		
		System.out.println("even number are:"+e);
		System.out.println("Odd number are:"+o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ArrayList capacity:");
//		int capacity=sc.nextInt();
//		ArrayList<Integer> a1=new ArrayList<Integer>(capacity);
//		System.out.println("Enter how many values u want to enter: ");
//		int size=sc.nextInt();
//		for(int i=0;i<=size;i++)
//		{
//			a1.add(i);
//		}
//		isFindEvenOdd(a1,size);
		
		
		
		ArrayList<Integer> a2=new ArrayList<Integer>(Arrays.asList(2,9,0,5,7,4));
//		ArrayList<Integer> even=new ArrayList<Integer>();
//		ArrayList<Integer> odd=new ArrayList<Integer>();
//
//		 for (int i = 0; i <a2.size(); i++) {
//			if (a1.get(i)%2==0) {
//				 even.add(a2.get(i));
//			}
//			else {
//				odd.add(a2.get(i));
//			}
//		}
//		 System.out.println("Even numbers are:"+even);
//		 System.out.println("odd numbers are:"+odd); 
		
		
		
		System.out.print("Even: ");
		a2.forEach(x->{
			if(x%2==0)System.out.print(x+" ");
		});
		System.out.println("Odd:");
		a2.forEach(x->{
			if(x%2==1)System.out.print(x+" ");
		});

	}

}
