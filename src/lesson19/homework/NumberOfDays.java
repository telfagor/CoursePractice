package lesson19.homework;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class NumberOfDays {

    public static int countDays(LocalDate start, LocalDate end) {
        int counter = 0;
        LocalDate iterator = start;
        while (iterator.isBefore(end)) {
            iterator = iterator.plusDays(1);
            counter++;
        }
        return counter;
    }

    public static Period countDays2(LocalDate start, LocalDate end) {
        return Period.between(start, end);
    }
}
