package lab9_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Course {
	private String id;
	private String tittle;
	private String type;
	private List<Student> students;
	private String lecturer;

	public Course(String id, String tittle, String type, List<Student> students, String lecturer) {
		this.id = id;
		this.tittle = tittle;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", tittle=" + tittle + ", type=" + type + ", students=" + students + ", lecturer="
				+ lecturer + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public int numOfStudents() {
		return students.size();
	}

	public List<Student> listOfSt(int year) {
		List<Student> list = new ArrayList<>();
		for (Student student : students) {
			if (student.getYear() == year) {
				list.add(student);
			}
		}
		return list;
	}

	public boolean sameType(String type) {
		return this.type.equals(type);
			
	}

}
