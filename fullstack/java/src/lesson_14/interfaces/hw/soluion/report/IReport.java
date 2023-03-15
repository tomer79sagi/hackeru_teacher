package lesson_14.interfaces.hw.soluion.report;

public interface IReport {
    void report();

    static String prepareReport() {
        return "Preparing report...";
    }
}
