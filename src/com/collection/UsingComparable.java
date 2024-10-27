package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	int empid;
	String empname;
	double salary;
	public Employee(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		//internal logic: return (x < y) ? -1 : ((x == y) ? 0 : 1);
		//return this.empid-e.empid;// sorting the empid(note: if u make '-' in front of this keyword then reverse order
		//return this.empname.toLowerCase().compareTo(e.empname.toLowerCase());
		//return Double.valueOf(this.salary).compareTo(e.salary);// assending order 
		return Double.valueOf(this.salary).compareTo(e.salary);// desending order 
	}
	
}
public class UsingComparable {

	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(102, "Gopi reddy", 700000));
		employee.add(new Employee(101, "reddy", 500000));
		employee.add(new Employee(103, "karthik", 100000));
		employee.add(new Employee(104, "Reddy", 500000));
		System.out.println(employee);
		Collections.sort(employee);
		System.out.println(employee);
	
		
	}

}
