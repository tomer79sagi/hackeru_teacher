package lesson_14.interfaces.hw.soluion.report;
public interface Printable {

    public final static String PRINTER_NAME = "HP LaserJet";
    public final static String PRINTER_IP_ADDRESS = "192.3.33.23";

    void print();

    default void sendFax() {
        System.out.println("Sending fax!");
    }
}
