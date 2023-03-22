public class Person {
    private String name;
    private int age;

    public Person(String _______, int age) {
        this.name = name;
        this._______ = age;
    }

    @Override
    public boolean _______(Object o) {
        if (o == null || ___________() != o.getClass()) return false;
        Person person = (______) o;
        return age == person.age && name._______(person.name);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + age;
        result = 31 * result + name._______();
        return result;
    }
}

    // Usage
    Person p1 = new Person("Alice", 30);
    Person p2 = new Person("Bob", 25);
    Person p3 = new Person(______, 30);
    System.out.println(p1.equals(p2)); // false
    System.out.println(p1.equals(______)); // true
    System.out.println(p1.hashCode()); // 83257955
