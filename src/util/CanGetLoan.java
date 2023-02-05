package util;

public class CanGetLoan {
    private double salary;
    private double discount;
    private double loan;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }
    // Analisa de um cliente pode ou não pegar um emprestimo
    public String displayCanGetLoan() {
        double aux = salary - (salary * discount / 100);
        // Analisa se o emprestimo é menor que 30% do salário líquido
        if (loan / aux <= 0.3) {
            return "Allowed";
        } else {
            return "Not Allowed";
        }
    }

    @Override
    public String toString() {
        return String.format("Current status: %s%n", displayCanGetLoan());
    }
}
