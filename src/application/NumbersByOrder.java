package application;

import util.DescendingAndAscendingOrder;

public class NumbersByOrder {
    public static void main(String[] args) {
        DescendingAndAscendingOrder descendingAndAscendingOrder = new DescendingAndAscendingOrder();
        // Setamos os valores
        descendingAndAscendingOrder.setNumber1(6);
        descendingAndAscendingOrder.setNumber2(2);
        descendingAndAscendingOrder.setNumber3(1);
        // Exibe o resultado
        System.out.println(descendingAndAscendingOrder);
    }
}
