package shooping_cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OModule {

	static Scanner sc=new Scanner(System.in);
	static Iterator it;
	
	public static void main(String[] args) {
		Verification();
	}
	
	public static void Verification() {
		System.out.println("Hello and welcome to shopping cart");
		System.out.println("Enter username:");
		String s=sc.next();
		System.out.println("Enter password:");
		String s1=sc.next();
		
		if(s.equals("a") && s1.equals("a")) {
			System.out.println("Login success");
			
			int operation=sc.nextInt();
			switch(operation) {
			case 1: placeOrder();
			case 2:
			case 3:
			}
			
		}
		else {
			System.out.println("Invalid credintials");
			Verification();
		}
	}
	
	public static void placeOrder() {
		for(int i=1;i<=2;i++) {
		System.out.println("Enter "+i+" Order Id ");
		String orderId=sc.next();
		System.out.println("Enter Product Id which are present in Product Module: ");
		String productId= sc.next();
		System.out.println("Enter Customer Id which are available in Customer Module:  ");
		String customerId=sc.next();
		System.out.println("Enter the Unit Price of the Product which you choose: ");
		Float unitPrice=sc.nextFloat();
		System.out.println("Enter number of quantities you need to place: ");
		int quantity=sc.nextInt();
		
		OrderDetails od = new OrderDetails(orderId, productId,customerId, unitPrice, quantity);
		ArrayList<OrderDetails> al= new ArrayList<OrderDetails>();
//		al.add(od);
		 Iterator itr=al.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  
		it=al.iterator();
		OrderDetails st;
		while(it.hasNext()) {
			st=(OrderDetails)it.next();  
			System.out.println(st.getOrderId()+" "+st.getCustomerId()+" "+st.getProductId()+" "+st.getQuantity()+" "+st.getUnitPrice());
			al.add(st);
		}
			for (OrderDetails orderDetails : al) {
				System.out.println(orderDetails+" ");
			}
		}
		
		
		
	}
	
	public static void searchByOrderId() {
		
	}
	
	public static void orderIdReport() {
		
	}
	
	public static void exit() {
		System.out.println("See you soon");
	}
}
