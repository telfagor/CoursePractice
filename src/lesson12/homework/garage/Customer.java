package lesson12.homework.garage;

public class Customer {

    private double parkedHours;
    private double clientCharge;

    public void setParkedHours(int parkedHours) {
        if (parkedHours > 0 && parkedHours <= 24) {
            this.parkedHours = parkedHours;
        }
    }

    public double getClientCharge() {
        return clientCharge;
    }

    public void calculateCharges() {
        if (parkedHours >= 1 && parkedHours <= 3) {
            clientCharge = ParkingGarage.getMinCost();
        } else if (parkedHours > 3 && parkedHours < 24) {
            double additionalHours = parkedHours - 3;
            clientCharge = additionalHours * ParkingGarage.getAdditionalCost() + ParkingGarage.getMinCost();
        } else if (parkedHours == 24) {
            clientCharge = ParkingGarage.getMaxCost();
        }
    }
}

