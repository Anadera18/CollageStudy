package jobsheet2;

public class LecturerMain2 {
    public static void main(String[] args) {

        Lecturer2 lecturer1 = new Lecturer2();
        lecturer1.lecturerID = "Sigma1";
        lecturer1.name = "Sir. Imam";
        lecturer1.status = true;
        lecturer1.startYear = 2010;
        lecturer1.expertiseField = "Computer Science";
        lecturer1.print();
        lecturer1.setStatus(false);
        lecturer1.calculateTenure(2023);
        lecturer1.changeExpertiseField("Artificial Intelligence");

        Lecturer2 lecturer2 = new Lecturer2("Sigma2", "Prof. Cahya", true, 2005, "Mathematics");
        lecturer2.print();
        lecturer2.setStatus(true);
        lecturer2.calculateTenure(2023);
        lecturer2.changeExpertiseField("Data Science");
    }
}