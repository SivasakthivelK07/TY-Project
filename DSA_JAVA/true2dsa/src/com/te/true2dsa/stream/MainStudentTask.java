package com.te.true2dsa.stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStudentTask {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<Student>();

		students.add(new Student("1", "Alice", "Computer Science", 20, 2, 3.8, 0));
		students.add(new Student("2", "Bob", "Electrical Engineering", 21, 3, 3.6, 1));
		students.add(new Student("3", "Charlie", "Mechanical Engineering", 22, 4, 3.7, 2));
		students.add(new Student("4", "David", "Civil Engineering", 23, 1, 3.9, 0));
		students.add(new Student("5", "Eva", "Mathematics", 19, 2, 3.5, 1));
		students.add(new Student("5", "Eva", "Mathematics", 20, 4, 3.4, 5));
		students.add(new Student("6", "Eva", "Mathematics", 19, 2, 3.0, 2));
		students.add(new Student("7", "Eva", "Mathematics", 21, 2, 3.1, 1));
		students.add(new Student("6", "Eva", "Mathematics", 25, 3, 3.5, 3));
		students.add(new Student("5", "Eva", "Mathematics", 24, 2, 3.5, 1));
		students.add(new Student("6", "Frank", "Physics", 20, 3, 3.8, 0));
		students.add(new Student("7", "Grace", "Chemistry", 21, 4, 3.6, 2));
		students.add(new Student("8", "Hank", "Biology", 22, 1, 3.7, 1));
		students.add(new Student("9", "Ivy", "Economics", 23, 2, 3.9, 0));
		students.add(new Student("10", "Jack", "History", 19, 3, 3.5, 2));
		students.add(new Student("11", "Kate", "Philosophy", 20, 4, 3.8, 1));
		students.add(new Student("12", "Leo", "Political Science", 21, 1, 3.6, 0));
		students.add(new Student("13", "Mia", "Sociology", 22, 2, 3.7, 1));
		students.add(new Student("14", "Nina", "Anthropology", 23, 3, 3.9, 0));
		students.add(new Student("15", "Oscar", "Psychology", 19, 4, 3.5, 2));
		students.add(new Student("16", "Paul", "Art", 20, 1, 3.8, 1));
		students.add(new Student("17", "Quincy", "Music", 21, 2, 3.6, 0));
		students.add(new Student("18", "Rachel", "Theater", 22, 3, 3.7, 1));
		students.add(new Student("19", "Sam", "Dance", 23, 4, 3.9, 0));
		students.add(new Student("20", "Tina", "Literature", 19, 1, 3.5, 2));

		System.out.println("==============Before===============");
		students.forEach(System.out::println);
		System.out.println(students.size());

		Map<String, List<Student>> collectMap = students.stream().collect(Collectors.groupingBy(Student::getMajor));

		System.out.println("==============After Converting Map===============");

		Map<String, List<Student>> collectedData = collectMap.entrySet().stream()
				.filter(s -> ((s.getValue().size() > 5)
						&& (s.getValue().stream().mapToDouble(Student::getGpa).average().orElse(0) >= 3.0)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		Map<String, List<Student>> collect = collectedData.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey,
						s -> s.getValue().stream()
								.sorted((Comparator.comparing(Student::getGpa).thenComparing(Student::getAge).reversed()))
								.collect(Collectors.toList())));

		System.err.println(collect.size());
		collect.forEach((k, v) -> {
			System.out.println(k);
			v.forEach(System.out::println);
		});

//		collect2.forEach((k, v) -> {
//			System.out.println(k + " "+v);
//		});

		/*
		 * collectMap.entrySet().stream() .map(Map.Entry::getKey)
		 * .forEach(System.out::println);
		 */

	}

}
