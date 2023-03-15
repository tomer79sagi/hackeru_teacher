package lesson_15.interfaces.hw.soluion.person;

import lesson_15.interfaces.hw.soluion.db.IDB;
import lesson_15.interfaces.hw.soluion.report.Printable;

public class Person
        implements Printable, IDB {

    private String name;

    public Person(String name) {
        setName(name);
    }

    public void print() {
        System.out.println("Printing Person");
    }

    @Override
    public boolean update(String criteria) {
        System.out.println("Updating '" + criteria + "'...");

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
