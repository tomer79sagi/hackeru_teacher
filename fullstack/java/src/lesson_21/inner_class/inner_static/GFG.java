package lesson_21.inner_class.inner_static;

// Class 2
// Main class
// INNER is static
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Inner class object
        Outer.Inner obj2 = new Outer.Inner();
//        int l = new Outer.Inner().k;

        // Accessing inner class's data member
        System.out.println(obj2.num);
    }
}
