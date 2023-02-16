package application;

import entities.Employee;

public class AppEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Douglas", 'M', "IT", 8500.49);
        System.out.println("Employee name: " + employee.getEmployeeName());
        System.out.println("Employee sex: " + employee.getEmployeeSex());
        System.out.println("Employee department: " + employee.getEmployeeDepartment());
        System.out.println("Employee salary: $" + employee.getEmployeeSalary());
        System.out.println("Employee salary after bonification: $" + employee.increaseEmployeeSalary(10));
        System.out.println("Employee annual income: $" + employee.annualIncome());
    }
}
