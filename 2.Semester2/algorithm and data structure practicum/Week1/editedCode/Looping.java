import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        
        System.out.print("\nPlease enter your NIM: ");
        long nim = df.nextLong();
        System.out.println("===============================");
        df.close();

        int n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        
        for (int i = 0; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;  // Skips 6 and 10
            }
            
            switch (i % 2) {
                case 0:
                    if (i != 0) {
                        System.out.print(i + " ");
                    }
                    break;
                case 1:
                    System.out.print("* ");
                    break;
            }

        }
      
    }
}
