import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        
        double scoreTugas = 0, scoreQuiz = 0, scoreUTS = 0, scoreUAS = 0, finalGrade = 0;
        String alfabet = "";
        
        Menu(df, scoreTugas, scoreQuiz, scoreUTS, scoreUAS);
        PenilaianFinalGrade(finalGrade, scoreQuiz, scoreTugas, scoreUTS, scoreUAS);
        alfabet(alfabet, finalGrade, scoreQuiz, scoreTugas, scoreUTS, scoreUAS);
        

    }
    public static void Menu(Scanner df, double tugas, double quiz, double uts, double uas) {
        System.out.println("\nThe program calculates the final grade");
        System.out.println("===============================");
        
        
do{
        System.out.print("enter assignment grade: ");
        tugas = df.nextInt();

        System.out.print("enter quiz score: ");
        quiz = df.nextInt();

        System.out.print("enter UTS score: ");
        uts = df.nextInt();

        System.out.print("enter UAS grade: ");
        uas = df.nextInt();

        if (tugas < 0 || tugas > 100 || quiz < 0 || quiz > 100 || uts < 0
            || uts > 100 || uas < 0 || uas > 100) {
                System.out.println("Input invalid, please input a valid value.\n");
            }
}while (tugas < 0 || tugas > 100 || quiz < 0 || quiz > 100 || uts < 0
            || uts > 100 || uas < 0 || uas > 100);
       
        System.out.println("===============================");
    }

        public static void PenilaianFinalGrade(double finalGrade, double scoreQuiz, double scoreTugas, double scoreUTS, double scoreUAS) {
            finalGrade = ((scoreQuiz * 0.20) + (scoreTugas * 0.20) + (scoreUTS * 0.30) + (scoreUAS * 0.30));
            System.out.println("===============================");
            System.out.println("finalGrade: " +finalGrade);
            System.out.println(null);
        }
            public static void alfabet(String alfabet, double finalGrade, double scoreQuiz, double scoreTugas, double scoreUTS, double scoreUAS) {
                if (finalGrade > 80 && finalGrade <= 100) {
            alfabet = "A";
             
        } else if (finalGrade > 73 && finalGrade <= 80) {
            alfabet = "B+";

        } else if (finalGrade > 65 && finalGrade <= 73) {
            alfabet = "B";
            
        } else if (finalGrade > 60 && finalGrade <= 65) {
            alfabet = "C+";
             
        } else if (finalGrade > 50 && finalGrade <= 60) {
            alfabet = "C";
            
        } else if (finalGrade > 39 && finalGrade <= 50) {
            alfabet = "D";
             
        } else if (finalGrade <= 39) {
            alfabet = "E";
             
        } else {
            alfabet = "invalid";
             
        }
            }
        }


    