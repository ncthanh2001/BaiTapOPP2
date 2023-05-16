package controller;

import Model.Classes;
import Model.Students;

public class School {
	public static void main(String[] args) {
		Classes classA = new Classes("class A");
		classA.add_Student(new Students("ps21156", "Nguyễn Chí Thanh", 8.0));
		classA.add_Student(new Students("ps1111", "Nguyễn Chí Thanh1", 5.0));
		classA.add_Student(new Students("ps1112", "Nguyễn Chí Thanh2", 6.0));
		
		Classes classB = new Classes("class B");
		classB.add_Student(new Students("ps21156", "Nguyễn Văn B", 10.0));
		classB.add_Student(new Students("ps1111", "Nguyễn Chí C", 7.0));
		classB.add_Student(new Students("ps1112", "Nguyễn Chí D", 9.5));
		
		classA.outPut();
		classB.outPut();
	}
}
