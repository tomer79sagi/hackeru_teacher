package lesson_21.mydate_enum;

import java.time.LocalDate;

public record MyDate(int year, MonthEnum month, int day) {
    public MyDate {
        if (year > 2100 || year < 2000)
            throw new IllegalArgumentException("Year must be between 2000 and 2099");

        if (day > 31 || day < 1)
            throw new IllegalArgumentException("Day must be between 1 and 31");
    }

    public MyDate() {
        this(LocalDate.now().getYear(),
                MonthEnum.findEnumFromInt(LocalDate.now().getMonthValue()),
                LocalDate.now().getDayOfMonth());
    }

    public MyDate(int year) {
        this(year,
                MonthEnum.findEnumFromInt(LocalDate.now().getMonthValue()),
                LocalDate.now().getDayOfMonth());
    }

    public MyDate(int year, MonthEnum month) {
        this(year, month, LocalDate.now().getDayOfMonth());
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
        MyDate d = new MyDate(2023, MonthEnum.FEBRUARY);
    }
}
