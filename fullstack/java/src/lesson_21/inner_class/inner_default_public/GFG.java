package lesson_21.inner_class.inner_default_public;

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args) {

        // Creating an instance of outer class inside main()
        Outer obj1 = new Outer();

        // Creating an instance of inner class inside main()
        Outer.Inner obj2 = obj1.new Inner();

        // Accessing inner class's data member
        System.out.println(obj2.num);
    }
}
