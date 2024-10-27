package com.collection;

import java.util.Collections;
import java.util.LinkedList;

public class First1 implements Comparable {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("xopi reddy");
		l.add("raju");
		l.add("james");
		Collections.sort(l);
		System.out.println(l);
		

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return compareTo(o);
	}

}
