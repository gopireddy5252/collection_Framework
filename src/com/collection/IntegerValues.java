package com.collection;
import java.util.Scanner;
import java.util.ArrayList;
public class IntegerValues {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		System.out.println("Enter 5 integer numers ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter "+(i+1)+" element: ");
			int num=sc.nextInt();
			a.add(num);
		}
		System.out.println("ArrayList elements are: ");
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<a.size();i++)
		{
			sum+=a.get(i);
		}
		System.out.println("The Sum of ArrayList elements are: "+sum);
		
		
	
	}	
}
