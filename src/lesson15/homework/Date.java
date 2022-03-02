package lesson15.homework;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.month = validateMonth(month) ? month : 0;
        this.day = validateDay(day) ? day : 0;
        this.year = validateYear(year) ? year : 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = validateDay(day) ? day : 0;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = validateMonth(month) ? month : 0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = validateYear(year) ? year : 0;
    }

    private boolean validateYear(int year) {
        return year > 0;
    }

    private boolean validateMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean validateDay(int day) {
        return switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> day >= 1 && day <= 31;
            case 2 -> day >= 1 && day <= 28;
            case 4, 6, 9, 11 -> day >= 1 && day <= 30;
            default -> false;
        };
    }

    public void displayDate() {
        if (day == 0 || month == 0 || year == 0) {
            System.out.println("The day or month or year is incorrectly");
        } else {
            System.out.println(day + "/" + month + "/" + year);
        }
    }
}
