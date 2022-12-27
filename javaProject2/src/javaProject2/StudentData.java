package javaProject2;

import java.util.Scanner;

public class StudentData {
    public static void main(String[] args){
        // Asking user to enter number of students to call every method for each student
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        for(int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }
    }
}
