package credit.card.project.card;

import credit.card.project.holder.Holder;

//Data model
public class CreditCard {
    private final long number;
    private final int year;
    private final int month;

    Holder holder; //cartea de credit are posesor

    public CreditCard(long number, int year, int month, Holder holder) {
        this.number = number;
        this.year = year;
        this.month = month;
        this.holder = holder;
    }

    public long getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", year=" + year +
                ", month=" + month +
                ", holder=" + holder +
                '}';
    }
}
