package shooping_cart;

public class OrderDetails {
	private String orderId;
	private String productId;
	private String customerId;
    private float unitPrice;
	private int quantity;
	public OrderDetails(String orderId, String productId, String customerId, float unitPrice, int quantity) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.customerId = customerId;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
