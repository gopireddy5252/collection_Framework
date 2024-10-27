package com.Queue;

import java.util.*;

public class ArrayDeque1 {

	public static void main(String[] args) {
		/* queue is an interface, its follows fifo order.
		 * ArrayDeque<class>: it's implemnts Deque As well As Queue
		 * Addition: add,addFirst,addLast,offer,offerFirst,offerLast
		 * Retrieval: peek,peekFirst, peekLast
		 * removal :poll,pollFirst,pollLast,remove,removeFirst,removeLast
		 * it is follow the insertion order
		 * default and initial capacity both are 17
		 * null values are not allowed
		 * duplicates are allowed
		 * all Queue's  are not synchronized
		 */
		
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("Apple");
		ad.offer("cherry");
		ad.addFirst("banana");
		ad.offerLast("mango");
		ad.add("kiwi");
		System.out.println(ad);
		System.out.println(ad.peek());// peek() or peekFirst() prints head element 
		System.out.println(ad.peekLast());// it's prints last(tail)element
		System.out.println(ad.poll());
		System.out.println(ad);
	}

}
