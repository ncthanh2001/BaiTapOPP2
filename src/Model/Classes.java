package Model;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	static List<Students> list_Students ;
	String nameClass;
	public Classes(String nameClass) {
		this.nameClass = nameClass;
		list_Students = new ArrayList<>();
	}
	public static void  add_Student(Students student) {
		list_Students.add(student);
	}
	public void outPut() {
		System.out.println("Các sinh viên trong lớp "+nameClass+" gồm : ");
		for (Students students : list_Students) {
			System.out.println(students.toString());
		}
	}
}
