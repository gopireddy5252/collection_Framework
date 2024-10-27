package com.collection;

import java.util.ArrayList;
class DuplicateArrayList
{
	public static ArrayList addDuplicates(ArrayList a)
	{
		ArrayList doop=new ArrayList();
		int count=0;
		for(int i=0;i<a.size()-1;i++)
		{
			count=0;
			if((Integer)a.get(i)!=-1)
			{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).equals(a.get(j)))
				{
					count++;
					a.set(j, -1);
				}
			}
			if(count>0)
			{
				doop.add(a.get(i));
			}
				
			}
		}
		return doop;
	}
	
}
public class findDuplicateINList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(20);
		a.add(10);
		a.add(30);
		System.out.println(a);
		System.out.println(DuplicateArrayList.addDuplicates(a));
	}

}
