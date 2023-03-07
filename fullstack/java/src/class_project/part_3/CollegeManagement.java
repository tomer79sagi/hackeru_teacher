package class_project.part_3;

// Manage the college, Students, Teachers, Classes
public class CollegeManagement {

    StudentManagement studentManagement;

    public CollegeManagement() {
        System.out.println("Starting the college management app.");

        // 1. Create new object of StudentManagement
        studentManagement = new StudentManagement();
        studentManagement.menu();
    }

    public static void main(String[] args) {
        CollegeManagement cm = new CollegeManagement();
    }
}