import java.util.Scanner;

class FlowerShop {
    static int[][] stockLevels = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };
    
    static int[] prices = {75000, 50000, 60000, 10000};
    static int[] deadPlants = {1, 2, 0, 5};
}

public class Function {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    calculateBranchIncome();
                    break;
                case 2:
                    displayStockForBranch4();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("======= Royal Garden Flower Shop =======");
        System.out.println("========================================");
        System.out.println("1. Display total income if all branches sell out");
        System.out.println("2. Show stock levels for Branch 4");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void calculateBranchIncome() {
        int[] totalIncome = new int[FlowerShop.stockLevels.length];
        
        for (int i = 0; i < FlowerShop.stockLevels.length; i++) {
            int branchIncome = 0;
            for (int j = 0; j < FlowerShop.stockLevels[i].length; j++) {
                branchIncome += FlowerShop.stockLevels[i][j] * FlowerShop.prices[j];
            }
            totalIncome[i] = branchIncome;
        }
        
        System.out.println("\n========================================");
        System.out.println("========= Total Income Per Branch =========");
        System.out.println("========================================");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-15s%n", "Branch", "Aglonema", "Keladi", "Alocasia", "Mawar", "Total Income");
        for (int i = 0; i < FlowerShop.stockLevels.length; i++) {
            System.out.printf("%-15s ", "Royal Garden " + (i + 1));
            for (int j = 0; j < FlowerShop.stockLevels[i].length; j++) {
                System.out.printf("%-10d ", FlowerShop.stockLevels[i][j]);
            }
            System.out.printf("Rp. %,d%n", totalIncome[i]);
        }
    }

    public static void displayStockForBranch4() {
        System.out.println("\n==========================================================");
        System.out.println("========= Stock Levels for Royal Garden Branch 4 =========");
        System.out.println("==========================================================");
        
        System.out.println("Stock levels before accounting for dead plants:");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int stock : FlowerShop.stockLevels[3]) {
            System.out.printf("%-10d ", stock);
        }
        
        System.out.println("\n\nStock levels after accounting for dead plants:");
        int[] updatedStock = new int[FlowerShop.stockLevels[3].length];
        for (int i = 0; i < FlowerShop.stockLevels[3].length; i++) {
            updatedStock[i] = FlowerShop.stockLevels[3][i] - FlowerShop.deadPlants[i];
        }
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int stock : updatedStock) {
            System.out.printf("%-10d ", stock);
        }
        System.out.println();
    }
}
