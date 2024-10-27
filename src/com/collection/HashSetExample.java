package com.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet sorting
		HashSet<Integer>hSet=new HashSet<Integer>(Arrays.asList(10,2,5,7));
		TreeSet<Integer> tSet=new TreeSet<Integer>(hSet);
		System.out.println(tSet);
		
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(50);
		h1.add(60);
		System.out.println(h1);
		//HashSet h2=h1;  // this time if u making change in h2 or h1 then both are affected, because both h1 and h2 sharing some reference
		HashSet h2=new HashSet(h1);// this time if u making change in h2 or h1 then only that perticuler object affected
		h2.add("gopi");
		System.out.println("Before removing the elements:"+h1);
		System.out.println("Before removing the elements"+h2);
		
		h2.remove(10);
		System.out.println("After removing the elements:"+h1);
		System.out.println("After removing the elements"+h2);
		
		

	}

}
