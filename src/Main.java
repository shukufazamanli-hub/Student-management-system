import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StudentService service = new StudentService();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show Students");
            System.out.println("3. Average Grade");
            System.out.println("4. Top Student");
            System.out.println("5. Search Student");
            System.out.println("6. Remove Student");
            System.out.println("7. Exit");

            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    addStudent();
                    break;

                case 2:

                    service.showStudents();
                    break;

                case 3:

                    service.calculateAverage();
                    break;

                case 4:

                    service.findTopStudent();
                    break;

                case 5:

                    searchStudent();
                    break;

                case 6:

                    removeStudent();
                    break;

                case 7:

                    System.out.println("Program ended.");
                    running = false;
                    break;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addStudent() {

        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter grade: ");
        double grade = sc.nextDouble();

        Student student = new Student(name, age, grade);

        service.addStudent(student);
    }

    public static void searchStudent() {

        sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        service.searchStudentByName(name);
    }

    public static void removeStudent() {

        sc.nextLine();

        System.out.print("Enter student name to remove: ");
        String name = sc.nextLine();

        service.removeStudent(name);
    }
}