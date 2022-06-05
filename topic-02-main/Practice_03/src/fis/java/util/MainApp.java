package fis.java.util;

import java.util.Collections;
import java.util.Comparator;

public class MainApp {
	public static void main(String[] args) {
		MyStack<Student> myStack = new MyStack<>();

		myStack.push(new Student(1, "Tan", 4.5));
		myStack.push(new Student(2, "Dai", 6.5));
		myStack.push(new Student(3, "Tuan", 5.5));
		myStack.push(new Student(4, "Minh", 8.5));
		myStack.push(new Student(5, "Hung", 3.5));

		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		myStack.sort(comparator);
		
		myStack.forEach(i -> System.out.println(i.toString()));
	}
}
