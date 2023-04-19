package lesson_21.inner_class.inner_static;

// Class 1
// Outer class
class Outer {

    int age = 22;
    static int grade = 99;

    Outer() {
        Inner i = new Inner();
        System.out.println(i.num);
        System.out.println(Inner.k);
    }

    // Static inner class
    static class Inner {

        // Inner class member variable
        int num = 10;
        static int k = 4;

        Inner() {
//            System.out.println(age); // Can't access
            System.out.println(grade);
        }
    }
}
