package jobsheet5;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = df.nextInt();

        Factorial fk = new Factorial();
        System.out.println("The factorial of " + num + " using BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.factorialDC(num));
    }
}
