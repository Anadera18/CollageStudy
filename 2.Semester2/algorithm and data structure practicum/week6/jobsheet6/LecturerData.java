package jobsheet6;

public class LecturerData {
    private Lecturer[] lecturers = new Lecturer[10];
    private int count = 0;

    public void addLecturer(Lecturer lecturer) {
        if (count < 10) {
            lecturers[count++] = lecturer;
        } else {
            System.out.println("Maximum capacity reached!");
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            lecturers[i].print();
        }
    }

    public void sortAscending() { // Bubble Sort
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (lecturers[j].age > lecturers[j + 1].age) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void sortDescending() { // Selection Sort
        for (int i = 0; i < count - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < count; j++) {
                if (lecturers[j].age > lecturers[maxIdx].age) {
                    maxIdx = j;
                }
            }
            swap(i, maxIdx);
        }
    }

    private void swap(int i, int j) {
        Lecturer temp = lecturers[i];
        lecturers[i] = lecturers[j];
        lecturers[j] = temp;
    }
}
