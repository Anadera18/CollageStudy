package jobsheet2;

public class CourseMain2 {
    public static void main(String[] args) {

        Course2 course1 = new Course2();
        course1.courseID = "TungTungSahur";
        course1.name = "Algorithm and Data Structure";
        course1.credit = 3;
        course1.hour = 2;
        course1.print();
        course1.changeCredit(4);
        course1.addHour(1);
        course1.reduceHour(1);

        Course2 course2 = new Course2("BombardiloCrocodilo", "Linear Algebra", 4, 3);
        course2.print();
        course2.changeCredit(3);
        course2.addHour(2);
        course2.reduceHour(5);
    }
}