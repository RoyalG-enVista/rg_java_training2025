package com.labexam.q1java8streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Student {
	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id &&
				name.equals(student.name) &&
				marks == student.marks;
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, name, marks);
	}
}

public class Main {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(109, "raj", 95), 95);
		map.put(new Student(61, "keta", 78), 78);
		map.put(new Student(11, "gunika", 98), 98);
		map.put(new Student(19, "keshav", 97), 97);

		System.out.println("Records sorted by name:");
		map.entrySet().stream()
				.sorted(Comparator.comparing(entry -> entry.getKey().getName()))
				.forEach(entry -> {
					Student student = entry.getKey();
					int marks = entry.getValue();
					System.out.println(student.getId() + " " + student.getName() + " " + marks);
				});

		System.out.println("\nRecords sorted by id:");
		map.entrySet().stream()
				.sorted(Comparator.comparingInt(entry -> entry.getKey().getId()))
				.forEach(entry -> {
					Student student = entry.getKey();
					int marks = entry.getValue();
					System.out.println(student.getId() + " " + student.getName() + " " + marks);
				});
	}
}