package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class TestMethods {

		public static void displayUsing_forLoop(ArrayList l1)
		{
			System.out.println("Fecting elements one at a time using for loop");
			for(int i=0;i<l1.size();i++)
			{
				System.out.print(l1.get(i)+" ");
			}
		}
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		System.out.println("Before adding the elements:"+a1.size());
		System.out.println("now container object is empty:"+a1.isEmpty());
		System.out.println("container object contains 'gopi'."+a1.contains("gopi"));
		
		//adding elements into container object
		a1.add("gopi");//String object
		a1.add(true);//ptv->wco->element/object
		a1.add('j');
		a1.add("java");
		a1.add(100);//ptv->wco->e/o
		
		System.out.println("Fecting elements stored in container object all at once:");
		System.out.println(a1);// background toString() invoked
		displayUsing_forLoop(a1);
		
		System.out.println();
		System.out.println("after adding the elements:"+a1.size());
		System.out.println("now container object is empty:"+a1.isEmpty());
		System.out.println("container object contains 'gopi'."+a1.contains("gopi"));

	}

}
