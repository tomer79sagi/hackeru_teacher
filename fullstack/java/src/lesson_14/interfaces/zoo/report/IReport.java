package lesson_14.interfaces.zoo.report;

public interface IReport {
    void report();

    static String prepareReport() {
        return "Preparing report...";
    }
}
