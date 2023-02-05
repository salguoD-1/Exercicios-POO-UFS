package util;

public class AreaCircle {
    private final double PI = 3.14159;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double raio) {
        this.radius = raio;
    }

    public double areaOfCircle() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return String.format("The area of a circle is: %.1f%n", areaOfCircle());
    }
}
