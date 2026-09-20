import java.util.Scanner;

public class menu {

    static Scanner sc = new Scanner(System.in);

    static int menulist() {

        int choice;

        System.out.println("\n----- FOOD MENU -----");
        System.out.println("1. Dosa      - Rs.50");
        System.out.println("2. Samosa    - Rs.20");
        System.out.println("3. Idli      - Rs.30");
        System.out.println("4. Vada      - Rs.25");
        System.out.println("10. Generate Bill");

        System.out.print("Enter choice : ");
        choice = sc.nextInt();

        return choice;
    }

    public static void main(String[] args) {

        int choice;
        int quantity;
        double total = 0;

        do {

            choice = menulist();

            if (choice == 10) {
                break;
            }

            System.out.print("Enter quantity : ");
            quantity = sc.nextInt();

            switch (choice) {

                case 1:
                    total = total + (50 * quantity);
                    break;

                case 2:
                    total = total + (20 * quantity);
                    break;

                case 3:
                    total = total + (30 * quantity);
                    break;

                case 4:
                    total = total + (25 * quantity);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 10);

        System.out.println("\nTotal Bill = Rs." + total);
        System.out.println("Thank you!");
    }
}
