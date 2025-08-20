package shopping_cart;

import java.util.Scanner;

public class ShoppingCartApp {

    static Scanner sc = new Scanner(System.in);
    static OrderManager orderManager = new OrderManager();

    public static void main(String[] args) {
        // Hardcoded login credentials
        User admin = new User("Admin", "nimdA");

        System.out.println("Welcome to Shopping Cart!");
        System.out.print("Enter Username: ");
        String username = sc.next();
        System.out.print("Enter Password: ");
        String password = sc.next();

        if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            System.out.println("\nLogin successful!\n");

            boolean running = true;
            while (running) {
                System.out.println("\nMenu:");
                System.out.println("1. Place Order");
                System.out.println("2. Search Order by ID");
                System.out.println("3. Generate Report");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> orderManager.placeOrder();
                    case 2 -> orderManager.searchOrder();
                    case 3 -> orderManager.generateReport();
                    case 4 -> {
                        System.out.println("Thank you! See you soon.");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice, try again.");
                }
            }
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}
