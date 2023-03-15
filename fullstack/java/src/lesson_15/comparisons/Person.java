package lesson_15.comparisons;

import lesson_14.homework.zoo.report.IReport;
import lesson_14.homework.zoo.report.Printable;

public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        // 1. Check if it's the same memory address (cheapest check and most accurate)
        if (this == obj) return true;

        // 2. Check if the 'obj' is NULL or if the Class is not the same, return false;
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Let's cast 'obj' to 'Person' because we know it's the same type
        Person objPerson = (Person)obj;

        // *. Last check to perform
        return getName().equals(objPerson.getName());
    }
}
