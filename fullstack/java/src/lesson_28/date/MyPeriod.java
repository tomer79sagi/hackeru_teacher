package lesson_28.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MyPeriod {
    public static void main(String[] args) {
//        method1();
//        method2();
//        method3();
        method4();
    }

    private static void method4() {
        String date = "2022 08 09";
//        String date = "2022-08-09";

//        LocalDate birthday = LocalDate.parse(date);
        LocalDate birthday = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy MM dd"));
        System.out.println(birthday); // 2022-08-09
    }

    private static void method3() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2022-10-19T19:59:42.335835

        System.out.println(now.format(DateTimeFormatter.ISO_DATE)); // 2022-10-19
        System.out.println(now.format(DateTimeFormatter.ISO_TIME)); // 20:00:32.043674
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME)); // 2022-10-19T20:00:54.55733

        LocalDate d = LocalDate.now().plusMonths(4);
//        System.out.println(d.format(DateTimeFormatter.ofPattern("mm"))); // m = minutes
        System.out.println(d.format(DateTimeFormatter.ofPattern("M"))); // 5
        System.out.println(d.format(DateTimeFormatter.ofPattern("MM"))); // 05
        System.out.println(d.format(DateTimeFormatter.ofPattern("MMM"))); // Sep
        System.out.println(d.format(DateTimeFormatter.ofPattern("YY---MMMM    dd"))); // September
        System.out.println(d.format(DateTimeFormatter.ofPattern("yy")));
        System.out.println(d.format(DateTimeFormatter.ofPattern("dd")));
        System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy")));

        LocalTime t = LocalTime.now();
        System.out.println(t.format(DateTimeFormatter.ofPattern("HH__mm__ss")));
    }

    private static void method2() {
        iterate(
                LocalDate.now(),
                LocalDate.now().plusYears(3),
                Period.of(0, 1, 13)
        );
    }

    private static void method1() {
        Period p = Period.of(1, 2, 55);//1 year
        Period p2 = Period.ofMonths(1);//1 month
        Period p3 = Period.ofDays(1); //1 day
        Period p4 = Period.ofYears(1);//1 year
        Period p5 = Period.ofWeeks(1); //1 week

        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }

    public static void iterate(LocalDate start, LocalDate end, Period period) {
        //iterate from start to end
        //intervals of 1 month?
        LocalDate current = start;
        while (current.isBefore(end)){
            System.out.println(current);
            current = current.plus(period); //Period implements TemporalAmount
        }
    }
}
