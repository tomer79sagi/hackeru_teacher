package lesson_10;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class StreamStringMethods {
    public static void main(String[] args) {
        String searchText = "va";

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("Tomer Sagi");
        numbers.add("Aviad Vaknin");
        numbers.add("Shimon Vaknin");
        numbers.add("Daniel Valigratin");

        List names = numbers.stream().filter(str -> str.toLowerCase().contains(searchText.toLowerCase())).toList();
//        List names = numbers.stream().filter(str -> str.toLowerCase().startsWith(searchText.toLowerCase())).toList();
//        List names = numbers.stream().filter(str -> str.toLowerCase().endsWith(searchText.toLowerCase())).toList();
        names.forEach( n -> System.out.println(n) );
    }
}
