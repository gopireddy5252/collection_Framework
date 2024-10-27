package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CheckUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(1,2,4,7));
		ArrayList<Integer> a2=new ArrayList<Integer>(Arrays.asList(1,2,4,7));
		boolean isqual=Collections.disjoint(a1, a2);
		System.out.println("two arreays are equal:"+isqual);
		
		
		// to rotate clock wise
		int step=1;
		System.out.println(a1);
		Collections.rotate(a1, step);
		System.out.println(a1);
		
		
		//for swaping index only
		Collections.swap(a1, 3, 1);// 3 and 1 are  index
		System.out.println("after swaping:"+a1);
		
		
		// list reverse
		Collections.reverse(a2);
		System.out.println("reverse of a2:"+a2 );
		
		
	}

	

}
