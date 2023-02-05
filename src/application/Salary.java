package application;

import util.MinimumWage;

public class Salary {
    public static void main(String[] args) {
        MinimumWage minimumWage = new MinimumWage();

        // Setamos o salário-mínimo e o salário de um funcionário
        minimumWage.setMinimumWage(1000);
        minimumWage.setEmployeeSalary(2500);

        // Exibe o resultado
        System.out.println(minimumWage);
    }
}
