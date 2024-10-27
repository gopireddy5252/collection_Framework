package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class noOftimesPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(1,2,6,2,7,2,1));
		int count=Collections.frequency(a1, 2);
		int count2=Collections.frequency(a1, 1);
		System.out.println(a1);
		System.out.println("2 presernt: "+count+" times");
		System.out.println("1 presernt: "+count2+" times");
	}

}
