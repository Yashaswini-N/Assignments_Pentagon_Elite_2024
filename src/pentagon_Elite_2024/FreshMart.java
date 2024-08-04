package pentagon_Elite_2024;

import java.util.Scanner;

public class FreshMart {
    private static final int MAX_PRODUCTS = 4; 
    private static int productCount = 0; 

    
    private static int[] productIds = new int[MAX_PRODUCTS];
    private static String[] productNames = new String[MAX_PRODUCTS];
    private static int[] quantities = new int[MAX_PRODUCTS];
    private static double[] prices = new double[MAX_PRODUCTS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runningthemenu = true;

        while (runningthemenu) {
            System.out.println("\n--- FreshMart Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Edit/Modify Product");
            System.out.println("4. Buy Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice from the menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    viewProducts();
                    break;
                case 3:
                    editProduct(scanner);
                    break;
                case 4:
                    buyProduct(scanner);
                    break;
                case 5:
                    runningthemenu = false;
                    System.out.println("Exiting FreshMart. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter Correct choice from menu");
            }
        }
        scanner.close();
    }

    private static void addProduct(Scanner scanner) {
        if (productCount >= MAX_PRODUCTS) {
            System.out.println("Inventory is full. Cannot add more products.");
            return;
        }

        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Available Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        productIds[productCount] = id;
        productNames[productCount] = name;
        quantities[productCount] = quantity;
        prices[productCount] = price;
        productCount++;

        System.out.println("Product added successfully.");
    }

    private static void viewProducts() {
        System.out.println("\n--- Products List ---");
        System.out.printf("%-8s %-15s %-5s %-7s%n", "ProdID", "ProdName", "Qty", "Price");
        for (int i = 0; i < productCount; i++) {
            System.out.printf("%-8d %-15s %-5d %-7.2f%n", productIds[i], productNames[i], quantities[i], prices[i]);
        }
    }

    private static void editProduct(Scanner scanner) {
        System.out.print("Enter Product ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < productCount; i++) {
            if (productIds[i] == id) {
                System.out.print("Enter new Quantity: ");
                int newQty = scanner.nextInt();

                System.out.print("Enter new Price: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); 

                quantities[i] = newQty;
                prices[i] = newPrice;

                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private static void buyProduct(Scanner scanner) {
        System.out.println("\n--- Available Products ---");
        System.out.printf("%-8s %-15s %-5s %-7s%n", "ProdID", "ProdName", "Qty", "Price");
        for (int i = 0; i < productCount; i++) {
            System.out.printf("%-8d %-15s %-5d %-7.2f%n", productIds[i], productNames[i], quantities[i], prices[i]);
        }

        System.out.print("Enter Product ID to buy: ");
        int id = scanner.nextInt();

        System.out.print("Enter Quantity to buy: ");
        int qty = scanner.nextInt();
        

        for (int i = 0; i < productCount; i++) {
            if (productIds[i] == id) {
                if (quantities[i] >= qty) {
                    double totalAmount = qty * prices[i];
                    System.out.printf("Total amount to be paid :"+totalAmount);
                } else {
                    System.out.println("Insufficient quantity available.");
                }
                return;
            }
        }
        System.out.println("Product not found.");
    }
}
