package jobsheet5;

import java.util.Scanner;

public class PowerMain {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = df.nextInt();

        Power[] png = new Power[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input base number for " + (i + 1) + "th element: ");
            int base = df.nextInt();
            System.out.print("Input exponent for " + (i + 1) + "th element: ");
            int exp = df.nextInt();
            png[i] = new Power(base, exp);
        }

        System.out.println("Power result using Bruteforce: ");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }

        System.out.println("Power result using Divide and Conquer: ");
        for (Power p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
    }
}
