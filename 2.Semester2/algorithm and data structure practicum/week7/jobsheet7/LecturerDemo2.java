package jobsheet7;

import java.util.Scanner;

public class LecturerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lecturers: ");
        int numLecturers = sc.nextInt();
        sc.nextLine();

        Lecturer2[] lecturers = new Lecturer2[numLecturers];

        for (int i = 0; i < numLecturers; i++) {
            System.out.println("\nEnter details for lecturer " + (i + 1));

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender (M/F): ");
            boolean gender = sc.nextLine().equalsIgnoreCase("M");

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lecturers[i] = new Lecturer2(id, name, gender, age);
        }

        // Show all data

        LecturerData2.showAllLecturerData(lecturers);

        // Search by name
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();
        LecturerData2.sequentialSearch(lecturers, searchName);

        // Search by age
        System.out.print("\nEnter age to search: ");
        int searchAge = sc.nextInt();
        LecturerData2.binarySearch(lecturers, searchAge);

        // Other statistics
        LecturerData2.countLecturerByGender(lecturers);
        LecturerData2.averageLecturerAgeByGender(lecturers);
        LecturerData2.showOldestLecturerInfo(lecturers);
        LecturerData2.showYoungestLecturerInfo(lecturers);

        sc.close();
    }
}
