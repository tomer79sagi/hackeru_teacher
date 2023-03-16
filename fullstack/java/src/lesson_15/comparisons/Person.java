package lesson_15.comparisons;

import lesson_14.homework.zoo.report.IReport;
import lesson_14.homework.zoo.report.Printable;

public class Person {
    private String name;
    private int id;

    public Person(int id) {
        this(id, null);
    }

    public Person(int id, String name) {
        setId(id);
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

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;

        // Must match the 'equals()'
        result = PRIME * result + getId();
        result = PRIME * result + getName().hashCode();

        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
