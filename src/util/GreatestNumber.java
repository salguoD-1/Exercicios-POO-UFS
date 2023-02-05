package util;

public class GreatestNumber {
    private double number1;
    private double number2;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double displayGreatestNumber() {
        return number1 > number2 ? number1 : number2;
    }

    @Override
    public String toString() {
        return String.format("Greatest number between %.1f and %.1f is: %.1f%n", number1, number2, displayGreatestNumber());
    }
}
