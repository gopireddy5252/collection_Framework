package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int sid;
    String sname;

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + "]";
    }
}

class CustomSorting implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.sid, s2.sid);
    	//return s1.sname.toLowerCase().compareTo(s2.sname.toLowerCase());
    }
}

public class UsingComparator {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        a.add(new Student(4, "gopi"));
        a.add(new Student(1, "suresh"));
        a.add(new Student(3, "mohan"));
        a.add(new Student(2, "karthik"));

        System.out.println("Before sorting:");
//        for (Student s : a) {
//            System.out.println(s);
//        }
        System.out.println(a);
        // by using custom class
        CustomSorting cs = new CustomSorting();
        Collections.sort(a, cs);
        System.out.println(a);
        
        //by using lamda Expresion
        //Collections.sort(a,(s1,s2)->(s1.sid-s2.sid)); 
        //System.out.println(a);
        
        //by using anonymous class
        Collections.sort(a, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.sname.toLowerCase().compareTo(s2.sname.toLowerCase());
            }
        });
        

        System.out.println("\nAfter sorting by sid:");
        for (Student s : a) {
            System.out.println(s);
        }
    }
}
