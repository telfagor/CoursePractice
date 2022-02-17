package lesson9.homework.area.rectangle;

public class Area {

    private double width;
    private double height;

    public void setDim(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getDim() {
        return width * height;
    }
}
