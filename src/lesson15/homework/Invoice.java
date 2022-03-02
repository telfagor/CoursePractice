package lesson15.homework;

public class Invoice {

    private String model;
    private String description;
    private double price;
    private int qty;

    public Invoice(String model, String description, double price, int qty) {
        this.model = model;
        this.description = description;
        this.price = validatePrice(price) ? price : 0.0;
        this.qty = validateQty(qty) ? qty : 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = validatePrice(price) ? price : 0.0;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = validateQty(qty) ? qty : 0;
    }

    public double getAmount() {
        return qty * price;
    }

    private boolean validatePrice(double price) {
        return price > 0;
    }

    private boolean validateQty(int qty) {
        return qty > 0;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Invoice: " + model
        + ", description: " + description
        + ", quantity: " + qty
        + ", price for a product: " + price + "$";
    }
}
