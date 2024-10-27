package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortHashSet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s=new HashSet<Integer>(Arrays.asList(12,13,14,18,10,9));
		System.out.println(s);// this is not maintain the order this introduced only for fast access
		// directly not possible for sorting 
		List<Integer> l=new ArrayList<>(s);
		
		Collections.sort(l);
		System.out.println("Assending order"+l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("desending order"+l);
		
		
		//to convert array to HashSet
		int[] arr= {10,20,9,2,3};
		Set s1=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			s1.add(arr[i]);
		}
		System.out.println(s1);

		
		
		

	}

}
