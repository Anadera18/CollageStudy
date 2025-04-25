|            | Algorithm and Data Structure                 |
| ---------- | -------------------------------------------- |
| NIM        | 244107020223                                 |
| Nama       | Andhika Daffa Athaaillah                     |
| Kelas      | TI - 1I                                      |
| Repository | [link] (https://github.com/Anadera18/CollageStudy/tree/main/2.Semester2/algorithm%20and%20data%20structure%20practicum) |

# Practical Session

# **Labs 6 BRUTE FORCE AND DIVIDE CONQUER**

## 6.2 Experiment 1 - Implementing Sorting Using Objects
## 6.2.1 Experiment Steps
## A,B, & C. SORTING – BUBBLE SORT, SELECTION SORT, & INSERTION SORT

### Brief Explanation
- Goal: Implement Bubble Sort using OOP in Java.
    Steps:
     - Create a Sorting class with:
        - Array data[] and size jmlDat
        -  bubbleSort() method (compares/swaps elements)
        - print() method (displays results)

    - In SortingMain:
        - Initialize an array
        - Create a Sorting object
        - Call bubbleSort() and print()

- Output: Sorted array in ascending order.
- Purpose: Learn OOP structure + sorting basics.

## 6.2.2. Verification of Experiment Results

![Screenshot of the program](Sorting%20output%201.png)

## 6.2.3 Verification of Experiment Results

![Screenshot of the program](output%20b.png)

## 6.2.4 Verification of Experiment Results

![Screenshot of the program](output%20c.png)

## 6.2.5 Questions!

1. **Function of the code:**  
   - It **swaps** `data[j]` and `data[j + 1]` if the current element is **greater** than the next (used in **Bubble Sort**).  

2. **Code for finding minimum in Selection Sort:**  
   ```java
   int minIndex = i;
   for (int j = i + 1; j < data.length; j++) {
       if (data[j] < data[minIndex]) {
           minIndex = j;
       }
   }
   ```

3. **Purpose of the condition in Insertion Sort:**  
   - `while (j >= 0 && data[j] > key)` checks if the current element (`key`) should move **left** to its correct sorted position.  

4. **Purpose of the command:**  
   - `data[j + 1] = data[j]` **shifts** elements to the right to make space for `key` in Insertion Sort.  

## 6.3 Experiment 2- Sorting Using an Array of Objects
## 6.3.1 Experiment Steps - Sorting Student Data Based on GPA (Bubble Sort)

### **Brief Explanation of the Classes:**  

1. **`Student` Class**  
   - **Attributes:** `nim` (ID), `name`, `studentClass`, `gpa` (grade).  
   - **Constructors:**  
     - Default (`Student()`).  
     - Parameterized (`Student(nim, name, clsNm, gpa)`).  
   - **Method:** `print()` → Displays student details.  

2. **`TopStudents` Class**  
   - **Attributes:**  
     - `listStudent[5]` (array of `Student` objects).  
     - `idx` (tracks current index).  
   - **Methods:**  
     - `add(std)` → Inserts a student into the array.  
     - `print()` → Shows all students.  
     - `bubbleSort()` → Sorts students by **GPA** (ascending/descending).  

**Purpose:**  
- Store, display, and sort student data using **Bubble Sort** (compares adjacent GPAs and swaps if needed).  

## 6.3.2 Experiment Steps

    Create Student<AttendanceNumber> Class

        Define attributes: nim, name, studentClass, gpa.

        Add constructors (default + parameterized).

        Add print() method to display student details.

    Create TopStudents<AttendanceNumber> Class

        Declare an array listStudents[] (size 5) and index tracker idx.

        Methods:

            add(): Insert a Student object into the array if space exists.

            print(): Display all students in the array.

            bubbleSort(): Sort students by GPA (ascending) using Bubble Sort.

    Demo in StudentDemo<AttendanceNumber>

        Instantiate TopStudents.

        Add 5 student objects using add().

        Steps:

            Call print() (unsorted list).

            Call bubbleSort() to sort by GPA.

            Call print() again (sorted list).

## 6.3.3 Verification of Experiment Results

![the picture](Student%20bubble%20sort%20output.png)

## 6.3.4 Questions!

### **Short & Simple Answers:**

#### **1. Bubble Sort Questions:**
a) **`i < idx - 1`**  
   - Because after `idx-1` passes, the largest elements are already sorted at the end.  

b) **`j < idx - i - 1`**  
   - Avoids re-checking already sorted elements (last `i` elements are in place).  

c) **For 50 data:**  
   - **`i` loop runs 49 times** (stages).  
   - **49 stages** of Bubble Sort will occur.  

#### **2. Dynamic Input Modification:**  
- Use `Scanner` to input `nim`, `name`, `studentClass`, and `gpa` from the keyboard.  
- Example snippet:  
  ```java
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter NIM: ");
  String nim = sc.nextLine();
  // Repeat for other fields...
  ```
- Add students to `TopStudents` using these inputs.  

## 6.3.5 Sorting Student Data Based on GPA (Selection Sort)
If we previously sorted students based on GPA using Bubble Sort in descending order, we will
now add a function to sort using Selection Sort in ascending order.

## 6.3.7 Experiment Steps

### **Brief Steps to Add `selectionSort()`:**  

1. **In `TopStudents` Class:**  
   - Add a **`selectionSort()`** method to sort students by **GPA** (ascending) using **Selection Sort**:  
     - Find the student with the **minimum GPA** in the unsorted part.  
     - Swap it with the first unsorted student.  
     - Repeat until all are sorted.  

2. **In `StudentDemo` Class:**  
   - After `bubbleSort()`, add:  
     ```java
     topStudents.selectionSort(); // Sort using Selection Sort
     topStudents.print();        // Print sorted data
     ```  

3. **Run & Observe:**  
   - Execute `StudentDemo` to see:  
     - Original list → `bubbleSort()` result → `selectionSort()` result.  
   - Verify both sorts arrange GPAs in **ascending order**.  

##  6.3.8 Verification of Experiment Results

![gambar nye](Output%20student%20selection%20sort.png)

## 6.3.9 Questions!

### **Short & Simple Explanation:**  

This code snippet is part of **Selection Sort** and performs the following:  

1. **`minIndex = i`**  
   - Starts by assuming the current element (at index `i`) is the smallest.  

2. **`for (int j = i + 1; j < idx; j++)`**  
   - Compares all remaining unsorted students (from `i+1` to end) to find the **true minimum GPA**.  

3. **`if (listStudents[j].gpa < listStudents[minIndex].gpa)`**  
   - If a smaller GPA is found, updates `minIndex` to point to that student.  

**Purpose:**  
- After the loop, `minIndex` holds the position of the smallest GPA in the unsorted section.  
- This value is then **swapped** with the element at index `i` (next sorted position).  

## 6.3.10 Sorting Student Data Based on GPA Using Insertion Sort 
## 6.3.11 Experiment Steps

### **Brief Steps for Adding `insertionSort()`:**  

1. **In `TopStudents` Class:**  
   - Add an **`insertionSort()`** method to sort students by **GPA** (ascending) using **Insertion Sort**:  
     - Iterate from the 2nd student (`i = 1`) to the end.  
     - For each, shift larger GPAs **right** until the correct position is found.  
     - Insert the student into their sorted place.  

2. **In `StudentDemo` Class:**  
   - After other sorts, add:  
     ```java
     topStudents.insertionSort(); // Sort using Insertion Sort
     topStudents.print();        // Print sorted data
     ```  

3. **Run & Observe:**  
   - Execute `StudentDemo` to see:  
     - Original list → `bubbleSort()` → `selectionSort()` → `insertionSort()` results.  
   - Verify all methods sort GPAs in **ascending order**.  

## 6.3.12 Verification of Experiment Results 

![suii](insertion%20student.png)

## 6.3.13 Question
To sort in descending order, simply reverse the comparison condition in the while loop:
```java
public void insertionSort() {
    for (int i = 1; i < idx; i++) {
        Student temp = listStudents[i];
        int j = i;

        // Changed '>' to '<' to sort in descending order
        while (j > 0 && listStudents[j - 1].gpa < temp.gpa) {
            listStudents[j] = listStudents[j - 1];
            j--;
        }

        listStudents[j] = temp;
    }
}
```

## 6.4 Assignment
- code
### Lecturer code
```java
package jobsheet6;

public class Lecturer {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Gender: " + (gender ? "Male" : "Female") +
                ", Age: " + age);
    }
}

```
### LecturerData code
```java
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

```
### LecturerMain code
```java
package jobsheet6;

import java.util.Scanner;

public class LecturerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LecturerData data = new LecturerData();

        while (true) {
            System.out.println("\n=== Lecturer Management ===");
            System.out.println("1. Add Lecturer");
            System.out.println("2. Display All Lecturers");
            System.out.println("3. Sort by Age (Youngest First)");
            System.out.println("4. Sort by Age (Oldest First)");
            System.out.println("5. Exit");
            System.out.print("Select option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewLecturer(scanner, data);
                    break;
                case 2:
                    System.out.println("\nAll Lecturers:");
                    data.displayAll();
                    break;
                case 3:
                    data.sortAscending();
                    System.out.println("\nSorted by Age (Ascending):");
                    data.displayAll();
                    break;
                case 4:
                    data.sortDescending();
                    System.out.println("\nSorted by Age (Descending):");
                    data.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void addNewLecturer(Scanner scanner, LecturerData data) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        boolean gender;
        while (true) {
            System.out.print("Enter Gender (M/F): ");
            String genderInput = scanner.nextLine().toUpperCase();
            if (genderInput.equals("M")) {
                gender = true;
                break;
            } else if (genderInput.equals("F")) {
                gender = false;
                break;
            } else {
                System.out.println("Invalid input! Please enter M or F.");
            }
        }

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        data.addLecturer(new Lecturer(id, name, gender, age));
        System.out.println("Lecturer added successfully!");
    }
}

```
- output

![wafhoofube](Last%20output%203%20(3).png)
![wafhoofube](Last%20output%203%20(2).png)
![wafhoofube](Last%20output%203%20(1).png)