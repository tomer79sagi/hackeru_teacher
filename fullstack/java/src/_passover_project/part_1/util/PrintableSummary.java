package _passover_project.part_1.util;

public interface PrintableSummary {
    public default void printSummary() {
        System.out.println(this);
    }
}
