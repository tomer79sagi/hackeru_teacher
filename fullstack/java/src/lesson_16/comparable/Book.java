package lesson_16.comparable;

public class Book
        implements Comparable {
    private int ISBN;
    private String name;
    private String authorName;

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public Book(int ISBN, String name, String authorName) {
        setISBN(ISBN);
        setName(name);
        setAuthorName(authorName);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean equals(Object obj) {

        // 1. Check if it's the same memory address (cheapest check and most accurate)
        if (this == obj) return true;

        // 2. Check if the 'obj' is NULL or if the Class is not the same, return false;
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Let's cast 'obj' to 'Person' because we know it's the same type
        Book book = (Book)obj;

        // 4. Check ISBN
        if (getISBN() != book.getISBN()) return false;

        // *. Last check to perform
        return getName().equals(book.getName());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Book book) {
//            Book book = (Book)o;
            int diff = getName().compareTo(book.getName());

            System.out.println(getName() + " | " + book.getName() + " | " + diff);
            return diff;
        }

        // If not the same instance, generate exception
        throw new RuntimeException("Can't compare Book to class '" + o.getClass().getSimpleName() + "'");
    }
}
