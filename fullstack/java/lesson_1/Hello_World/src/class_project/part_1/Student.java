package class_project.part_1;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name: " + this.name +"\n" +"Student age: " + this.age + "\n -----------";
    }
}