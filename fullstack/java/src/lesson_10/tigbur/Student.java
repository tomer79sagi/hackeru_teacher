package lesson_10.tigbur;

public class Student {
    String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String first_name, String last_name) {
        this.name = first_name + " " + last_name;
    }

    public String toString() {
        return name;
    }
}
