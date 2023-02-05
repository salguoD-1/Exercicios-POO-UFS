package application;

import util.SwimmerCategories;

public class Swimmer {
    public static void main(String[] args) {
        SwimmerCategories swimmer = new SwimmerCategories();
        // Setamos a idade do nadador
        swimmer.setSwimmerAge(16);
        // Exibe o resultado
        System.out.println(swimmer);
    }
}
