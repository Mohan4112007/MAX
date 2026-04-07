package restaurant_program;
import java.util.Scanner;

public class RestaurantApp {
    double totalBill = 0;
    Scanner sc = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("==============================");
        System.out.println("WELCOME TO PARADISE RESTAURANT");
        System.out.println("==============================");
        System.out.println();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n--------- MAIN MENU ---------");
            System.out.println("1. SOUPS");
            System.out.println("2. STARTERS");
            System.out.println("3. VEG ITEMS");
            System.out.println("4. NON-VEG ITEMS");
            System.out.println("5. ROTIES");
            System.out.println("6. CURRIES");
            System.out.println("7. DESSERTS");
            System.out.println("8. JUICES");
            System.out.println("9. EXIT & BILL");
            System.out.println("------------------------------");
            System.out.print("Enter your choice (1-9): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> orderSoups();
                case 2 -> orderStarters();
                case 3 -> orderVegItems();
                case 4 -> orderNonVegItems();
                case 5 -> orderRoties();
                case 6 -> orderCurries();
                case 7 -> orderDesserts();
                case 8 -> orderJuices();
                case 9 -> showFinalBill();
                default -> System.out.println("Invalid choice! Please select between 1–9.");
            }

        } while (choice != 9);
    }

    // ------- Category Methods -------

    public void orderSoups() {
        System.out.println("\n<| SOUPS MENU |>");
        System.out.println("1. Veg Soup - ₹80");
        System.out.println("2. Mutton Paya - ₹120");
        System.out.println("3. Corn Soup - ₹90");
        System.out.print("Choose your soup: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 80;
            case 2 -> 120;
            case 3 -> 90;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderStarters() {
        System.out.println("\n<| STARTERS MENU |>");
        System.out.println("1. Paneer Tikka - ₹150");
        System.out.println("2. Chicken 65 - ₹180");
        System.out.println("3. Gobi Manchurian - ₹140");
        System.out.println("4. Gobi Noodles - ₹150");
        System.out.println("5. Chilli Chicken - ₹180");
        System.out.print("Choose your starter: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 150;
            case 2 -> 180;
            case 3 -> 140;
            case 4 -> 150;
            case 5 -> 180;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderVegItems() {
        System.out.println("\n<| VEG ITEMS MENU |>");
        System.out.println("1. Veg Biryani - ₹160");
        System.out.println("2. Paneer Biryani - ₹160");
        System.out.println("3. Mushroom Biryani - ₹180");
        System.out.println("4. Fried Rice - ₹120");
        System.out.println("5. Gobi Rice - ₹120");
        System.out.println("6. Curd Rice - ₹80");
        System.out.print("Choose your veg item: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 160;
            case 2 -> 160;
            case 3 -> 180;
            case 4 -> 120;
            case 5 -> 120;
            case 6 -> 80;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderNonVegItems() {
        System.out.println("\n<| NON-VEG ITEMS MENU |>");
        System.out.println("1. Chicken Biryani - ₹220");
        System.out.println("2. Mutton Biryani - ₹250");
        System.out.println("3. Fish Fry - ₹230");
        System.out.println("4. Chicken Fry Biryani - ₹220");
        System.out.println("5. Chicken Dum Biryani - ₹200");
        System.out.print("Choose your non-veg item: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 220;
            case 2 -> 250;
            case 3 -> 230;
            case 4 -> 220;
            case 5 -> 200;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderRoties() {
        System.out.println("\n<| ROTIES MENU |>");
        System.out.println("1. Butter Naan - ₹40");
        System.out.println("2. Tandoori Roti - ₹30");
        System.out.println("3. Chapati - ₹20");
        System.out.println("4. Parota - ₹20");
        System.out.print("Choose your roti: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 40;
            case 2 -> 30;
            case 3 -> 20;
            case 4 -> 20;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderCurries() {
        System.out.println("\n<| CURRIES MENU |>");
        System.out.println("1. Chicken Curry - ₹220");
        System.out.println("2. Paneer Masala - ₹180");
        System.out.println("3. Dal Fry - ₹150");
        System.out.println("4. Fish Curry - ₹200");
        System.out.print("Choose your curry: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 220;
            case 2 -> 180;
            case 3 -> 150;
            case 4 -> 200;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderDesserts() {
        System.out.println("\n<| DESSERTS MENU |>");
        System.out.println("1. Ice Cream - ₹100");
        System.out.println("2. Gulab Jamun - ₹80");
        System.out.println("3. Fruit Salad - ₹90");
        System.out.print("Choose your dessert: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 100;
            case 2 -> 80;
            case 3 -> 90;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    public void orderJuices() {
        System.out.println("\n<| JUICES MENU |>");
        System.out.println("1. Mango Juice - ₹120");
        System.out.println("2. Orange Juice - ₹100");
        System.out.println("3. Pineapple Juice - ₹110");
        System.out.println("4. Watermelon Juice - ₹90");
        System.out.println("5. Lemon Juice - ₹70");
        System.out.print("Choose your juice: ");
        int item = sc.nextInt();
        int cost = switch (item) {
            case 1 -> 120;
            case 2 -> 100;
            case 3 -> 110;
            case 4 -> 90;
            case 5 -> 70;
            default -> { System.out.println("Invalid choice!"); yield 0; }
        };
        if (cost > 0) addToBill(cost);
    }

    // ------- Helper Methods -------

    public void addToBill(int cost) {
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double total = cost * quantity;
        totalBill += total;
        System.out.println("Added to bill: ₹" + total);
        System.out.println("Current Total: ₹" + totalBill);
    }

    public void showFinalBill() {
        System.out.println("\n===============================");
        System.out.println("FINAL TOTAL BILL: ₹" + totalBill);

        double discount = 0;
        if (totalBill > 3000) {
            discount = totalBill * 0.10; // 10% off
            System.out.println("🎉 You got 10% OFF on your bill!");
        } else if (totalBill > 2000) {
            discount = totalBill * 0.05; // 5% off
            System.out.println("🎉 You got 5% OFF on your bill!");
        }

        double finalAmount = totalBill - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("--------------------------------");
        System.out.println("TOTAL PAYABLE AMOUNT: ₹" + finalAmount);
        System.out.println("--------------------------------");
        System.out.println("Thank you for visiting Paradise Restaurant!");
        System.out.println("===========================================");
    }

    // ------- Main Method -------
    public static void main(String[] args) {
        RestaurantApp r = new RestaurantApp();
        r.displayMainMenu();
        r.menu();
    }
}
