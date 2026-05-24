package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",   3.9, 1));
        students.add(new Student("Bob",     2.8, 2));
        students.add(new Student("Carol",   3.5, 3));
        students.add(new Student("David",   1.9, 4));
        students.add(new Student("Eve",     4.0, 5));

        // Demonstrate filtering — GPA above 3.5
        System.out.println("=== Students with GPA > 3.5 ===");
        List<Student> highGpa = StudentAnalyzer.filter(students, s -> s.getGpa() > 3.5);
        highGpa.forEach(System.out::println);

        // Demonstrate sorting — GPA descending, name ascending as tiebreaker
        System.out.println("\n=== Sorted by GPA descending, name ascending ===");
        StudentAnalyzer.sort(students, (s1, s2) -> {
            int cmp = Double.compare(s2.getGpa(), s1.getGpa());
            if (cmp != 0) return cmp;
            return s1.getName().compareTo(s2.getName());
        });
        students.forEach(System.out::println);

        // Print average GPA
        System.out.printf("%n=== Average GPA: %.2f ===%n",
                StudentAnalyzer.averageGpa(students));
    }
}