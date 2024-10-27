package com.list;

/*
 * List:
 *  In Java, the List interface is part of the java.util package and represents an ordered collection 
 *  (also known as a sequence) of elements. 
 */
import java.util.ArrayList;
import java.util.List;
//ArrayList: A resizable array implementation of the List. 
//It is fast for random access but slow for insertions and deletions in the middle.
public class ArrayList1 {
    public static void main(String[] args) {
        // Creating a List using ArrayList implementation
        List<String> fruits = new ArrayList<>();
        
        // Adding elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicates are allowed
        
        // Accessing elements by index
        String fruit = fruits.get(2); // Mango
        System.out.println("Element at index 2: " + fruit);
        
        // Iterating through the List
        System.out.println("List of fruits:");
        for (String f : fruits) {
            System.out.println(f);
        }
        
        // Checking if an element exists
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("\nContains Banana: " + hasBanana);
        
        // Removing an element by index
        fruits.remove(3); // Removes "Orange"
        System.out.println("\nAfter removing Orange:");
        for (String f : fruits) {
            System.out.println(f);
        }
        
        // Getting the size of the List
        System.out.println("\nSize of the list: " + fruits.size());
    }
}

