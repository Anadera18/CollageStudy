package jobsheet7;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);

        SearchStudent data = new SearchStudent();
        int amountStudent = 5;

        System.out.println("-----------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("--------------");
            System.out.print("NIM\t :");
            int nim = df.nextInt();
            df.nextLine();
            System.out.print("Name\t :");
            String name = df.nextLine();
            System.out.print("Age\t :");
            int age = df.nextInt();
            System.out.print("GPA\t :");
            double gpa = df.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("--------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("===========================");
        System.out.print("Search student by NIM : ");
        int search = df.nextInt();
        System.out.println("Using binary Search");
        int position1 = data.findBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, position1);
        data.showData(search, position1);
    }
}
