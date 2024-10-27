package com.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class SetNdList {
public static void main(String[] args) {
	Set hS = new HashSet();
	hS.add(10);
	hS.add(20);
	hS.add(30);
	hS.add(40);
	hS.add(20);//duplicate -> duplicate are not allowed in set
	hS.add(10);//duplicate
	System.out.println("No. of elements in Set: "+hS.size());
	
	List h = new ArrayList();
	h.add(10);
	h.add(20);
	h.add(30);
	h.add(40);
	h.add(20);//duplicate -> duplicate are allowed 
	h.add(50);
	System.out.println("No. of elements in list:"+h.size());
	System.out.println("Elements stored in Set container: ");
	System.out.println(hS);
	System.out.println();
	System.out.println("Elements stored in List container: ");
	System.out.println(h);
}
}