package application;

import util.Square;

public class AppSquare {
    public static void main(String[] args) {
        double aux;
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();

        // Setamos os três lados
        square1.setSide(3);
        square2.setSide(4);
        square3.setSide(5);

        // Exibe o resultado
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);

        // Variável auxiliar armazena o maior resultado entre dois argumentos
        aux = Square.biggestSquareArea(square2.calcArea(), square3.calcArea());
        // Utiliza o resultado anterior e avalia novamente
        aux = Square.biggestSquareArea(aux, square1.calcArea());
        // Exibe o quadrado com maior área
        System.out.printf("Biggest area: %.2f%n", aux);

        // Variável auxiliar armazena o menor resultado entre dois argumentos
        aux = Square.smallestSquarePerimeter(square1.calcPerimeter(), square2.calcPerimeter());
        // Utiliza o resultado anterior e avalia novamente
        aux = Square.smallestSquarePerimeter(aux, square3.calcPerimeter());
        // Exibe o quadrado com menor perímetro
        System.out.printf("Smallest perimeter: %.2f%n", aux);
    }
}
