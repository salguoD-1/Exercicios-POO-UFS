package entities;

public class Product {
    private String productCode;
    private String productName;
    private int quantityInStock;
    private double unitPrice;

    public Product(String productCode, String productName, int quantityInStock, double unitPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product() {

    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void getQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock -= quantityInStock;
    }
}
