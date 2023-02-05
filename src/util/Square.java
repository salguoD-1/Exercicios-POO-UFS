package util;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return side * 4;
    }
    // Retorna a maior área
    public static double biggestSquareArea(double sideX, double sideY) {
        return Math.max(sideX, sideY);
    }
    // Retorna o menor perímetro
    public static double smallestSquarePerimeter(double sideX, double sideY) {
        return Math.min(sideX, sideY);
    }

    @Override
    public String toString() {
        return String.format("Area: %.2f%nPerimeter: %.2f%n", calcArea(), calcPerimeter());
    }
}
