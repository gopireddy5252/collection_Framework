package com.map;

import java.util.LinkedHashMap;
import java.util.Scanner;

//LikedHashMap: Similar to HashMap, but maintains insertion order.
public class StudentGrade {

	public static void main(String[] args) {
		LinkedHashMap<String,String> grade=new LinkedHashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		boolean boo=true;
		while(boo) {
		System.out.println("Enter 1 for Addstudent");
		System.out.println("Enter 2 for removestudent");
		System.out.println("Enter 3 for exit");
		int choice=sc.nextInt();
			switch(choice)
			{
			case 1:addStudent(grade);
					break;
			case 2:removeStudent(grade);
					break;
			case 3:System.exit(0);
			default:System.out.println("Invalid input");
			}
		}
	}

	private static void removeStudent(LinkedHashMap<String, String> grade) {
		if(grade.isEmpty())
		{
			System.out.println("this entry is not there in grade book");
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student name whose grade u want to delete: ");
			String removestd=sc.nextLine();
			grade.remove(removestd);
			System.out.println(removestd+" is sucussfully removed ");
			}
		
	}

	private static void addStudent(LinkedHashMap<String, String> grade) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name: ");
		String name=sc.nextLine();
		System.out.println("Enter student Grade: ");
		String g=sc.nextLine();
		if(grade.containsKey(name))
		{
			System.out.println("Alray availabe this "+name+" entry");
		}
		else {
			grade.put(name, g);
			System.out.println(name+" and "+g+" succussfully added");
			System.out.println(grade);
		}
		
	}
}
