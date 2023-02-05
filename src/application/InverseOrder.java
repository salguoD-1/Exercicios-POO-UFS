package application;

import util.ReverseIntegerNumber;

public class InverseOrder {
    public static void main(String[] args) {
        ReverseIntegerNumber reverseIntegerNumber = new ReverseIntegerNumber();
        // NOTA: Poderiamos usar a classe Scanner para ler os dados de entrada.
        // Setamos 3 valores aleatorios
        reverseIntegerNumber.setNumber1(2);
        reverseIntegerNumber.setNumber2(3);
        reverseIntegerNumber.setNumber3(4);

        // Exibe o resultado
        System.out.println(reverseIntegerNumber);
    }
}
