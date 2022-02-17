package lesson10.homework;

public class Main {
    public static void main(String[] args) {
        Months[] monthsOfTheYear = Months.values();
        Months.printMonths(monthsOfTheYear);

        //The second problem
        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isHoliday());
        System.out.println(Weekday.SUNDAY.isWeekDay());
        System.out.println(Weekday.SUNDAY.isHoliday());

        // The third problem
        WrapperClasses.castAndUnboxing();


    }
}
