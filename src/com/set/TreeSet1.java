package com.set;

import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		/*
		 * TreeSet: to used for Sorting order
		 * it's purely implements NavigableSet<interface>
		 * also it's implemnts SortedSet,set
		 *  duplicates and null values are not allowed 
		 */
		TreeSet<Integer> ts=new TreeSet<Integer>();
		// here if u make Set has a super type then first() and last()
		// methods are not working
		ts.add(2);
		ts.add(30);
		ts.add(15);
		ts.add(40);
		ts.add(5);
		ts.add(7);
		ts.add(7);
		System.out.println(ts);
		System.out.println("small element "+ts.first());
		System.out.println("big element "+ts.last());
		//If the TreeSet is empty, calling first() or last() will throw
		//a NoSuchElementException
		//System.out.println(ts.pollFirst());// removes lowest element
		//System.out.println(ts.pollLast());//removes highest element
		System.out.println(ts.subSet(10, 50 ));
		System.out.println(ts.subSet(10, 50).remove(30));// it will print the 10 to 50 bitween elements
		System.out.println(ts);
	}

}
