package Lesson4.homework;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 4_000_000L;
        double days = (double)minutes / 60 / 24;
        double years = days / 365;
        System.out.println(years);
    }
}
