package _passover_project.part_2.util;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

public class NBADate
    implements Comparable<NBADate> {

    protected LocalDate date;

    public NBADate() {
        this.date = LocalDate.now();
    }

    public NBADate(int year, int month, int day) {
        this.date = LocalDate.of(year, month, day);
    }

    public int getYear() {
        return date.getYear();
    }

    public int getMonth() {
        return date.getDayOfMonth();
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    @Override
    public int compareTo(@NotNull NBADate nbaDate) {
        return date.compareTo(nbaDate.date);
    }

    public String toString() {
        return getDay() + "." + getMonth() + "." + getYear();
    }
}
