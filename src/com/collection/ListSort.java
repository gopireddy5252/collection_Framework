package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ListSort implements Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(40);
		l1.add(100);
		l1.add(20);
		System.out.println("befor sorting:"+l1);
		Collections.sort(l1);//assending order
		System.out.println("assending order:"+l1);
		Collections.sort(l1,Collections.reverseOrder());//dessending order
		System.out.println("After sorting:"+l1);
		
		List<String> l2=new ArrayList<String>();
		l2.add("gopi");
		l2.add("ansari");
		l2.add("james");
		l2.add("compiler");
		System.out.println("Before sorting names:"+l2);
		Collections.sort(l2);
		Collections.sort(l2,Collections.reverseOrder());
		System.out.println(l2);
	}

	@Override
	public int compareTo(Object o) {
		return this.compareTo(o);
		//return this.compareTo(o);
	}

}
