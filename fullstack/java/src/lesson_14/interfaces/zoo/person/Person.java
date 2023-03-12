package lesson_14.interfaces.zoo.person;

import lesson_14.interfaces.zoo.report.IReport;
import lesson_14.interfaces.zoo.report.Printable;

public class Person
        implements Printable, IReport {

    public void print() {
        System.out.println("Printing Person");
    }

    @Override
    public void report() {
        System.out.println("This is the report of a Person");
    }
}
