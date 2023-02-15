package application;

import entities.Book;

public class AppBooks {
    public static void main(String[] args) {
        // Instânciamos três objetos da classe Book
        Book book1 = new Book("9780395647387", 3, "O Senhor dos Anéis");
        Book book2 = new Book("9780395647400", 5, "O Senhor dos Anéis");
        Book book3 = new Book("9780686527008", 12, "O Senhor dos Anéis");

        // Exibe o resultado
        System.out.println("Exemplares disponíveis: " + book1.getTotalOfExemplary());
        System.out.println("Exemplares disponíveis: " + book2.getTotalOfExemplary());
        System.out.println("Exemplares disponíveis: " + book3.getTotalOfExemplary());

        // Altera a quantidade de exemplares
        book1.setTotalOfExemplary(1);
        book2.setTotalOfExemplary(2);
        book3.setTotalOfExemplary(3);
        // Exibe o novo resultado
        System.out.printf("%nAtualização de estoque em andamento...%n%n");
        System.out.println("Exemplares disponíveis: " + book1.getTotalOfExemplary());
        System.out.println("Exemplares disponíveis: " + book2.getTotalOfExemplary());
        System.out.println("Exemplares disponíveis: " + book3.getTotalOfExemplary());
    }
}
