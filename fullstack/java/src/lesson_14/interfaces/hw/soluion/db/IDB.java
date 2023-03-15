package lesson_14.interfaces.hw.soluion.db;

public interface IDB {
    String serverName = "MongoDB";

    public static boolean connect() {
        System.out.println("Connected to DB");
        return true;
    }

    public static boolean disconnect() {
        System.out.println("Disconnected from DB.");
        return true;
    }

    default public boolean save() {
        System.out.println("Saved '" + this.getClass() + "' into database");
        return true;
    }

    default public boolean delete() {
        System.out.println("Deleted '" + this.getClass() + "' from database");
        return true;
    }

    public boolean update(String value);
}
