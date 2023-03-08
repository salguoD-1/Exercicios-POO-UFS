package util;

public class Number {
    private int[] numbers;
    int count = 0;
    private int totalOfOddNumbers = 0;
    private int totalOfEvenNumbers = 0;

    public Number(int[] numbers) {
        this.numbers = numbers;
    }

    public int getTotalOfOddNumbers() {
        return totalOfOddNumbers;
    }

    public int getTotalOfEvenNumbers() {
        return totalOfEvenNumbers;
    }

    public int[] getEven() {
        // Pega o tamanho do array numbers
        int[] even = new int[numbers.length];

        for (int num : numbers) {
            if (num % 2 == 0) {
                even[count] = num;
                count++;
                totalOfEvenNumbers++;
            }
        }
        count = 0;
        return even;
    }

    public int[] getOdd() {
        // Pega o tamanho do array numbers
        int[] odd = new int[numbers.length];

        for (int num : numbers) {
            if (num % 2 != 0) {
                odd[count] = num;
                count++;
                totalOfOddNumbers++;
            }
        }
        return odd;
    }
}
