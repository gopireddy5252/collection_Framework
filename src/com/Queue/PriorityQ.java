package com.Queue;

import java.util.*;

/*
 * PriorityQueue:-> this Priority Queue is purely implementation of Queue
 * default and initial capacity is 11.
 * 1.offer(): add the elements to the Queue
 * 2.peek(): for Retrieval the head element
 * 3.poll: for delete the elements
 * what is diff b/w remove() and poll()
 * 	1.if empty queue is there then u trying to poll() method then it will print null
 * 	2.but remove() method raise the Exception(noSuchElementException)
 */
public class PriorityQ {

	public static void main(String[] args) {
		
		Queue<Integer> pq=new PriorityQueue<Integer>();
		pq.offer(6);
		pq.add(10);
		pq.offer(2);
		pq.offer(4);
		pq.add(7);
		System.out.println(pq);// output:[2, 4, 6, 10, 7] first priority(head) goes to lower int value
		// this not follow the any order,but only first priority lower Integer value
		System.out.println(pq.peek());// 2(head element)
		System.out.println(pq.poll());//2 retrive and remove the head element
		System.out.println(pq);//[4, 7, 6, 10] second most lower Integer value assign the head value
		
		// dont use foreach loop beacuase this foreach loop does't follow priority
//		for (Integer ele : pq) {
//			System.out.println(ele);
//			}
		//use while loop
       while(!pq.isEmpty())
       {
    	   System.out.println(pq.poll());
       }
       System.out.println(pq);
		// i want highest Integer value have highest Priority then
		Queue<Integer> pq1=new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq1.offer(6);
		pq1.add(10);
		pq1.offer(2);
		pq1.offer(4);
		pq1.add(7);
		System.out.println(pq1);
		while(!pq1.isEmpty())
		{
			System.out.println(pq1.poll());// first priority is 10
		}
	}
}









