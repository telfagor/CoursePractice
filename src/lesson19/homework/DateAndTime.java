package lesson19.homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void printLocalDate() {
        LocalDate ld = LocalDate.of(2022, Month.MARCH, 9);
        LocalDate ld2 = LocalDate.now();
        LocalDate ld3 = LocalDate.parse("2022-03-09");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
        LocalDate ld4 = LocalDate.parse("2022-03-09", dtf);
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld.format(dtf));
        System.out.println(dtf.format(ld));
        //System.out.println(ld.format(dtf2));
    }

    public static void printLocalTime() {
        LocalTime lt = LocalTime.of(16, 30, 26);
        LocalTime lt2 = LocalTime.parse("16:30:26");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        //DateTimeFormatter dtf2 = DateTimeFormatter.ISO_TIME;
        LocalTime lt3 = LocalTime.parse("12:33:57", dtf1);
        System.out.println(lt);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt.format(dtf1));
        //System.out.println(lt.format(dtf2));
    }

    public static void printLocalDateTime() {
        LocalDateTime ldt = LocalDateTime.of(2022, 3, 9, 16, 43, 34);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse("2022-03-09 16:47:38", dtf1);
        System.out.println(ldt);
        System.out.println(ldt2.format(dtf1));
    }
}
