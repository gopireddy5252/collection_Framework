package com.set;
import java.util.*;
public class LinkedHashSet1 {

	public static void main(String[] args) {
	/*
	* LinkedHashSet<class>: it's implements set<Interface>
	* 								AND
	* 						 it's extends HashSet<class>
	* it's follow the insertion order
	* duplicates are not allowed
	* null value allowed one time
	* Initial and Default capacity is 16
	* LinkedHashSet ->internally(storing elements) ->LinkedHashMap -> link of nodes(key,value)
	* 
	*/
		Set<Integer> lhs=new LinkedHashSet();
		lhs.add(9);
		lhs.add(2);
		lhs.add(8);
		lhs.add(5);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
	}

}
