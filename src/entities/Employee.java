package entities;

public class Employee {
    private String employeeName;
    private char employeeSex;
    private String employeeDepartment;
    private double employeeSalary;

    public Employee(String employeeName, char employeeSex, String employeeDepartment, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSex = employeeSex;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public char getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(char employeeSex) {
        this.employeeSex = employeeSex;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double increaseEmployeeSalary(double percentage) {
        return employeeSalary + ((employeeSalary * percentage) / 100);
    }

    public double annualIncome() {
        return employeeSalary * 13;
    }
}
