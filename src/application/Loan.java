package application;

import util.CanGetLoan;

public class Loan {
    public static void main(String[] args) {
        CanGetLoan canGetLoan = new CanGetLoan();
        // Setamos o salário, disconto e o valor do emprestimo
        canGetLoan.setSalary(1000);
        canGetLoan.setDiscount(10);
        canGetLoan.setLoan(128);
        // Exibe o resultado
        System.out.println(canGetLoan);
    }
}
