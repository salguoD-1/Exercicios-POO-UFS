package application;

import util.CanFormTriangle;

public class Triangle {
    public static void main(String[] args) {
        CanFormTriangle canFormTriangle = new CanFormTriangle();
        // Setamos o valor de cada lado do triangulo
        canFormTriangle.setSideX(20);
        canFormTriangle.setSideY(15);
        canFormTriangle.setSideZ(5);
        // Exibe or esultado
        System.out.println(canFormTriangle);
    }
}
