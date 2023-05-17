package lesson_28.map;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        String[] countryCodes = Locale.getISOCountries(); // "IL"

        // Exercise 3
        HashMap<String, String> countriesMap = new HashMap<>();

        for (String countryCode : countryCodes) {
            Locale locale = new Locale("", countryCode);
            countriesMap.put(locale.getCountry(), locale.getDisplayCountry());
        }

        // Print list of countries
//        countriesMap.forEach((k, v) -> System.out.println(k + " : " + v));

        // Exercise 4
        HashMap<String, List<String>> abcCountriesMap = new HashMap<>();
        Collection<String> countryVals = countriesMap.values();

        // Iterate over entire country map
        countryVals.forEach(country -> {
            String firstL = country.substring(0, 1);

            // - If this is a new country in the letter, create a List object and add
            if (!abcCountriesMap.containsKey(firstL)) {
                abcCountriesMap.put(firstL, new ArrayList<>(List.of(country)));
            } else {
                abcCountriesMap.get(firstL).add(country);
            }
        });

        abcCountriesMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
