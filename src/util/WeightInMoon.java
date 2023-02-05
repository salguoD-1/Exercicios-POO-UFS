package util;

public class WeightInMoon {
    private final double GRAVITY_IN_MOON = 0.17;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Your weight on the moon is: %.1f Kg%n", weight * GRAVITY_IN_MOON);
    }
}
