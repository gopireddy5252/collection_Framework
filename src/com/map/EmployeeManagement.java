package com.map;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> emp=new LinkedHashMap();
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		while(t)
		{
		System.out.println("Enter 1 for addEmployee:");
		System.out.println("Enter 2 for removeEmployee:");
		System.out.println("Enter 3 for exit:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:addEmployee(emp);
				break;
		case 2:removeEmployee(emp);
				break;
		case 3:System.exit(0);
		
		default:System.out.println("Invalid input");
		}
	}	
}
	private static void removeEmployee(LinkedHashMap<Integer, String> emp) {
		Scanner sc=new Scanner(System.in);
		if(emp.isEmpty())
		{
			System.out.println("list is empty");
		}
		else {
			System.out.println("Enter emp id which employee u want to remove:");
			int removeEmpid=sc.nextInt();
			if(emp.containsKey(removeEmpid))
			{
				emp.remove(removeEmpid);
			}
			else {
				System.out.println("the empid is not found");
			}
		}
		
	}

	private static void addEmployee(LinkedHashMap<Integer, String> emp) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter emp name: ");
		String name=sc.nextLine();
		if(emp.containsKey(id))
		{
			System.out.println("alreay present this "+id);
			System.out.println(emp);
		}
		else {

		emp.put(id, name);
		System.out.println("Empid "+id+" and Emp name "+name+" are added successfully");
		System.out.println(emp);
		}
	}
}
