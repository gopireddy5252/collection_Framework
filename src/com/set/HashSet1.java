package com.set;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		/*
		 * set: the main reason to implement it to store the unique elements
		 * set is not allow the duplicate(if we try to add the duplicate then no CTE but stores one time)
		 * note: here no updation
		 * Hashset<class>: it's implements set<interface>
		 * it's to store values internally for using HashMap
		 * HashSet -> HashMap -> Array of nodes(key,value)
		 * but ikkada HashSet anedi only keys nii matrame store 
		 * chesukuntundii value place lo dummy object nii create chusukuntundii
		 * like ila new Object(); idi internal ga 
		 * private static final Object present=new Object();
		 * ila untundii, endhuku ante object ni okkesari create chetaamu( for memory storage)
		 * why only HashMap , why not follow Arrays or node  for store values internally
		 * why because in HashMap keys are unique,set allows only unique
		 * it's not follows the insertion order 
		 * Default capacity is 0
		 * initial capacity is 16
		 * all set class are no synchronization
		 */
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(9);
		hs.add(56);
		hs.add(2);
		hs.add(7);
		hs.add(17);
		hs.add(100);
		hs.add(2);
		hs.add(2);// duplicate values stored at one time
		System.out.println(hs);
		hs.remove(2);// here 2 is element not index
		System.out.println(hs.remove(3));// false why because there is 3 element
		System.out.println(hs.remove(9));//true why 9 is removed
		System.out.println(hs);
		
		for(Integer value:hs)
		{
			System.out.println(value);
		}
		

	}

}
