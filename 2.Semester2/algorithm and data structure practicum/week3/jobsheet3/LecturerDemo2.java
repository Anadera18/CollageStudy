package jobsheet3;

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

        System.out.println("\nLecturer Information:");
        for (Lecturer2 lecturer : lecturers) {
            System.out.println("ID: " + lecturer.id);
            System.out.println("Name: " + lecturer.name);
            System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
            System.out.println("Age: " + lecturer.age);
            System.out.println("-------------------");
        }

        LecturerData2.showAllLecturerData(lecturers);
        LecturerData2.countLecturerByGender(lecturers);
        LecturerData2.averageLecturerAgeByGender(lecturers);
        LecturerData2.showOldestLecturerInfo(lecturers);
        LecturerData2.showYoungestLecturerInfo(lecturers);

        sc.close();
    }
}