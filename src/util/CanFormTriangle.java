package util;

public class CanFormTriangle {
    private double sideX;
    private double sideY;
    private double sideZ;

    public double getSideX() {
        return sideX;
    }

    public void setSideX(double sideX) {
        this.sideX = sideX;
    }

    public double getSideY() {
        return sideY;
    }

    public void setSideY(double sideY) {
        this.sideY = sideY;
    }

    public double getSideZ() {
        return sideZ;
    }

    public void setSideZ(double sideZ) {
        this.sideZ = sideZ;
    }
    // Analisa se é possível formar um triangulo e retorna o resultado
    public String displayTriangleResult() {
        if (sideX + sideY > sideZ && sideX + sideZ > sideY && sideY + sideZ > sideX) {
            if (sideX == sideY && sideX == sideZ) {
                return "Equilateral";
            } else if (sideX == sideY || sideX == sideZ || sideY == sideZ) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Not a triangle";
        }
    }

    @Override
    public String toString() {
        return String.format("Result: %s%n", displayTriangleResult());
    }
}
