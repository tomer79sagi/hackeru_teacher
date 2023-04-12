package _com.microsoft.collegemanagement.student;

import _com.microsoft.collegemanagement.util.IO;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();

    void addStudent() {
        System.out.println("Please enter student name :");
        String studentName = IO.nextString();
        System.out.println("Please enter student age :");
        int studentAge = IO.nextInt();
        students.add(new Student(studentName, studentAge));
    }

    void printStudents() {
        if (students.size() == 0) {
            System.out.println("No students in system");
            return;
        }

        for (int i = 0 ; i<students.size() ; i++) {
            System.out.println(i+1 + ": " + students.get(i));
        }
    }

    void removeStudent() {
        printStudents();

        System.out.println("Please select a student to remove :");
        int studentIndex = IO.nextInt();

        students.remove(studentIndex - 1);
    }

    int getYoungStudentCount() {
        return (int)students.
                stream().
                filter(s -> s.age <= 18).
                count();
    }

    List<Student> getOldStudentsAsArray() {
        return (List<Student>)students.
                stream().
                filter(s -> s.age > 35).
                toList();
    }

    List<Student> searchStudentsByName() {
        System.out.println("Enter text to search by student name :");
        String searchString = IO.nextString();

        return (List<Student>)students.
                stream().
                filter(s -> s.name.contains(searchString)).
                toList();
    }

    void mainMenu() {
        mainMenu:
        while (true) {
            System.out.println("""
                Options:
                1 - Show list of students
                2 - Add new student
                3 - Delete student
                4 - Actions
                5 - Exit
                    """);
            int selection = IO.nextInt();

            switch (selection) {
                case 1 -> printStudents();
                case 2 -> addStudent();
                case 3 -> removeStudent();
                case 4 -> actionsMenu();
                case 5 -> { break mainMenu; }
            }

            System.out.println("--------");
        }
    }

    void actionsMenu() {
        actionsMenu:
        while (true) {
            System.out.println("""
                Options:
                1 - Show count of young students (18 or below)
                2 - Show list of older students (above 35)
                3 - Search students by name
                4 - Back to main menu
                    """);
            int selection = IO.nextInt();

            switch (selection) {
                case 1 -> System.out.println(getYoungStudentCount());
                case 2 -> {
                    List<Student> list = getOldStudentsAsArray();
                    list.forEach(s -> System.out.println(s));
                }
                case 3 -> {
                    List<Student> list = searchStudentsByName();
                    list.forEach(s -> System.out.println(s));
                }
                case 4 -> { break actionsMenu; }
            }

            System.out.println("--------");
        }
    }
}
