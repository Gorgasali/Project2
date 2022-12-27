package javaProject2;

import java.util.Scanner;

public class Student {
    private String firsName;
    private  String lastName;
    private  String gradeYear;
    private String courses = "" ;
    private String studentID;
    private static int costOfCourse = 600;  // Cost for each class
    private int tuitionBalance = 0;
    private static int id = 1000;           // Base four digits for student ID
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firsName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        // List of university year names
        System.out.println("1 - Freshmen\n2 for Sophomore \n3 -Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();
        setStudentId();
    }
    private void setStudentId(){
        id++;                   // Incrementing id number
         this.studentID = gradeYear + "" + id;
    }
    // This method gives user opportunity to add courses
    public void enroll(){
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses +=( "\n " + course);
                tuitionBalance += costOfCourse;
            } else {
                System.out.println("BREAK!");
                break;
            }
        }
        while(1 != 0); // This loop will iterate until user enters "Q"
    }
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // This method checks balance and asks user to pay for classes
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // This method will return all information collected from the user
    public String showInfo(){
        return "Name: " +firsName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
