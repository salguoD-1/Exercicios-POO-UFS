package application;

import util.SumOfNumbers;

public class Sum {
    public static void main(String[] args) {
        SumOfNumbers sum = new SumOfNumbers();
        // Setamos os valores
        sum.setNumber1(1);
        sum.setNumber2(100);
        // Exibe o resultado
        System.out.println(sum);
    }
}
