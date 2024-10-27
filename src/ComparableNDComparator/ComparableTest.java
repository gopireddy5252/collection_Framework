package ComparableNDComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Comparable interface:Comparable is used when you want to define a default
//                      natural ordering for objects of a class.
class Student1 implements Comparable<Student1>
{
	int sage;
	String sname;
	public Student1(int sage, String sname) {
		this.sage = sage;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student1 [sage=" + sage + ", sname=" + sname + "]";
	}
	@Override
	public int compareTo(Student1 that) {
		if(this.sage>that.sage)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
}
public class ComparableTest {

	public static void main(String[] args) {
		List<Student1> stu = new ArrayList<>();
		stu.add(new Student1(16, "roja"));
		stu.add(new Student1(18, "raja"));
		stu.add(new Student1(15, "raju"));
		stu.add(new Student1(20, "rochy"));
		Collections.sort(stu);
		for(Student1 s:stu)
		{
			System.out.println(s);
		}

	}

}
