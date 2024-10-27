package com.collection;
import java.util.ArrayList;
public class Fruits {

	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<String> ();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("grapes");
		//System.out.print("Fruits are"+fruits+" ");
		//System.out.println();
		for(int i=0;i<fruits.size();i++)
		{
			System.out.print(fruits.get(i)+" ");
		}
		System.out.println();
		System.out.print("ArrayList size is:"+fruits.size());
		int i=0;
		while(i<fruits.size())
		{
			System.out.println(fruits.get(i));
		}
	}

}
