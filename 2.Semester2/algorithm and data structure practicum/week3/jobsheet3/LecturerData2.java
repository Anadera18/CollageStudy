package jobsheet3;

public class LecturerData2 {
    public static void showAllLecturerData(Lecturer2[] lecturerArray) {
        System.out.println("\nAll Lecturer Data:");
        for (Lecturer2 lecturer : lecturerArray) {
            System.out.println("ID: " + lecturer.id);
            System.out.println("Name: " + lecturer.name);
            System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
            System.out.println("Age: " + lecturer.age);
            System.out.println("-------------------");
        }
    }

    public static void countLecturerByGender(Lecturer2[] lecturerArray) {
        int maleCount = 0;
        int femaleCount = 0;

        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.gender) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }

        System.out.println("\nNumber of Male Lecturers: " + maleCount);
        System.out.println("Number of Female Lecturers: " + femaleCount);
    }

    public static void averageLecturerAgeByGender(Lecturer2[] lecturerArray) {
        int maleTotalAge = 0;
        int femaleTotalAge = 0;
        int maleCount = 0;
        int femaleCount = 0;

        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.gender) {
                maleTotalAge += lecturer.age;
                maleCount++;
            } else {
                femaleTotalAge += lecturer.age;
                femaleCount++;
            }
        }

        System.out.println("\nAverage Age:");
        System.out.println("Male Lecturers: " +
                (maleCount > 0 ? (double) maleTotalAge / maleCount : 0));
        System.out.println("Female Lecturers: " +
                (femaleCount > 0 ? (double) femaleTotalAge / femaleCount : 0));
    }

    public static void showOldestLecturerInfo(Lecturer2[] lecturerArray) {
        if (lecturerArray.length == 0)
            return;

        Lecturer2 oldest = lecturerArray[0];
        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }

        System.out.println("\nOldest Lecturer:");
        System.out.println("ID: " + oldest.id);
        System.out.println("Name: " + oldest.name);
        System.out.println("Gender: " + (oldest.gender ? "Male" : "Female"));
        System.out.println("Age: " + oldest.age);
    }

    public static void showYoungestLecturerInfo(Lecturer2[] lecturerArray) {
        if (lecturerArray.length == 0)
            return;

        Lecturer2 youngest = lecturerArray[0];
        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }

        System.out.println("\nYoungest Lecturer:");
        System.out.println("ID: " + youngest.id);
        System.out.println("Name: " + youngest.name);
        System.out.println("Gender: " + (youngest.gender ? "Male" : "Female"));
        System.out.println("Age: " + youngest.age);
    }
}