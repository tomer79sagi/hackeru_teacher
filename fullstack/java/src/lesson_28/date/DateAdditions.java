package lesson_28.date;

import java.time.LocalDate;

public class DateAdditions {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 10, 19);//now()
        System.out.println(date);//2022-10-19 //Year-Month-Day

        date = date.plusDays(13);
        System.out.println(date);//2022-11-01
    }
}
