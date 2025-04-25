package jobsheet3;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // THIS IS WHERE MODIFICATION (#4)
        System.out.print("Enter number of rectangles: ");
        int arrayLength = sc.nextInt();
        Rectangle[] rectangleArray = new Rectangle[arrayLength];
        // END OF MODIFICATION

        for (int i = 0; i < rectangleArray.length; i++) { // Changed from 3 to arrayLength
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < rectangleArray.length; i++) { // Changed from 10 to arrayLength
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);
        }
    }
}