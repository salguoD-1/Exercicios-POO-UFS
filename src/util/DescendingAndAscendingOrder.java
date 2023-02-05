package util;

public class DescendingAndAscendingOrder {
    private double number1;
    private double number2;
    private double number3;

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

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }
    // Ordena de forma descrescente
    public String orderByDescending() {
        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                return number1 + " " + number2 + " " + number3;
            } else {
                return number1 + " " + number3 + " " + number2;
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                return number2 + " " + number1 + " " + number3;
            } else {
                return number2 + " " + number3 + " " + number1;
            }
        } else {
            if (number1 > number2) {
                return number3 + " " + number1 + " " + number2;
            } else {
                return number3 + " " + number2 + " " + number1;
            }
        }
    }
    // Ordena de forma crescente
    public String orderByAscending() {
        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                return number3 + " " + number2 + " " + number1;
            } else {
                return number2 + " " + number3 + " " + number1;
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                return number3 + " " + number1 + " " + number2;
            } else {
                return number1 + " " + number3 + " " + number2;
            }
        } else {
            if (number1 > number2) {
                return number2 + " " + number1 + " " + number3;
            } else {
                return number1 + " " + number2 + " " + number3;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Decending order: %s%nAscending order: %s%n", orderByDescending(), orderByAscending());
    }
}
