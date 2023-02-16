package entities;

public class Item {
    private String productCode;
    private int totalSold;
    private Product product = new Product();

    public Item(String productCode, int totalSold) {
        this.productCode = productCode;
        this.totalSold = totalSold;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public void subtractProductInStock(Product product) {
        product.setQuantityInStock(totalSold);
    }
}
