package lesson_18.mutable_immutable;

import java.util.ArrayList;
import java.util.List;

// Immutable Collection (List)
public class PeopleManager {

    // Define and initialize an ArrayList attribute called people (we want this to be immutable in the class)
    private final List<Person1> people = new ArrayList<>(List.of(new Person1("Tomer")));

    public PeopleManager() {}
    public static void main(String[] args) {
        // 1. Create a new instance of the 'immutable' PeopleManager
        PeopleManager pManager = new PeopleManager();

        // 2. Use the standard 'getter' to get the list of people
        List<Person1> peeps = pManager.getPeople(); // THIS IS THE PROBLEM, returns the original reference

        // 3. Print the contents of the original people collection
        System.out.println("\nPrint existing PeopleManager");
        peeps.forEach(System.out::println);

        // 4. Add a new object to the 'peeps' object (pointing currently to the same original 'people' object
        // This should not affect the original ArrayList in the 'immutable' PeopleManager
        peeps.add(new Person1("Sagi"));

        // 5. Print 'peeps'
        System.out.println("\nTrying to add a new element to an immutable Class");
        peeps.forEach(System.out::println);

        // 6. Print 'pManager.getPeople()' -> we see that this was ALSO updated, BAD NEWS
        System.out.println("\nThe original ArrayList");
        pManager.getPeople().forEach(System.out::println);

        // 7. Make sure our Person object is immutable by using the copy constructor
        Person1 p = new Person1("Tomer");
        Person1 p2 = new Person1(p);
    }

    public List<Person1> getPeople() {
//        return people; // This is NOT RIGHT

        return new ArrayList<>(people);
    }
}
