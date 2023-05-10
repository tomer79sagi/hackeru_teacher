package lesson_26.string_builder;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Tomer").append("Sagi").append("\n").append("John");

        System.out.println(sb);
    }
}
