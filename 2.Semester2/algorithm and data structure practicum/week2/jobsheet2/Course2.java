package jobsheet2;

public class Course2 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course2() {
    }

    public Course2(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit + " SKS");
        System.out.println("Hours: " + hour + " hours/week");
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
        System.out.println("Credit changed to " + newCredit + " SKS.");
    }

    void addHour(int extraHour) {
        hour += extraHour;
        System.out.println("Added " + extraHour + " hours. Total hours: " + hour);
    }

    void reduceHour(int reducedHour) {
        if (hour - reducedHour >= 0) {
            hour -= reducedHour;
            System.out.println("Reduced " + reducedHour + " hours. Remaining hours: " + hour);
        } else {
            System.out.println("Error: Cannot reduce hours below 0.");
        }
    }
}