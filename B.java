package shooping_cart;

public class B {
		private String username;
		private String password;
		private String productId;
		private String customerId;
		private String orderId;
		
		
		private int noOfQuantities;
		public int getNoOfQuantities() {
			return noOfQuantities;
		}
		public void setNoOfQuantities(int noOfQuantities) {
			this.noOfQuantities = noOfQuantities;
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
		public String getOrderId() {
			return orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public double getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}
		
		public B(int noOfQuantities, String productId, String customerId, String orderId, double unitPrice,String username,String password) {
			super();
			this.noOfQuantities = noOfQuantities;
			this.productId = productId;
			this.customerId = customerId;
			this.orderId = orderId;
			this.unitPrice = unitPrice;
		}

		private double unitPrice;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
