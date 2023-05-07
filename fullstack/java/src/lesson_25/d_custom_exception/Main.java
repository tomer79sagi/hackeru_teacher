package lesson_25.d_custom_exception;

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
