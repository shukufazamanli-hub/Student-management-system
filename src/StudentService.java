import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        students.add(student);

        System.out.println("Student added successfully!");
    }

    public void showStudents() {

        if (students.isEmpty()) {

            System.out.println("No students found.");
        }

        else {

            for (Student s : students) {

                s.displayInfo();
            }
        }
    }

    public void calculateAverage() {

        if (students.isEmpty()) {

            System.out.println("No grades available.");
            return;
        }

        double sum = 0;

        for (Student s : students) {

            sum += s.grade;
        }

        double average = sum / students.size();

        System.out.println("Average Grade: " + average);
    }

    public void findTopStudent() {

        if (students.isEmpty()) {

            System.out.println("No students found.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student s : students) {

            if (s.grade > topStudent.grade) {

                topStudent = s;
            }
        }

        System.out.println("Top Student:");
        topStudent.displayInfo();
    }

    public void searchStudentByName(String name) {

        boolean found = false;

        for (Student s : students) {

            if (s.name.equalsIgnoreCase(name)) {

                s.displayInfo();
                found = true;
            }
        }

        if (!found) {

            System.out.println("Student not found.");
        }
    }

    public void removeStudent(String name) {

        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).name.equalsIgnoreCase(name)) {

                students.remove(i);

                System.out.println("Student removed successfully!");

                removed = true;

                break;
            }
        }

        if (!removed) {

            System.out.println("Student not found.");
        }
    }
}