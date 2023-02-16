package application;

import entities.Item;
import entities.Product;

// TODO: Terminar a construção do problema.
public class Sale {
    public static void main(String[] args) {
        // Criamos dois objetos da classe Product
        Product product1 = new Product("34235", "Pen", 250, 1.99);
        Product product2 = new Product("5231", "Pencil", 185, 1.24);
        // Criamos três objetos da classe Item
        Item item1 = new Item("34235", 14);
        Item item2 = new Item("5231", 24);
        Item item3 = new Item("34235", 111);

        // Exibe a quantidade em estoque
        System.out.println("Total in stock: " + product1.getQuantityInStock());
        System.out.println("Total in stock: " + product2.getQuantityInStock());
        System.out.println(item1.getTotalSold());
        System.out.println(item2.getTotalSold());
        System.out.println(item3.getTotalSold());
    }
}
