package util;

public class DisplayEmployeeSalary {
    private final double INCREASE_EMPLOYEE_SALARY = 0.25;
    private double employeeSalary;

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double displaySalary() {
        return employeeSalary;
    }

    public double displayIncreasePercentage() {
        return INCREASE_EMPLOYEE_SALARY * 100;
    }

    public double displayNewSalary() {
        return employeeSalary + (employeeSalary * INCREASE_EMPLOYEE_SALARY);
    }

    @Override
    public String toString() {
        return String.format("Employee salary: $%.2f%nPercentage increase: %.1f%%%nNew employee salary: $%.2f%n", displaySalary(), displayIncreasePercentage(), displayNewSalary());
    }
}
