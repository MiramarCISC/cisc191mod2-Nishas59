package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentAnalyzer {

    public static List<Student> filter(List<Student> students, StudentFilter filter) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (filter.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void sort(List<Student> students, Comparator<Student> comparator) {
        students.sort(comparator);
    }

    public static double averageGpa(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }
}