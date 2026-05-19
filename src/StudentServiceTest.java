public class StudentServiceTest {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student("Ali", 20, 90);
        Student s2 = new Student("Leyla", 21, 80);

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println("TEST 1: Add Student -> PASSED");

        service.calculateAverage();

        System.out.println("TEST 2: Average Grade -> PASSED");

        service.searchStudentByName("Ali");

        System.out.println("TEST 3: Search Student -> PASSED");

        service.removeStudent("Ali");

        System.out.println("TEST 4: Remove Student -> PASSED");

        service.findTopStudent();

        System.out.println("TEST 5: Top Student -> PASSED");
    }
}
