package class_project.part_4;

// Manage the college, Students, Teachers, Classes
public class CollegeManagement {

    StudentManagement studentManagement;

    public CollegeManagement() {
        System.out.println("Starting the college management app.");

        studentManagement = new StudentManagement();
        studentManagement.mainMenu();
    }

    public static void main(String[] args) {
        CollegeManagement cm = new CollegeManagement();
    }
}