package lab9_task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	Student st1 = new Student("1", "A", 2000);
	Student st2 = new Student("2", "B", 2003);
	Student st3 = new Student("3", "C", 2002);
	Student st4 = new Student("4", "D", 2003);
	Student st5 = new Student("5", "E", 2002);
	List<Student> list1 = new ArrayList<>();
	list1.add(st1);
	list1.add(st2);
	List<Student> list2 = new ArrayList<>();
	list2.add(st1);
	list2.add(st2);
	list2.add(st3);
	

	Course c1 = new Course("1", "DSA", "practice", list1,"Mr.Du");
	Course c2 = new Course("2", "AI", "practice", list2,"Mr.Du");
	Course c3 = new Course("3", "AI", "theory", list2,"Mr.Du");
	
	List<Course> listCourse = new ArrayList<>();
	listCourse.add(c1);
	listCourse.add(c2);
	listCourse.add(c3);
		
	Faculty f1 = new Faculty("IT", "abc123", listCourse);
	
//	System.out.println(f1.getMaxPracticalCourse().toString());
//	System.out.println(f1.filterCourses("practice").toString());
	System.out.println(f1.groupStudentsByYear());
}
}
