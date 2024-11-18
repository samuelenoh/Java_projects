package org.example;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student score: ");
            int score = scanner.nextInt();
            students[i] = new Student(name, score);
        }
        scanner.close();

        for (Student student : students) {
            System.out.println(student.getName() + "'s Grade: " + student.getGrade());
        }
    }
}