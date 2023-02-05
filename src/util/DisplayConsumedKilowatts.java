package util;

public class DisplayConsumedKilowatts {
    private double minimumWage;
    private double totalOfKw;

    public double getMinimumWage() {
        return minimumWage;
    }

    public void setMinimumWage(double minimumWage) {
        this.minimumWage = minimumWage;
    }

    public double getTotalOfKw() {
        return totalOfKw;
    }

    public void setTotalOfKw(double totalOfKw) {
        this.totalOfKw = totalOfKw;
    }

    public double kwPrice() {
        return totalOfKw * 0.2 * minimumWage;
    }

    public double totalToPayWithDiscount() {
        return (totalOfKw * 0.2 * minimumWage) - (totalOfKw * 0.2 * minimumWage) * 0.15;
    }

    @Override
    public String toString() {
        return String.format("Kw price: $%.2f%nTotal to pay without discount: $%.2f%nTotal to pay with discount of 15%%: $%.2f%n", kwPrice(), kwPrice(), totalToPayWithDiscount());
    }
}
