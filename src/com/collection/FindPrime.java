
package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindPrime {
	public static boolean isPrime(int num)
	{
		if(num<=1)return false;
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static ArrayList<Integer> findPrime(ArrayList<Integer> a)
	{
		ArrayList<Integer> prime=new ArrayList<Integer>();
		for(int number: a)
		{
			if(isPrime(number))
			{
				prime.add(number);
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>(Arrays.asList(3,6,5,1,2,10));
		ArrayList<Integer> array=findPrime(a1);
		System.out.println("prime numbers are:"+array);
		
		
	// to create 
		List<Integer> a = Collections.unmodifiableList(a1);
		//a.add(12);// it will raise the Exception we can't modify the a
		//System.out.println(a);
		// to print same element number of times at a time
//		List<String> a=Collections.nCopies(5, "java");
//		System.out.println(a);

	}

}
