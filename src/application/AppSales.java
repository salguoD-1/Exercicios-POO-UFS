package application;

import entities.Product2;

public class AppSales {
    public static void main(String[] args) {
        Product2 product2 = new Product2("Pencil", 50.49, 115.33);
        Product2 product3 = new Product2("Pen", 99.18, 111.54);
        Product2 product4 = new Product2("Eraser", 115.13, 112.12);

        System.out.println("Product name: " + product2.getProductName());
        System.out.println("Cost price: $" + product2.getCostPrice());
        System.out.println("Sale price: $" + product2.getSalePrice());
        System.out.println("Calculate profit margin: $" + product2.calculateProfitMargin());
        System.out.println("Profit margin in percentage: " + product2.getProfitMarginPercentage());
        System.out.printf("%n");
        System.out.println("Product name: " + product3.getProductName());
        System.out.println("Cost price: $" + product3.getCostPrice());
        System.out.println("Sale price: $" + product3.getSalePrice());
        System.out.println("Calculate profit margin: $" + product3.calculateProfitMargin());
        System.out.println("Profit margin in percentage: " + product3.getProfitMarginPercentage());
        System.out.printf("%n");
        System.out.println("Product name: " + product4.getProductName());
        System.out.println("Cost price: $" + product4.getCostPrice());
        System.out.println("Sale price: $" + product4.getSalePrice());
        System.out.println("Calculate profit margin: $" + product4.calculateProfitMargin());
        System.out.println("Profit margin in percentage: " + product4.getProfitMarginPercentage());
    }
}
