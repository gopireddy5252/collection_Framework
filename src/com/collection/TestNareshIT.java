package com.collection;
import java.util.ArrayList;
import java.util.List;
class StudentNotAvailableException extends Exception {
    public StudentNotAvailableException(String message) {
        super(message);
    }
}

class NoCourseFoundException extends Exception {
    public NoCourseFoundException(String message) {
        super(message);
    }
}
 class Student1 {
    private int studentId;
    private String name;
    private String course;
    private int noOfMonthCompleted;
    private double syllabusCompleted;

    public Student1(int studentId, String name, String course, int noOfMonthCompleted, double syllabusCompleted) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.noOfMonthCompleted = noOfMonthCompleted;
        this.syllabusCompleted = syllabusCompleted;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getNoOfMonthCompleted() {
        return noOfMonthCompleted;
    }

    public double getSyllabusCompleted() {
        return syllabusCompleted;
    }

    @Override
    public String toString() {
        return "Student [ID=" + studentId + ", Name=" + name + ", Course=" + course +
               ", Months Completed=" + noOfMonthCompleted + ", Syllabus Completed=" + syllabusCompleted + "%]";
    }
}

 class NareshIT {
    private List<Student1> students;

    public NareshIT() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student1 student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void removeStudentBasedOnId(int id) throws StudentNotAvailableException {
        Student1 toRemove = null;
        for (int i=0;i<students.size();i++) {
        	Student1 student=students.get(i);
            if (student != null && student.getStudentId() == id) {
                toRemove = student;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
        } else {
            throw new StudentNotAvailableException("Student with ID " + id + " is not available.");
        }
    }

    public void displayDetails() {
        for (Student1 student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public List<Student1> getPlacementStudents() {
        List<Student1> placementStudents = new ArrayList<>();
        for (Student1 student : students) {
            if (student != null && (student.getSyllabusCompleted() >= 80 || student.getNoOfMonthCompleted() >= 6)) {
                placementStudents.add(student);
            }
        }
        return placementStudents;
    }

    public List<Student1> getStudentsBasedOnCourse(String course) throws NoCourseFoundException {
        List<Student1> courseStudents = new ArrayList<>();
        for (Student1 student : students) {
            if (student != null && student.getCourse().equalsIgnoreCase(course)) {
                courseStudents.add(student);
            }
        }
        if (courseStudents.isEmpty()) {
            throw new NoCourseFoundException("No students found for the course: " + course);
        }
        return courseStudents;
    }
}

public class TestNareshIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NareshIT institute = new NareshIT();

        Student1 s1 = new Student1(1, "Alice", "Java", 6, 85);
        Student1 s2 = new Student1(2, "Bob", "Python", 3, 70);
        Student1 s3 = new Student1(3, "Charlie", "Java", 7, 60);
        Student1 s4 = new Student1(4, "David", "Python", 6, 90);

        institute.addStudent(s1);
        institute.addStudent(s2);
        institute.addStudent(s3);
        institute.addStudent(s4);

        System.out.println("All Students:");
        institute.displayDetails();

        System.out.println("\nPlacement Eligible Students:");
        List<Student1> placementStudents = institute.getPlacementStudents();
        for (Student1 student : placementStudents) {
            System.out.println(student);
        }

        try {
            System.out.println("\nStudents Enrolled in Java Course:");
            List<Student1> javaStudents = institute.getStudentsBasedOnCourse("Java");
            for (Student1 student : javaStudents) {
                System.out.println(student);
            }
        } catch (NoCourseFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            institute.removeStudentBasedOnId(2);
            System.out.println("\nAfter Removing Student with ID 2:");
            institute.displayDetails();
        } catch (StudentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

	}

}
