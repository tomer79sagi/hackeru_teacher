package lesson_21.inner_class;

import java.util.ArrayList;
import java.util.List;

public class Simple {
    private List<Room> rooms = new ArrayList<>();
    public Simple(int numRooms) {
        for (int i = 0; i < numRooms; i++) {
            rooms.add(new Room());
        }
    }
    private class Room {
        @Override
        public String toString() {
            System.out.println("Size: " + rooms.size());
            return "";
        }
    }

    public String toString() {
//        rooms.forEach(r -> s.concat(r.toString()));
        return "";
    }

    public static void main(String[] args) {
        Simple s = new Simple(3);
        System.out.println(s);
    }
}
