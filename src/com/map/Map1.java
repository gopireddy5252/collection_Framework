package com.map;
import java.util.Collection;
/*
 *a Map is an interface that represents a collection of key-value pairs,
 * where each key is unique, and each key maps to exactly one value.
 * The Map interface is part of the java.util package and 
 * is commonly used to store and retrieve data based on keys rather than indices.
 * Unlike List or Set, which are collections of individual elements,
 * a Map stores data as a set of entries (key-value pairs)
 */
/*
 * key features of Map:
 
   Key-Value Pairing: Each entry in a Map consists of a key and its associated value.
   Unique Keys: Keys must be unique. If you attempt to add an entry with a duplicate key,
   the new value will replace the old one.
   Null Values and Keys: Depending on the implementation,
   null values and keys may be allowed. For example, HashMap allows one null key 
   and multiple null values, while TreeMap does not allow null keys.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer, String> stuMap=new HashMap<Integer, String>();
		stuMap.put(1, "gopi");
		stuMap.put(2, "surya");
		stuMap.put(1, "siva");
		stuMap.put(3, "ramu");
		System.out.println(stuMap);//{1=siva, 2=surya} beacuse key can't be duplicate
		// just modify old value to new value
		
		//Iterating key-value pair
		for(Map.Entry<Integer, String> entry: stuMap.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//retriving keys in Map
		Set<Integer> key = stuMap.keySet();
		for(Integer keys: key)
		{
			System.out.println(keys);
		}
		
		//retriving values in map
		Collection<String> value = stuMap.values();
		for(String values: value)
		{
			System.out.println(values);
		}
		
		Map<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(1, "apple");
		map1.put(3, "orange");
		map1.put(6, "mango");
		
		System.out.println("value of 3:"+map1.get(3));// orange
		System.out.println("value of 2:"+map1.get(2));//null there is no key-2 
		System.out.println("value of -1:"+map1.get(-1));//null
		System.out.println("value of 3.5:"+map1.get(-3.5));//null
		System.out.println("value of 8:"+map1.get(8));
		
		 // using putAll()
		map1.putAll(stuMap);
		System.out.println(map1);
		
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(1, "apple");
		m1.put(2, "mango");
		m1.put(3, "grapes");
		System.out.println(m1);
		Map<Integer, String> m2= new HashMap<Integer, String>();
		m2.put(1, "abc");//(m2 putall m1) abc is old values that's why replace the new value is apple
		m2.put(2, "lmn");
		m2.put(3, "xyz");
		System.out.println(m2);
		m2.putAll(m1);
		System.out.println(m2);


	}

}
/*
 * Common Implementations of Map:

 * HashMap: Stores entries in a hash table. It allows null keys and values,
   but does not maintain any order.
   LinkedHashMap: Similar to HashMap, but maintains insertion order.
   TreeMap: Implements Map using a Red-Black tree, which sorts the keys in natural order
   or by a specified comparator.
   Hashtable: Similar to HashMap, but synchronized and does not allow null keys or values.
 */

/*
 * Common Methods in the Map Interface:
 
   put(K key, V value): Adds a key-value pair to the map.
   get(Object key): Returns the value associated with the specified key.
   remove(Object key): Removes the entry for the specified key.
   containsKey(Object key): Checks if the map contains the specified key.
   containsValue(Object value): Checks if the map contains the specified value.
   keySet(): Returns a set of all the keys in the map.
   values(): Returns a collection of all the values in the map.
   entrySet(): Returns a set of all key-value pairs (entries) in the map.
 */
