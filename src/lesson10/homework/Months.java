package lesson10.homework;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static void printMonths(Months[] monthsOfTheYear) {
        for (Months month : monthsOfTheYear) {
            System.out.println(month);
        }
    }
}
