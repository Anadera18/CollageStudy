package jobsheet7;

public class LecturerData2 {
    public static void sequentialSearch(Lecturer2[] lecturerArray, String searchName) {
        System.out.println("\nSequential Search Results for Name: " + searchName);
        boolean found = false;
        int count = 0;

        for (Lecturer2 lecturer : lecturerArray) {
            if (lecturer.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found at index: " + count);
                System.out.println("ID: " + lecturer.id);
                System.out.println("Name: " + lecturer.name);
                System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
                System.out.println("Age: " + lecturer.age);
                System.out.println("-------------------");
                found = true;
            }
            count++;
        }

        if (!found) {
            System.out.println("No lecturer found with name: " + searchName);
        }
    }

    // Binary Search by Age (requires sorted array)
    public static void binarySearch(Lecturer2[] lecturerArray, int searchAge) {
        // First sort by age
        sortByAge(lecturerArray);

        System.out.println("\nBinary Search Results for Age: " + searchAge);
        int left = 0;
        int right = lecturerArray.length - 1;
        boolean found = false;
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (lecturerArray[mid].age == searchAge) {
                // Handle multiple matches
                int temp = mid;
                // Search left side for duplicates
                while (temp >= 0 && lecturerArray[temp].age == searchAge) {
                    printLecturerInfo(lecturerArray[temp]);
                    temp--;
                    count++;
                }
                // Search right side for duplicates
                temp = mid + 1;
                while (temp < lecturerArray.length && lecturerArray[temp].age == searchAge) {
                    printLecturerInfo(lecturerArray[temp]);
                    temp++;
                    count++;
                }
                found = true;
                break;
            } else if (lecturerArray[mid].age < searchAge) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("No lecturer found with age: " + searchAge);
        }

        if (count > 1) {
            System.out.println("Warning: Found " + count + " lecturers with age " + searchAge);
        }
    }

    // Helper method to sort by age (using simple bubble sort)
    private static void sortByAge(Lecturer2[] lecturerArray) {
        for (int i = 0; i < lecturerArray.length - 1; i++) {
            for (int j = 0; j < lecturerArray.length - i - 1; j++) {
                if (lecturerArray[j].age > lecturerArray[j + 1].age) {
                    Lecturer2 temp = lecturerArray[j];
                    lecturerArray[j] = lecturerArray[j + 1];
                    lecturerArray[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print lecturer info
    private static void printLecturerInfo(Lecturer2 lecturer) {
        System.out.println("Found lecturer:");
        System.out.println("ID: " + lecturer.id);
        System.out.println("Name: " + lecturer.name);
        System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
        System.out.println("Age: " + lecturer.age);
        System.out.println("-------------------");
    }

    public static void countLecturerByGender(Lecturer2[] lecturerArray) {
        int male = 0, female = 0;
        for (Lecturer2 l : lecturerArray) {
            if (l.gender)
                male++;
            else
                female++;
        }
        System.out.println("Male lecturers: " + male);
        System.out.println("Female lecturers: " + female);
    }

    // 2. Calculate average age by gender
    public static void averageLecturerAgeByGender(Lecturer2[] lecturerArray) {
        int maleAge = 0, femaleAge = 0;
        int maleCount = 0, femaleCount = 0;

        for (Lecturer2 l : lecturerArray) {
            if (l.gender) {
                maleAge += l.age;
                maleCount++;
            } else {
                femaleAge += l.age;
                femaleCount++;
            }
        }

        System.out.println("Avg male age: " + (maleCount > 0 ? maleAge / maleCount : 0));
        System.out.println("Avg female age: " + (femaleCount > 0 ? femaleAge / femaleCount : 0));
    }

    // 3. Find oldest lecturer
    public static void showOldestLecturerInfo(Lecturer2[] lecturerArray) {
        if (lecturerArray.length == 0)
            return;

        Lecturer2 oldest = lecturerArray[0];
        for (Lecturer2 l : lecturerArray) {
            if (l.age > oldest.age)
                oldest = l;
        }

        System.out.println("Oldest lecturer: " + oldest.name + " (Age: " + oldest.age + ")");
    }

    // 4. Find youngest lecturer
    public static void showYoungestLecturerInfo(Lecturer2[] lecturerArray) {
        if (lecturerArray.length == 0)
            return;

        Lecturer2 youngest = lecturerArray[0];
        for (Lecturer2 l : lecturerArray) {
            if (l.age < youngest.age)
                youngest = l;
        }

        System.out.println("Youngest lecturer: " + youngest.name + " (Age: " + youngest.age + ")");
    }

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
}
