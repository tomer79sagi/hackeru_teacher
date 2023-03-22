package lesson_17.static_attributes;

import java.util.Comparator;

public class Contact implements Comparable<Contact> {
    //props:
    private final long id;
    private final String name;
    private final String phone;

    //static (single):
    private static final Comparator<Contact> nameComparator;
    private static final Comparator<Contact> idComparator;
    private static final Comparator<Contact> phoneComparator;
    private static final Comparator<Contact> namePhoneId;

    //static initialization block ctor for static fields:
    static {
        nameComparator = Comparator.comparing(c -> c.name);
        idComparator = Comparator.comparing(c -> c.id);
        phoneComparator = Comparator.comparing(c -> c.phone);
        namePhoneId = nameComparator.thenComparing(phoneComparator).thenComparing(idComparator);
    }

    public Contact(long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    //toString, getters, hashCode, etc.
    @Override
    public int compareTo(Contact o) {
        return Contact.namePhoneId.compare(this, o);
    }
}