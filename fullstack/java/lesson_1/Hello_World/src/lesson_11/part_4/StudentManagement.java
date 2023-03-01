package lesson_11.part_4;

import java.util.ArrayList;

public class StudentManagement {

//    static Student[] students = new Student[0];
    static ArrayList<Student> students = new ArrayList();

    public static void main(String[] args) {
        students.add(new Student("Tomer", 23));
        students.add(new Student("John", 33));
        students.add(new Student("Michael", 53));

        ArrayList filteredStudents = (ArrayList<Student>)students.stream().filter(s -> s.age < 40).toList();
    }

}
