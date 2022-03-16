package inheritance.tasks.second;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = validateSize(side) ? side : 0.0;
    }

    private boolean validateSize(double side) {
        return side > 0;
    }

    public void setSize(double side) {
        this.side = validateSize(side) ? side : 0.0;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
