package application;

import util.ArrayNumber;

import java.util.Arrays;
import java.util.Scanner;

public class AppArrayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayNumber arrayNumber;

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Passamos a referência do array para o construtor da classe
        arrayNumber = new ArrayNumber(numbers);

        // Exibe o resultado
        System.out.println("Biggest number: " + Arrays.toString(arrayNumber.biggestArrayNumber()));
        System.out.println("Smallest number: " + Arrays.toString(arrayNumber.smallestArrayNumer()));
    }
}
