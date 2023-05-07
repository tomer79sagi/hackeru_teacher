package lesson_25.e_handling_exceptions.a_catch;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c = new Circle(-3);
        }
        catch (NegativeRadiusException e){
            System.out.println(e);
        }
    }
}
