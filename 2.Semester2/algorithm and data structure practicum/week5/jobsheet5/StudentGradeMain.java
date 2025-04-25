package jobsheet5;

public class StudentGradeMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ahmad", "220101001", 2022, 78, 82),
                new Student("Budi", "220101002", 2022, 85, 88),
                new Student("Cindy", "220101003", 2021, 90, 87),
                new Student("Dian", "220101004", 2021, 76, 79),
                new Student("Eko", "220101005", 2023, 92, 95),
                new Student("Fajar", "220101006", 2020, 88, 85),
                new Student("Gina", "220101007", 2023, 80, 83),
                new Student("Hadi", "220101008", 2020, 82, 84)
        };

        double[] midtermScores = new double[students.length];
        double[] finalScores = new double[students.length];

        for (int i = 0; i < students.length; i++) {
            midtermScores[i] = students[i].midtermScore;
            finalScores[i] = students[i].finalScore;
        }

        double highestMidterm = StudentGradeAnalyzer.findMaxDC(midtermScores, 0, midtermScores.length - 1);
        double lowestMidterm = StudentGradeAnalyzer.findMinDC(midtermScores, 0, midtermScores.length - 1);
        double averageFinal = StudentGradeAnalyzer.calculateAverageBF(finalScores);

        System.out.println("Highest Midterm Score: " + highestMidterm);
        System.out.println("Lowest Midterm Score: " + lowestMidterm);
        System.out.println("Average Final Score: " + averageFinal);
    }
}

class Student {
    String name;
    String studentId;
    int admissionYear;
    double midtermScore;
    double finalScore;

    public Student(String name, String studentId, int admissionYear, double midtermScore, double finalScore) {
        this.name = name;
        this.studentId = studentId;
        this.admissionYear = admissionYear;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
}
