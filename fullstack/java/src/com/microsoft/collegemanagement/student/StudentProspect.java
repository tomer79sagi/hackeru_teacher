package com.microsoft.collegemanagement.student;

import java.util.ArrayList;

public class StudentProspect {
    ArrayList<String> communications;

    public StudentProspect() {
        this.communications = new ArrayList<String>();
    }

    // Example communications
    // "We called the student to offer him a course"
    // "The student called us and inquired about a specific course"
    // "The student asked for the price"
    public void addCommunication(String comm) {
        this.communications.add(comm);
    }

    public String toString() {
        String text = "";

        // Arrays.toString(String[])
        // ArrayList<String> ===>
        for (String communication : communications) {
            text += communication + " ; ";
        }

        return text;
    }
}
