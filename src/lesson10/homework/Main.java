package lesson10.homework;

public class Main {
    public static void main(String[] args) {
        Months[] monthsOfTheYear = Months.values();
        Months.printMonths(monthsOfTheYear);
        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isHoliday());

        // The third problem
        String[] strings = {"tRue", "120", "32000", "147895632", "987654321987654321", "4444.5d", "2354.56f"};
        // Cast and Unboxing
        boolean bool = Boolean.parseBoolean(strings[0]);
        byte b = Byte.valueOf(strings[1]);
        short s = Short.parseShort(strings[2]);
        int value = Integer.valueOf(strings[3]);
        long bigValue = Long.parseLong(strings[4]);
        double d = Double.valueOf(strings[5]);
        float f = Float.parseFloat(strings[strings.length - 1]);
    }
}
