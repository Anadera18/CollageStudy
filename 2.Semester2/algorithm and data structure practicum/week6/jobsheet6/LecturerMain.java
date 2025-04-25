package jobsheet6;

import java.util.Scanner;

public class LecturerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LecturerData data = new LecturerData();

        while (true) {
            System.out.println("\n=== Lecturer Management ===");
            System.out.println("1. Add Lecturer");
            System.out.println("2. Display All Lecturers");
            System.out.println("3. Sort by Age (Youngest First)");
            System.out.println("4. Sort by Age (Oldest First)");
            System.out.println("5. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewLecturer(scanner, data);
                    break;
                case 2:
                    System.out.println("\nAll Lecturers:");
                    data.displayAll();
                    break;
                case 3:
                    data.sortAscending();
                    System.out.println("\nSorted by Age (Ascending):");
                    data.displayAll();
                    break;
                case 4:
                    data.sortDescending();
                    System.out.println("\nSorted by Age (Descending):");
                    data.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void addNewLecturer(Scanner scanner, LecturerData data) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        boolean gender;
        while (true) {
            System.out.print("Enter Gender (M/F): ");
            String genderInput = scanner.nextLine().toUpperCase();
            if (genderInput.equals("M")) {
                gender = true;
                break;
            } else if (genderInput.equals("F")) {
                gender = false;
                break;
            } else {
                System.out.println("Invalid input! Please enter M or F.");
            }
        }

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        data.addLecturer(new Lecturer(id, name, gender, age));
        System.out.println("Lecturer added successfully!");
    }
}
