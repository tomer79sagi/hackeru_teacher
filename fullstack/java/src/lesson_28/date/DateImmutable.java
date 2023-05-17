package lesson_28.date;

import java.time.LocalDate;
import java.time.Month;

public class DateImmutable {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 10, 19);//now()
        //No Setters!, only Getters!
        //Dates are Immutable

        System.out.println(date);//2022-10-19 //Year-Month-Day

        date = date.plusDays(13);
        System.out.println(date);//2022-11-01

        LocalDate d2 = LocalDate.of(2022, Month.FEBRUARY, 29);//DateTimeException:
    }
}
