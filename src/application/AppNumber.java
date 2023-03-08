package application;

import util.Number;

import java.util.Arrays;
import java.util.Scanner;

public class AppNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number number;
        // Array de inteiros
        int[] numbers = new int[10];
        // Setamos os valores
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Passamos um array de objetos como argumento para o construtor
        number = new Number(numbers);
        // Exibe os resultados
        System.out.println("Even numbers: " + Arrays.toString(number.getEven()));
        System.out.println("Odd numbers: " + Arrays.toString(number.getOdd()));
        System.out.println("Total of Even numbers: " + number.getTotalOfEvenNumbers());
        System.out.println("Total of Odd numbers: " + number.getTotalOfOddNumbers());
    }
}
