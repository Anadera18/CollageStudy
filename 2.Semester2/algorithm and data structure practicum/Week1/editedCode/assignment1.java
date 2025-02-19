import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] cityCodes = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'N', 'T'}; 
        char[][] cityNames = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        char userChoice;
        boolean found;
        
        do {
            System.out.print("Enter city code: ");
            userChoice = scanner.next().charAt(0);
            found = false;

            for (int i = 0; i < cityCodes.length; i++) {
                if (userChoice == cityCodes[i]) {
                    for (char letter : cityNames[i]) {
                        System.out.print(letter);
                    }
                    System.out.println(); 
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("City not found. Try again.\n");
            }

        } while (!found);

        scanner.close();
    }
}
