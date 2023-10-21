
/* 6. Write a program to display grade according to the marks obtained by the student. */
import java.util.Scanner;

public class StudentGradeSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks : ");
        int marks = sc.nextInt();
        sc.close();
        System.out.print("Student grade is : ");
        if (marks >= 90 && marks <= 100) {
            System.out.print("O"); // O --> Outstanding
        } else if (marks >= 80 && marks <= 89) {
            System.out.print("A+"); // A+ --> Excellent
        } else if (marks >= 70 && marks <= 79) {
            System.out.print("A"); // A --> Very Good
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("B+"); // B+ --> Good
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("B"); // B --> Above Average
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("C"); // C --> Average
        } else if (marks >= 35 && marks <= 39) {
            System.out.println("P"); // P --> Pass
        } else {
            System.out.println("F"); // F --> Fail
        }
    }
}
