package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEallOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,4,5,7,2,5,2));
		System.out.println(a);
		int removeElement=2;
		// remove element at all the occurence
		a.removeAll(Arrays.asList(removeElement));
		System.out.println(a);
		
		
		//replace all occurance of old elements to new element
		ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(1,2,4,5,7,2,5,2));
		int newE=10;
		int oldE=2;
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).equals(oldE))
			{
				a1.set(i, newE);
			}
		}
		System.out.println(a1);
		
		//how to compare Arraylist
		
		boolean areEqual=a.equals(a1);
		System.out.println("The list are equal: "+areEqual);
	}
}
