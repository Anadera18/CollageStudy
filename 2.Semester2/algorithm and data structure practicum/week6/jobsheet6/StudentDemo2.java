package jobsheet6;

public class StudentDemo2 {
    public static void main(String[] args) {
        TopStudents2 topStudents = new TopStudents2();

        topStudents.add(new Student("2201", "Alice", "A", 3.9));
        topStudents.add(new Student("2202", "Bob", "B", 3.7));
        topStudents.add(new Student("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student("2204", "David", "D", 3.6));
        topStudents.add(new Student("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Insertion Sort:");
        topStudents.print();
    }
}
