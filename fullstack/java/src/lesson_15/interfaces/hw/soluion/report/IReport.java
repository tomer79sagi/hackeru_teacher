package lesson_15.interfaces.hw.soluion.report;

public interface IReport {
    void report();

    static String prepareReport() {
        return "Preparing report...";
    }
}
