package lab9_task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses;

	public Faculty(String name, String address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Course getMaxPracticalCourse() {
		int max = 0;
		Course maxCourse = null;
		for (Course course : courses) {
			if (course.getType().equals("practice")) {
				if (course.numOfStudents() > max) {
					max = course.numOfStudents();
					maxCourse = course;

				}
			}
		}
		return maxCourse;

	}
	
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> map = new HashMap<>();
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				int year = student.getYear();
				if(!map.containsKey(year)) {
					map.put(year, new ArrayList<>());
				}
				map.get(year).add(student);
			}
		}
		
		return map;
	}
	public Set<Course> filterCourses(String type){
		Set<Course> set = new TreeSet<>(new Comparator<Course>() {

			@Override
			public int compare(Course c1, Course c2) {
				return c2.numOfStudents()-c1.numOfStudents();
			}
	
		});
		for (Course course : courses) {
			if(course.sameType(type)) {
				set.add(course);
			}
		}
		return set;
	}
}
