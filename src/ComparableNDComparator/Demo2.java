package ComparableNDComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Comparator interface:Comparator is used when you want to define multiple 
//  or alternative ways to compare objects of a class (e.g., by name, by age, etc.).
class Student
{
	int sage;
	String sname;
	public Student(int sage, String sname) {
		this.sage = sage;
		this.sname = sname;
	}
	public String toString() {
		return "Student [sid=" + sage + ", sname=" + sname + "]";
	}
	
	
}
public class Demo2 {

	public static void main(String[] args) {
//		Comparator<Student> com=new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student i, Student j) {
//				if(i.sage > j.sage)
//				{
//					return 1;
//				}
//				else {
//					return -1;
//				}
//				
//			}
//		};
		
		//using lambda Expression
		
		Comparator<Student> com=(i,j)->i.sage>j.sage?1:-1;
		List<Student> stu = new ArrayList<>();
		stu.add(new Student(23, "gopi"));
		stu.add(new Student(22, "karthik"));
		stu.add(new Student(20, "raju"));
		stu.add(new Student(24, "james"));
		
		Collections.sort(stu,com);
		//System.out.println(stu);
		for(Student s:stu)
		{
			System.out.println(s);
		}
		
		

	}

}
