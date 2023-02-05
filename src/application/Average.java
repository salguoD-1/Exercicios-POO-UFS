package application;

import util.AverageNumber;

public class Average {
    public static void main(String[] args) {
        AverageNumber average = new AverageNumber();
        // Setamos os três valores
        average.setNumber1(12);
        average.setNumber2(7);
        average.setNumber3(4);
        // Exibe o resultado
        System.out.println(average);
    }
}
