package _class_project.part_5.student;

public class Student extends StudentProspect {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        String text = super.toString();

        return text + "\nStudent: " + this.name +" (" + this.age + ")";
    }
}