import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Average Grade");
            System.out.println("4. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                System.out.print("Enter grade: ");
                double grade = sc.nextDouble();

                students.add(new Student(name, age, grade));

                System.out.println("Student added successfully!");

            } else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No students found.");
                } else {
                    for (Student s : students) {
                        s.displayInfo();
                    }
                }

            } else if (choice == 3) {

                if (students.isEmpty()) {
                    System.out.println("No grades available.");
                } else {

                    double sum = 0;

                    for (Student s : students) {
                        sum += s.grade;
                    }

                    double average = sum / students.size();

                    System.out.println("Average Grade: " + average);
                }

            } else if (choice == 4) {

                System.out.println("Program ended.");
                break;

            } else {

                System.out.println("Invalid choice!");
            }
        }
    }
}