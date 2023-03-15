package lesson_14.interfaces.hw.soluion.facility;

import lesson_14.interfaces.hw.soluion.report.IOutput;

public class Cage
    implements IOutput {

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
