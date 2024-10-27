package com.practice;
import java.util.*;
import java.util.Map.Entry;
public class Pincode {

	public static void main(String[] args) {
		Hashtable<Long,String> pcode = new Hashtable<>();
		pcode.put(517408L, "palamner");
		pcode.put(500038L, "s r nagr");
		pcode.put(5000364L, "hyd");
		pcode.put(512036L, "tirupati");
		
		Set<Long> fkey=pcode.keySet();
		for(Long keys: fkey)
		{
			System.out.println(keys);
		}
		
		Collection<String> value=pcode.values();
		for(String values: value)
		{
			System.out.println(values);
		}
		
		Set<Entry<Long,String>>entry=pcode.entrySet();
		for(Entry<Long, String> entries: entry)
		{
			System.out.println(entries);
		}
		
		Set<Long> key=pcode.keySet();
		for(Long keys: key)
		{
			System.out.println(keys+":"+pcode.get(keys));
		}
	}

}
