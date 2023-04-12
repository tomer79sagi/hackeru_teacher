package _passover_project.part_2.util;

public interface PrintableSummary {
    public default void printSummary() {
        System.out.println(this);
    }
}
