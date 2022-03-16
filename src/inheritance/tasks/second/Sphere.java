package inheritance.tasks.second;

import java.time.temporal.ValueRange;

public class Sphere extends ThreeDimensionalShape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = validateRadius(radius) ? radius : 0.0;
    }

    public void setRadius(double radius) {
        this.radius = validateRadius(radius) ? radius : 0.0;
    }

    private boolean validateRadius(double radius) {
        return radius > 0;
    }

    public double getVolume() {
        return (double) 4 / 3 * Math.PI * radius * radius * radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}
