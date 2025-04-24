package jobsheet2;

public class Lecturer2 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer2() {
    }

    public Lecturer2(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise: " + expertiseField);
    }

    void setStatus(boolean status) {
        this.status = status;
        System.out.println("Status updated to: " + (status ? "Active" : "Inactive"));
    }

    int calculateTenure(int yearNow) {
        int tenure = yearNow - startYear;
        System.out.println("Tenure: " + tenure + " years");
        return tenure;
    }

    void changeExpertiseField(String newField) {
        expertiseField = newField;
        System.out.println("Expertise changed to: " + newField);
    }
}