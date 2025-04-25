package jobsheet5;

public class StudentGradeAnalyzer {
    public static double findMaxDC(double[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        double leftMax = findMaxDC(arr, left, mid);
        double rightMax = findMaxDC(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    // Method to find minimum score using Divide and Conquer
    public static double findMinDC(double[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        double leftMin = findMinDC(arr, left, mid);
        double rightMin = findMinDC(arr, mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    // Method to calculate average using Brute Force
    public static double calculateAverageBF(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}
