package shopping_cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderManager {
    private List<Order> orders = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void placeOrder() {
        System.out.print("Enter Order ID: ");
        String orderId = sc.next();

        System.out.print("Enter Customer ID: ");
        String customerId = sc.next();
        System.out.print("Enter Customer Name: ");
        String name = sc.next();
        System.out.print("Enter Customer Email: ");
        String email = sc.next();

        Customer customer = new Customer(customerId, name, email);
        Order order = new Order(orderId, customer);

        System.out.print("Enter number of products: ");
        int productCount = sc.nextInt();

        for (int i = 0; i < productCount; i++) {
            System.out.print("Enter Product ID: ");
            String productId = sc.next();
            System.out.print("Enter Product Name: ");
            String productName = sc.next();
            System.out.print("Enter Unit Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productId, productName, price);
            OrderDetails detail = new OrderDetails(product, quantity);
            order.addOrderDetail(detail);
        }

        orders.add(order);
        System.out.println("✅ Order placed successfully!");
    }

    public void searchOrder() {
        System.out.print("Enter Order ID to search: ");
        String orderId = sc.next();

        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                System.out.println("Order Found: " + order);
                return;
            }
        }
        System.out.println("❌ Order ID not found!");
    }

    public void generateReport() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet!");
        } else {
            System.out.println("\n==== Order Report ====");
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }
}
