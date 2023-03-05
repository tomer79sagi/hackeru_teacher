package com.microsoft.collegemanagement;

import com.microsoft.collegemanagement.student.StudentManagement;
import com.microsoft.collegemanagement.student.StudentProspect;

// Manage the college, Students, Teachers, Classes
public class CollegeManagement {

    StudentManagement studentManagement;

    public CollegeManagement() {
        System.out.println("Starting the college management app.");

        // Create 1 prospect
        StudentProspect prospect1 = new StudentProspect();
        prospect1.addCommunication("We called the student to offer him a course");
        prospect1.addCommunication("The student called us and inquired about a specific course");
        prospect1.addCommunication("The student asked for the price");

        System.out.println(prospect1);

//        studentManagement = new StudentManagement();
//        studentManagement.mainMenu();
    }

    public static void main(String[] args) {
        CollegeManagement cm = new CollegeManagement();
    }
}