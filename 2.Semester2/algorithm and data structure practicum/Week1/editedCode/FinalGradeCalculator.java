import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);

        // Getting input from user
        double[] scores = Menu(df);

        // Calculating final grade
        double finalGrade = PenilaianFinalGrade(scores[0], scores[1], scores[2], scores[3]);

        // Determining letter grade
        String letterGrade = alfabet(finalGrade);

        // Displaying results
        System.out.println("===============================");
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Letter Grade: " + letterGrade);

        // Pass/Fail Message
        if (finalGrade >= 50) {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("Congratulations! You passed. ");
        } else {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("You didn't pass. Keep trying!");
        }
    }

    // Method to get scores from user
    public static double[] Menu(Scanner df) {
        double tugas, quiz, uts, uas;
        
        System.out.println("\nThe program calculates the final grade");
        System.out.println("===============================");
        
        do {
            System.out.print("Enter assignment grade: ");
            tugas = df.nextDouble();

            System.out.print("Enter quiz score: ");
            quiz = df.nextDouble();

            System.out.print("Enter UTS score: ");
            uts = df.nextDouble();

            System.out.print("Enter UAS grade: ");
            uas = df.nextDouble();

            if (tugas < 0 || tugas > 100 || quiz < 0 || quiz > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
                System.out.println("===============================");
                System.out.println("==============================="); 
                System.out.println("Invalid input! Please enter valid input.\n");
                System.out.println("===============================");
                System.out.println("==============================="); 
                System.out.println("\nThe program calculates the final grade");
                System.out.println("===============================");
            }

        } while (tugas < 0 || tugas > 100 || quiz < 0 || quiz > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100);

        System.out.println("===============================");

        return new double[]{tugas, quiz, uts, uas};
    }

    // Method to calculate final grade
    public static double PenilaianFinalGrade(double scoreTugas, double scoreQuiz, double scoreUTS, double scoreUAS) {
        return (scoreQuiz * 0.20) + (scoreTugas * 0.20) + (scoreUTS * 0.30) + (scoreUAS * 0.30);
    }

    // Method to determine letter grade
    public static String alfabet(double finalGrade) {
        if (finalGrade > 80 && finalGrade <= 100) {
            return "A";
        } else if (finalGrade > 73 && finalGrade <= 80) {
            return "B+";
        } else if (finalGrade > 65 && finalGrade <= 73) {
            return "B";
        } else if (finalGrade > 60 && finalGrade <= 65) {
            return "C+";
        } else if (finalGrade > 50 && finalGrade <= 60) {
            return "C";
        } else if (finalGrade > 39 && finalGrade <= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}
