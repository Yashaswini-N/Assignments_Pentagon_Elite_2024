package penta.java.test;

import java.util.Scanner;

public class CoffeeShop {

    private static double totalPrice = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            MainMenu();
            int mainList = scanner.nextInt();
            scanner.nextLine();  

            switch (mainList) {
                case 1:
                    orderCoffee(scanner);
                    break;
                case 2:
                    orderTea(scanner);
                    break;
                case 3:
                    orderBrunchCombo(scanner);
                    break;
                case 4:
                    makePayment();
                    break;
                case 5:
                    System.out.println("Thank you for visiting CoffeeShop!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, Please select a valid option.");
            }
        }
    }

    private static void MainMenu() {
        System.out.println("\n--- CoffeeStall Menu ---");
        System.out.println("1. Order Coffee");
        System.out.println("2. Order Tea");
        System.out.println("3. Order Brunch Combo");
        System.out.println("4. Make Payment");
        System.out.println("5. Exit");
        System.out.print("Choose an option (1-5): ");
    }

    private static void CoffeeMenu() {
        System.out.println("\nCoffee Menu ");
        System.out.println("1. Cappuccino - Rs 30.00");
        System.out.println("2. Espresso - Rs 20.00");
        System.out.println("3. Americano - Rs 25.00");
        System.out.print("Select coffee (1-3): ");
    }

    private static void TeaMenu() {
        System.out.println("\nTea Menu ");
        System.out.println("1. Ginger Tea - Rs 10.00");
        System.out.println("2. Cardamon Tea - Rs 20.00");
        System.out.println("3. Masala Tea - Rs 25.00");
        System.out.println("4. Puneri Elaichi Tea - Rs 30.00");
        System.out.print("Select tea (1-4): ");
    }

    private static void BrunchComboMenu() {
        System.out.println("\nBrunch Combo Menu ");
        System.out.println("1. Sandwich Combo - Rs 75.00");
        System.out.println("2. Burger Combo - RS 100.00");
        System.out.println("3. Bread Toast Combo - Rs 50.00");
        System.out.println("4. Samosa Combo - Rs 65.00");
        System.out.print("Select brunch combo (1-4): ");
    }

    private static void orderCoffee(Scanner scanner) {
        CoffeeMenu();
        int coffeeChoice = scanner.nextInt();
        switch (coffeeChoice) {
            case 1:
                totalPrice += 30.00;
                break;
            case 2:
                totalPrice += 20.00;
                break;
            case 3:
                totalPrice += 25.00;
                break;
            default:
                System.out.println("Invalid choice. coffee not ordered.");
        }
    }

    private static void orderTea(Scanner scanner) {
        TeaMenu();
        int teaChoice = scanner.nextInt();
        switch (teaChoice) {
            case 1:
                totalPrice += 10.00;
                break;
            case 2:
                totalPrice += 20.00;
                break;
            case 3:
                totalPrice += 25.00;
                break;
            case 4:
                totalPrice += 30.00;
                break;
            default:
                System.out.println("Invalid choice. tea not ordered.");
        }
    }

    private static void orderBrunchCombo(Scanner scanner) {
        BrunchComboMenu();
        int comboChoice = scanner.nextInt();
        switch (comboChoice) {
            case 1:
                totalPrice += 75.00;
                break;
            case 2:
                totalPrice += 100.00;
                break;
            case 3:
                totalPrice += 50.00;
                break;
            case 4:
                totalPrice += 65.00;
                break;
            default:
                System.out.println("Invalid choice. brunch combo not ordered.");
        }
    }

    private static void makePayment() {
        System.out.printf("Total amount to be paid: Rs %.2f\n", totalPrice);
        totalPrice  = 0.0;  
    }
}
