package application;

import util.GallonToLiter;

public class Gallon {
    public static void main(String[] args) {
        // Criamos um objeto GallonToLiter e atribuimos a variável gallonToLiter
        GallonToLiter gallonToLiter = new GallonToLiter();
        // Chamamos o método setGalao e passamos 5 como argumento
        gallonToLiter.setGalao(5);
        System.out.println("Resultado:");
        // Exibe o resultado na tela
        System.out.printf("%s", gallonToLiter);

    }
}