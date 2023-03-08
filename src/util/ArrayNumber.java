package util;

public class ArrayNumber {
    private int[] numbers;

    // Inicializa o atributo numbers
    public ArrayNumber(int[] numbers) {
        this.numbers = numbers;
    }

    // Retorna o maior resultado do array
    public int[] biggestArrayNumber() {
        int[] biggestNumber = new int[1];

        for (int num : numbers) {
            if (num > biggestNumber[0]) {
                biggestNumber[0] = num;
            }
        }

        return biggestNumber;
    }

    // Retorna o menor resultado do array
    public int[] smallestArrayNumer() {
        int[] smallestNumber = new int[1];
        smallestNumber[0] = numbers[0];
        for (int num : numbers) {
            if (num < smallestNumber[0]) {
                smallestNumber[0] = num;
            }
        }

        return smallestNumber;
    }
}
