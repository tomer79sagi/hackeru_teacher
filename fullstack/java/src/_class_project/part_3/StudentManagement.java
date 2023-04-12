package _class_project.part_3;

import java.util.ArrayList;

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

    void menu() {
        mainMenu:
        while (true) {
            System.out.println("""
                Options:
                1 - Show list of students
                2 - Add new student
                3 - Delete student
                4 - Exit
                    """);
            int selection = IO.nextInt();

            switch (selection) {
                case 1 -> printStudents();
                case 2 -> addStudent();
                case 3 -> removeStudent();
                case 4 -> { break mainMenu; }
            }

            System.out.println("--------");
        }
    }
}
