package shopping_cart;

public class Product {
    private String productId;
    private String productName;
    private double unitPrice;

    public Product(String productId, String productName, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }

    @Override
    public String toString() {
        return "[ProductId=" + productId + ", Name=" + productName + ", Price=" + unitPrice + "]";
    }
}
