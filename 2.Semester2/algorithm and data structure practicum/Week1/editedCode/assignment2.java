import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, length;

        // Get cube length from user
        System.out.print("Enter the length of the cube: ");
        length = scanner.nextInt();

        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Volume of the cube: " + calculateVolume(length));
                    break;
                case 2:
                    System.out.println("Surface area of the cube: " + calculateSurfaceArea(length));
                    break;
                case 3:
                    System.out.println("Perimeter (Total Edge Length): " + calculatePerimeter(length));
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Function to display the menu
    public static void displayMenu() {
        System.out.println("\n===================================");
        System.out.println("========== Cube Calculator ==========");
        System.out.println("===================================");
        System.out.println("1. Calculate Volume");
        System.out.println("2. Calculate Surface Area");
        System.out.println("3. Calculate Perimeter (Total Edge Length)");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
    }

    // Function to calculate volume
    public static int calculateVolume(int length) {
        return length * length * length;
    }

    // Function to calculate surface area
    public static int calculateSurfaceArea(int length) {
        return 6 * length * length;
    }

    // Function to calculate perimeter (total edge length)
    public static int calculatePerimeter(int length) {
        return 12 * length;
    }
}
