package lesson6.homework;

public class TernaryOperator {
    public static void main(String[] args) {
        int colorCode = 101;
        String color = "null";
        color = (colorCode == 100) ? "Yellow" :  (colorCode == 101)
                ? "Green" : (colorCode == 102) ? "Red" : "Invalid";
        System.out.println("Color: " + color);
    }
}
