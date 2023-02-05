package application;

import util.DisplayEmployeeSalary;

public class EmployeeSalary {
    public static void main(String[] args) {
        DisplayEmployeeSalary display = new DisplayEmployeeSalary();
        // Setamos o salário do funcionário
        display.setEmployeeSalary(1000);
        // Exibe o resultado
        System.out.println(display);
    }
}
