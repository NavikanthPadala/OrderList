package shooping_cart;

import java.util.ArrayList;
import java.util.Scanner;

public class A extends Throwable{
	
	static int selectedOption;

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		A a= new A();
		
		b.setUsername("Admin");
		b.setPassword("nimdA");
		System.out.println("Hello and welcome to shopping cart...!!");
		System.out.println();
		System.out.println("Please enter your username and password: ");
		System.out.println();
		String username=sc.next();
		String password=sc.next();
		System.out.println();

		if(username.equals(b.getUsername()) && password.equals(b.getPassword())) {
			System.out.println("login successfull..!!");
			System.out.println();
			System.out.println("please choose one option given below: ");
			System.out.println();
			A.choose();


			if(selectedOption==1) {
				A.placeorder();
				System.out.println("Congrats.. your order has been placed!!! ");
				System.out.println();
				System.out.println("If you want to continue with other options.. Yes/No ");
				System.out.println();
				String k=sc.next();
				System.out.println();

				if(k.equals("Yes")) {
					A.choose();
					if(selectedOption==2) {
						System.out.println("Please enter the order id: ");
						System.out.println();
						String orderId1=sc.next();
						if(orderId1.equals(orderId)) {
							A.display();
							System.out.println();
							A.choose();
							if(selectedOption==3) {
								System.out.println("Order List [orderId= "+orderId+" , productId= "+productId+", customerId= "+customerId+" , Quantity= "+noOfQuantities+" , unit price= "+unitPrice);
								System.out.println();
								A.choose();
								if(selectedOption==4) {
									System.out.println("See you soon..!!");
								}
							}
						}
						else {
							System.out.println("Please enter the existing order id");
							
								A.choose();
								A.m1();
						}
					}
				}
				else {
					System.out.println("No worries have a good day..!!");
				}
			}

			if(selectedOption==2) {
				System.out.println("pardon..!! you need to place an order before making the search operation");
				A.choose();
				A.m1();
			}
			if(selectedOption==3) {
				System.out.println("Sorry!.. first you need to place the order, later you can access the order report..");
				A.choose();
				A.m1();
			}
			if(selectedOption==4) {
				System.out.println("See you soon..!!");
			}

			if(selectedOption>4) {
				try {
					throw new A();
				}
				catch(A aw) {
					System.out.println("You have accessing the option which is not present..please try again ");
					A.choose();
					A.m1();

				}
			}
		}
		else {
			try {
				throw new A();
			}
			catch(A aw) {
				System.out.println("Please enter the valid credintials..");
			}
		}

	}

	public  static void placeorder() {
		
		for(int i=1;i<=2;i++) {
		System.out.println("Enter the order id: ");
		String orderId=sc.next();
		System.out.println("Enter the product id: ");
		String productId=sc.next();
		System.out.println("Enter the customer id: ");
		String customerId=sc.next();
		System.out.println("Enter the unit price of the product: ");
		double unitPrice=sc.nextDouble();
		System.out.println("Enter the number of quantities: ");
		int noOfQuantities=sc.nextInt();
		System.out.println("Enter the username");
		String username=sc.next();
		String password = sc.next();
		
		
		B b=new B(noOfQuantities, productId, customerId, orderId, unitPrice,username,password);
		ArrayList<B> al=new ArrayList<>();
	}

	public static void display() {
		System.out.println("Order id: "+orderId+" "+"product id: "+productId+" "+"Customer id: "+customerId+" "+"Unit price: "+unitPrice+" Quantity: "+noOfQuantities);
	}

	public static void choose() {
		System.out.println();
		System.out.println("(1) Place order (2) Search order through order id (3) Generate order report (4) Exit ");
		selectedOption= sc.nextInt();
		System.out.println();
	}

	public static void m1() {
		if(selectedOption==1) {
			A.placeorder();
			System.out.println("Congrats.. your order has been placed!!! ");
			System.out.println();
			System.out.println("If you want to continue with other options.. Yes/No ");
			System.out.println();
			String k=sc.next();
			System.out.println();

			if(k.equals("Yes")) {
				A.choose();
				if(selectedOption==2) {
					System.out.println("Please enter the order id: ");
					System.out.println();
					String orderId1=sc.next();
					if(orderId1.equals(orderId)) {
						A.display();
						System.out.println();
						A.choose();
						if(selectedOption==3) {
							System.out.println("Order List [orderId= "+orderId+" , productId= "+productId+", customerId= "+customerId+" , Quantity= "+noOfQuantities+" , unit price= "+unitPrice);
							System.out.println();
							A.choose();
							if(selectedOption==4) {
								System.out.println("See you soon..!!");
							}
						}
					}
				}
			}
			else {
				System.out.println("No worries have a good day..!!");
			}
		}

	}
}
