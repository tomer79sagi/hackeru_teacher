package lesson_14.interfaces.zoo.facility;

import lesson_14.interfaces.zoo.report.IReport;
import lesson_14.interfaces.zoo.report.Printable;

public class Cage
    implements IReport, Printable {

    public Cage() {
    }
    @Override
    public void report() {
        System.out.println("This is the report for Cage.");
    }

    @Override
    public void print() {
        System.out.println("This is the printout of Cage.");
    }
}
