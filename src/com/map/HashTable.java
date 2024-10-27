package com.map;
import java.util.*;
import java.util.Map.Entry;

//hashtable similar to hashmap , but synchonized and does not allow the null keys and values.
public class HashTable {

	public static void main(String[] args) {
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(517408, "palamaner");
		ht.put(500048, "sr nagar");
		ht.put(517500, "chittoor");
		ht.put(500419, "tirupati");
		
		//retrieval of the key from map
		Set<Integer> keys=ht.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		System.out.println();
		
		//retrieval of the key and value from map
		for(Integer key:keys)
		{
			System.out.println(key +" = "+ht.get(key));
		}
		
		System.out.println();
		//retrieval of the value from map
	Collection<String> values=	ht.values();
	for(String value:values)
	{
		System.out.println(value);
	}
	System.out.println();
	
	//using entrySet
	Set<Entry<Integer, String>> entries = ht.entrySet();
	for (Entry<Integer, String> entry : entries) {
	    Integer key = entry.getKey();
	    String value = entry.getValue();  // Corrected method name
	    System.out.println(key + " == " + value);
	}
	
	// i want sorting order
	Set<Entry<Integer, String>> entrie = ht.entrySet();
	List<Entry<Integer, String>> entryList=new ArrayList(entrie);
	entryList.sort(Comparator.comparing(Entry::getValue));
	
	for(Entry<Integer, String> entry:entryList)
	{
		Integer key=entry.getKey();
		String value=entry.getValue();
		System.out.println(key+"<<<<"+value);
		}
	

	//retrieval of the value from map besed on key
	System.out.println(ht.get(517408));
	}

}
