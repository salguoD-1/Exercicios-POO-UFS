package application;

import entities.Account;

public class AppAccount {
    public static void main(String[] args) {
        Account account = new Account("Douglas", "12356345", 11500.49, 940.00);

        System.out.println("Client name: " + account.getClientName());
        System.out.println("Client account number: " + account.getClientAccountNumber());
        System.out.println("Client balance: $" + account.getClientBalance());
        System.out.println("Client limit: $" + account.getClientLimit());
        account.deposit(350.88);
        System.out.printf("Client balance after deposit: $%.2f%n", account.getClientBalance());
        System.out.println("Can withdraw: " + account.withdraw(8500.91));
        System.out.printf("Client balance after withdraw: $%.2f%n", account.getClientBalance());
        System.out.println("Can withdraw: " + account.withdraw(11851.36));
        System.out.printf("Client balance after withdraw: $%.2f%n", account.getClientBalance());

    }
}
