package shooping_cart;

import java.util.Scanner;

public class Ordrer extends Customer{
	private String userName;
	private String passWord;
	private String OrderId; 
	private int noOfQuantities;
	
	
	
	public int getNoOfQuantities() {
		return noOfQuantities;
	}
	public void setNoOfQuantities(int noOfQuantities) {
		this.noOfQuantities = noOfQuantities;
	}
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getUserName() {
		return userName;
		
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {	
			Ordrer o=new Ordrer();
			Customer c=new Customer();
			o.setUserName("Admin");
			o.setPassWord("MassilTech");
			o.setOrderId("ABC12345");
			o.setCustomerId("c101");
			o.setProductId("crty90");
			o.setUnitPrice(56987.285);
			System.out.println("Enter the username and password");
			String user=sc.next();
			String pwd= sc.next();
			
			if(user.equals(o.getUserName()) && pwd.equals(o.getPassWord())) {
				System.out.println("login successfull");
				System.out.println();
				System.out.println("Please select any option below: ");
				
				System.out.println("1. Place Order  2. Search order 3. Generate Order Report 4. Exit");
				int a=sc.nextInt();
				
				if(a==1) {
				System.out.println("You have selected option "+a);
				System.out.println("Enter order Id: ");
				String orderId=sc.next();	
				System.out.println("Enter product Id: ");
				String productId= sc.next();
				System.out.println("Enter customer Id: ");
				String customerId= sc.next();
				System.out.println("Enter the unit price of the product: ");
				float unitPrice = sc.nextFloat();
				System.out.println("Enter the number of quantities: ");
				int noOfQuantities =sc.nextInt();
				System.out.println("If you want to continue: yes/no");
				String yes=sc.next();
				System.out.println("1. Place Order  2. Search order 3. Generate Order Report 4. Exit");
				int a1=sc.nextInt();
				
				
				
				
				
				
				
				System.out.println("1. Place Order  2. Search order 3. Generate Order Report 4. Exit");
				int b=sc.nextInt();
				}
				
				if(a==2) {
					System.out.println("Search order by entering your Ordre id: ");
				    String orderId=	sc.next();
				if(orderId.equals(o.getOrderId())) {
					System.out.println("customer id: "+o.getCustomerId());
					System.out.println("product id: " +o.getProductId());
					System.out.println("unit price: "+o.getUnitPrice());
				}
				}
				
				if(a==3) {
					System.out.println("Order report:  ");
					System.out.println(o.toString());
				}
				
				if(a==4) {
					System.out.println("see you soon...!!!");
				}
				
			}
			else {
				System.out.println("invalid username and password");
			}
			
			
	}
	@Override
	public String toString() {
		return "Ordrer [getUnitPrice()=" + getUnitPrice() + ", getCustomerId()=" + getCustomerId() + ", getProductId()="
				+ getProductId() + "]";
	}

}
