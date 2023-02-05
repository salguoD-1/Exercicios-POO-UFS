package application;

import util.DisplayMonth;

public class Month {
    public static void main(String[] args) {
        DisplayMonth displayMonth = new DisplayMonth();
        // Setamos o mês
        displayMonth.setMonth("december");
        // Exibe o resultado
        System.out.println(displayMonth);
    }
}
