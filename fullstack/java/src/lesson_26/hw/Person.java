package lesson_26.hw;

public class Person {
    private String firstName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    // Constructor
    public Person(String firstName) {
        try {
            this.setFirstName(firstName);
        } catch(NameTooShortException e) {
            System.out.println(e);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameTooShortException {
        if (firstName == null || firstName.equals(""))
            throw new NameTooShortException("Can't provide null or empty String.");

        this.firstName = firstName;
    }
}
