package lesson_21.mydate_enum;

import java.util.Arrays;
import java.util.List;

public enum MonthEnum {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6),
    JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    private final int month;

    MonthEnum(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    // Method for converting 'int' to MonthEnum
    public static MonthEnum findEnumFromInt(int v) {
        MonthEnum[] values = values();

        return Arrays.stream(values).filter(m -> m.getMonth() == v).
                findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid month value"));
    }

    public String toString() {
        return String.valueOf(month);
    }
}
