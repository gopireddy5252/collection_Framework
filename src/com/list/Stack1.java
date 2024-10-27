package com.list;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		/* these methods  are common available in all list classes
		
		Stack<Integer> s=new Stack<Integer>();
		s.add(10);
		s.add(20);
		s.add(0,30);// adding element based on position
		System.out.println(s.size());// size is 3(index are 0,1,2)
		//s.add(4,50);// here ArrayIndexOutOfBoundsException raised why becease previous 
		//only 3 elements are added then position are 0,1,2 but now ur trying to adding
		// the elements of 4 position that is why Exception
		
		s.set(1, 50);// update the element based on position
		System.out.println(s);
		System.out.println(s.get(1));// get value based on index
		
		s.remove(0);//remove based on index(if values are string then u can remove based on values also
		s.add(60);
		System.out.println(s);
		
		s.clear();// clear all the stack
		System.out.println(s);
		
		*/
		
		
	// special methods are available in stack , it follows LIFO(last in first out)
	/* 1.push ----> for add the elements
	 * 2.pop  ----> retrive and delete the last element
	 * 3.peek ----> just retrive the last element
	 * 2.search---->to search the element and return the index value
	 * note: this search method search the elements in last to first(top to buttom)
	 */
		
		Stack<String> color=new Stack<String>();
		color.push("red");
		color.push("white");
		color.push("cyan");
		color.push("yellow");
		color.push("blue");
		color.push("black");
		System.out.println(color);
		System.out.println(color.pop());
		System.out.println(color);
		System.out.println(color.peek());
		System.out.println(color.search("yellow"));// here elements are [red, white, cyan, yellow, blue]
		// then it will search the last to first that is why position is 2
		System.out.println(color.indexOf("yellow"));// here 3
		
	}
}




















