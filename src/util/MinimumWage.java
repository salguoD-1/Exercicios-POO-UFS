package util;

public class MinimumWage {
    private double minimumWage;
    private double employeeSalary;

    public double getMinimumWage() {
        return minimumWage;
    }

    public void setMinimumWage(double minimumWage) {
        this.minimumWage = minimumWage;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double howMuchMinimumWage() {
        return employeeSalary / minimumWage;
    }

    @Override
    public String toString() {
        return String.format("Total of minimum wages: %.1f%n", howMuchMinimumWage());
    }
}
