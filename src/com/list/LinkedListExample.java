package com.list;

import java.util.*;

	/*
	 * LinkedList: it's implements list and dequeue
	 * Default and initial capacity is 0
	 * duplicates and null value are Allowed
	 * it is not synchronized
	 * not follow the sorted order, it's follows insertion order
	 * 
	 * a LinkedList stores its elements in a series of nodes.
	 *  Each node contains two parts: the data (element) and references (links)
	 *   to the next and previous nodes in the list.
	 *   
	 *   LinkedList is excellent for frequent insertions and deletions,
	 *    especially at the beginning and end. but its slower than Arraylist
	 */

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        
        // Adding elements at the beginning and end
        linkedList.addFirst("Pineapple");
        linkedList.addLast("Orange");
        
        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);
        
        // Accessing the first and last elements
        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        
        // Removing elements from the LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);
        
        // Accessing elements by index
        String secondElement = linkedList.get(1);
        System.out.println("Element at index 1: " + secondElement);
    }
}
