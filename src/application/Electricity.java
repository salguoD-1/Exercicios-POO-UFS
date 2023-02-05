package application;

import util.DisplayConsumedKilowatts;

public class Electricity {
    public static void main(String[] args) {
        DisplayConsumedKilowatts consumedKw = new DisplayConsumedKilowatts();
        // Setamos os valores do salário minimo e o total de kw consumidos
        consumedKw.setMinimumWage(1000);
        consumedKw.setTotalOfKw(3);
        // Exibe o resultado
        System.out.println(consumedKw);
    }
}
