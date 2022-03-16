package inheritance.tasks.second;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = validateRadius(radius) ? radius : 0.0;
    }

    public void setRadius(double radius) {
        this.radius = validateRadius(radius) ? radius : 0.0;
    }

    private boolean validateRadius(double radius) {
        return radius > 0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
