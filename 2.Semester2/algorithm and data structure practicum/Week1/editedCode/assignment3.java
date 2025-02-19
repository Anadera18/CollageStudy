import java.util.Scanner;

class Course {
    String name;
    int creditHours;
    int semester;
    String day;

    // Constructor
    public Course(String name, int creditHours, int semester, String day) {
        this.name = name;
        this.creditHours = creditHours;
        this.semester = semester;
        this.day = day;
    }
}

public class assignment3 {
    static Scanner scanner = new Scanner(System.in);
    static Course[] courses; // Array of Course objects

    public static void main(String[] args) {
        System.out.print("Enter the number of courses you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        courses = new Course[n]; // Initialize array

        int choice;
        while (true) {
            System.out.println("\n====== Main Menu ======");
            System.out.println("1. Add courses");
            System.out.println("2. Display all courses");
            System.out.println("3. Display courses by lecture day");
            System.out.println("4. Display courses by semester");
            System.out.println("5. Search for a course");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCourses();
                    break;
                case 2:
                    displayAllCourses();
                    break;
                case 3:
                    displayCoursesByDay();
                    break;
                case 4:
                    displayCoursesBySemester();
                    break;
                case 5:
                    searchCourse();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void addCourses() {
        for (int i = 0; i < courses.length; i++) {
            System.out.println("\nEnter details for course " + (i + 1) + ":");
            System.out.print("Course Name: ");
            String name = scanner.nextLine();
            System.out.print("Credit Hours: ");
            int creditHours = scanner.nextInt();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Lecture Day: ");
            String day = scanner.nextLine();

            courses[i] = new Course(name, creditHours, semester, day);
        }
    }

    public static void displayAllCourses() {
        System.out.printf("%n%-20s %-15s %-10s %-10s%n", "Course Name", "Credit Hours", "Semester", "Day");
        for (Course course : courses) {
            if (course != null) {
                System.out.printf("%-20s %-15d %-10d %-10s%n", course.name, course.creditHours, course.semester, course.day);
            }
        }
    }

    public static void displayCoursesByDay() {
        System.out.print("\nEnter the lecture day: ");
        String inputDay = scanner.nextLine();
        boolean found = false;

        System.out.printf("%n%-20s %-15s %-10s%n", "Course Name", "Credit Hours", "Semester");
        for (Course course : courses) {
            if (course != null && inputDay.equalsIgnoreCase(course.day)) {
                System.out.printf("%-20s %-15d %-10d%n", course.name, course.creditHours, course.semester);
                found = true;
            }
        }
        if (!found) System.out.println("No courses found on " + inputDay + ".");
    }

    public static void displayCoursesBySemester() {
        System.out.print("\nEnter the semester number: ");
        int inputSemester = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        boolean found = false;

        System.out.printf("%n%-20s %-15s %-10s%n", "Course Name", "Credit Hours", "Day");
        for (Course course : courses) {
            if (course != null && course.semester == inputSemester) {
                System.out.printf("%-20s %-15d %-10s%n", course.name, course.creditHours, course.day);
                found = true;
            }
        }
        if (!found) System.out.println("No courses found for semester " + inputSemester + ".");
    }

    public static void searchCourse() {
        System.out.print("\nEnter the course name to search: ");
        String inputName = scanner.nextLine();
        boolean found = false;

        System.out.printf("%n%-20s %-15s %-10s %-10s%n", "Course Name", "Credit Hours", "Semester", "Day");
        for (Course course : courses) {
            if (course != null && inputName.equalsIgnoreCase(course.name)) {
                System.out.printf("%-20s %-15d %-10d %-10s%n", course.name, course.creditHours, course.semester, course.day);
                found = true;
                break; // Stop searching after finding the first match
            }
        }
        if (!found) System.out.println("Course not found.");
    }
}
