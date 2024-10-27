package com.list;

import java.util.Vector;
/*
 * Vector:
 in Java, a Vector is a collection class,and implements the List interface
 which can grow or shrink as needed to accommodate adding and removing elements.
 It is part of the java.util package ,
  providing similar functionality to ArrayList.
  However, the key difference is that Vector is synchronized,
  meaning it is thread-safe for use in multi-threaded environments,
  whereas ArrayList is not synchronized. 
 
 */

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();
        
        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        vector.add("Orange");
        
        // Displaying the Vector
        System.out.println("Vector: " + vector);
        
        // Accessing an element by index
        String fruit = vector.get(2); // Mango
        System.out.println("Element at index 2: " + fruit);
        
        // Removing an element
        vector.remove(1); // Removes "Banana"
        System.out.println("After removing Banana: " + vector);
        
        // Checking the size and capacity
        System.out.println("Size of the Vector: " + vector.size());
        System.out.println("Capacity of the Vector: " + vector.capacity());
        
        // Adding more elements to see dynamic resizing
        vector.add("Pineapple");
        vector.add("Grapes");
        System.out.println("After adding more elements: " + vector);
    }
}
