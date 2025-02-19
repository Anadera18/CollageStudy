import java.util.Scanner;

class StudentData {
    static final String[] COURSES = { 
        "Pancasila", "Information Technology Concepts", "Critical Thinking and Problem Solving",
        "Basic Mathematics", "English", "Fundamentals of Programming", 
        "Programming Practicum", "Occupational Health and Safety" 
    };
    
    static final double[] CREDITS = {3.0, 4.0, 3.0, 4.0, 4.0, 2.5, 2.5, 4.0}; // SKS (Credit Hours)
    
    static String[] letterGrades = new String[COURSES.length];
    static double[] gradePoints = new double[COURSES.length];
    static double[] numericGrades = new double[COURSES.length];
    static double totalWeightedPoints = 0;
    static double totalCredits = 0;
    static double gpa = 0;
}

public class Array {
    static Scanner df = new Scanner(System.in);

    public static void main(String[] args) {
        inputGrades();
        convertGrades();
        calculateGPA();
        displayResults();
        df.close();
    }

    public static void inputGrades() {
        System.out.println("==============================");
        System.out.println("Semester GPA Calculation Program");
        System.out.println("==============================");

        for (int i = 0; i < StudentData.COURSES.length; i++) {
            System.out.print("Enter numeric grade for " + StudentData.COURSES[i] + ": ");
            StudentData.numericGrades[i] = df.nextDouble();
        }
    }

    public static void convertGrades() {
        for (int i = 0; i < StudentData.COURSES.length; i++) {
            double grade = StudentData.numericGrades[i];
            
            if (grade >= 80) {
                StudentData.letterGrades[i] = "A";
                StudentData.gradePoints[i] = 4.0;
            } else if (grade >= 73) {
                StudentData.letterGrades[i] = "B+";
                StudentData.gradePoints[i] = 3.5;
            } else if (grade >= 65) {
                StudentData.letterGrades[i] = "B";
                StudentData.gradePoints[i] = 3.0;
            } else if (grade >= 60) {
                StudentData.letterGrades[i] = "C+";
                StudentData.gradePoints[i] = 2.5;
            } else if (grade >= 50) {
                StudentData.letterGrades[i] = "C";
                StudentData.gradePoints[i] = 2.0;
            } else if (grade >= 40) {
                StudentData.letterGrades[i] = "D";
                StudentData.gradePoints[i] = 1.0;
            } else {
                StudentData.letterGrades[i] = "E";
                StudentData.gradePoints[i] = 0.0;
            }
        }
    }

    public static void calculateGPA() {
        StudentData.totalWeightedPoints = 0;
        StudentData.totalCredits = 0;
        
        for (int i = 0; i < StudentData.COURSES.length; i++) {
            StudentData.totalWeightedPoints += StudentData.gradePoints[i] * StudentData.CREDITS[i];
            StudentData.totalCredits += StudentData.CREDITS[i];
        }
        
        StudentData.gpa = StudentData.totalWeightedPoints / StudentData.totalCredits;
    }

    public static void displayResults() {
        System.out.println("==============================");
        System.out.println("Converted Grades");
        System.out.println("==============================");
        
        System.out.printf("%-43s %-20s %-20s %-20s\n", "Course", "Numeric Grade", "Letter Grade", "Grade Points");
        for (int i = 0; i < StudentData.COURSES.length; i++) {
            System.out.printf("%-43s %-20.2f %-20s %-20.2f\n", StudentData.COURSES[i], 
                              StudentData.numericGrades[i], StudentData.letterGrades[i], StudentData.gradePoints[i]);
        }
        System.out.println("==============================");
        System.out.printf("GPA: %-1.2f\n", StudentData.gpa);
        
        if (StudentData.gpa >= 2.0) {
            System.out.println("Congratulations! You passed the semester!");
        } else {
            System.out.println("Unfortunately, you did not pass. Keep working hard!");
        }
    }
}
