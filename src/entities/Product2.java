package entities;

public class Product2 {
    private String productName;
    private double costPrice;
    private double salePrice;

    public Product2(String productName, double costPrice, double salePrice) {
        this.productName = productName;
        this.costPrice = costPrice;
        // TODO: Refatorar caso o custo do produto seja maior que o preço de venda, exibir mensagem pro usuário
        this.salePrice = salePrice > costPrice ? salePrice : 0;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        // TODO: Refatorar caso o custo do produto seja maior que o preço de venda, exibir mensagem pro usuário
        this.salePrice = salePrice > costPrice ? salePrice : 0;
    }

    public double calculateProfitMargin() {
        return salePrice - costPrice;
    }

    public String getProfitMarginPercentage() {
        return String.format("%.2f%%", (salePrice / costPrice) * 100);
    }

}
