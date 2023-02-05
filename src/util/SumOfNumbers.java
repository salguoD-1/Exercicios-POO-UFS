package util;

public class SumOfNumbers {
    private int number1;
    private int number2;
    private int sum = 0;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int sumBetweenTwoNumbers1() {
        int aux1 = Math.min(number1, number2);
        int aux2 = Math.max(number1, number2);

        for (int i = aux1; i <= aux2; i++) {
            sum = i + aux2;
        }

        return sum;
    }

    public int sumBetweenTwoNumbers2() {
        int aux1 = Math.min(number1, number2);
        int aux2 = Math.max(number1, number2);

        while (aux1 <= aux2) {
            sum = aux1 + aux2;
            aux1++;
        }

        return sum;
    }

    public int sumBetweenTwoNumbers3() {
        int aux1 = Math.min(number1, number2);
        int aux2 = Math.max(number1, number2);

        do {
            sum = aux1 + aux2;
            aux1++;
        } while (aux1 <= aux2);

        return sum;
    }

    @Override
    public String toString() {
        return String.format("Sum between %d and %d is:%nFirst case: %d%nSecond case: %d%nThird case: %d%n", number1, number2, sumBetweenTwoNumbers1(), sumBetweenTwoNumbers2(), sumBetweenTwoNumbers3());
    }
}
