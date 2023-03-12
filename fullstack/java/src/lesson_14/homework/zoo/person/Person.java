package lesson_14.homework.zoo.person;

import lesson_14.homework.zoo.report.IReport;
import lesson_14.homework.zoo.report.Printable;

public class Person
        implements Printable, IReport {
    public void print() {
        System.out.println("Printing Person");
    }

    @Override
    public void report() {

    }
}
