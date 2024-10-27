package com.map;

import java.util.HashMap;
import java.util.Map;

public class BufferTest
	{
	   public static void main(String [] args)
	   {
//	        Integer i1 = 128;
//		Integer i2 = 128;		
//		System.out.println(i1==i2);
//		System.out.println(i1.equals(i2));
		   
		   
//		   Map<Integer,String> map = new HashMap<>();
//			map.put(128,"Ampt");
//			map.put(new Integer(128),"Hyd");
//			System.out.println(map.size());
  
		   
//		   HashMap hash = new HashMap<>();
//			hash.put("nit", 500);
//			hash.put("info", 644);
//			hash.put("tech", "google");
//			System.out.println(hash.get("tech"));
//			System.out.println(hash.get("google"));
//			System.out.println(hash.getOrDefault("nit", "Technology"));
//			System.out.println(hash.get("info"));
		   
		   Map<String, Integer> map = new HashMap<>();
			map.put("apple", 1);
			map.put("banana", 2);
			map.put("orange", 3);
			map.replaceAll((k, v) -> v * 2);
			System.out.println(map);


	    }
	 }
