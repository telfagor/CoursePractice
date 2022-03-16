package inheritance.tasks.second;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = validateSide(side) ? side : 0.0;
    }

    public void setSide(double side) {
        this.side = validateSide(side) ? side : 0.0;
    }

    private boolean validateSide(double side) {
        return side > 0;
    }

    public double getVolume() {
        return side * side * side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }
}
