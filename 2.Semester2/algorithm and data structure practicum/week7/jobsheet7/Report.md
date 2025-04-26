|            | Algorithm and Data Structure                 |
| ---------- | -------------------------------------------- |
| NIM        | 244107020223                                 |
| Nama       | Andhika Daffa Athaaillah                     |
| Kelas      | TI - 1I                                      |
| Repository | [link] (https://github.com/Anadera18/CollageStudy/tree/main/2.Semester2/algorithm%20and%20data%20structure%20practicum) |

# Practical Session

# **Labs 7 SEARCHING**

## 7.2 Sequential Search Method
## 7.1 Steps
### **Brief Step-by-Step Explanation (7.1 Steps)**  

#### **1. Project Setup**  
- Create a package named **`week7`** in your Java project.  

#### **2. `Students` Class (Data Model)**  
- **Attributes**:  
  - `nim` (int), `name` (String), `age` (int), `gpa` (double).  
- **Constructor**:  
  - Initialize attributes via parameters (`nim`, `name`, `age`, `gpa`).  
- **Method**:  
  - `display()`: Prints student details.  

#### **3. `SearchStudent` Class (Operations)**  
- **Attributes**:  
  - `listStd[]`: Array to store `Students` objects (max 5).  
  - `idx`: Tracks current number of students.  
- **Methods**:  
  - `add()`: Inserts a `Students` object into `listStd`.  
  - `display()`: Prints all students using a **foreach loop**.  
  - `findSeqSearch(nim)`: Searches for a student by NIM (returns index or `-1` if not found).  
  - `showPosition(pos)`: Displays the search result position.  
  - `showData(pos)`: Prints student data at the found position.  

#### **4. `MainStudent` Class (Driver Program)**  
- **Steps**:  
  1. Create a `SearchStudent` object.  
  2. Add 5 sample students using `add()`.  
  3. Display all students with `display()`.  
  4. Prompt user to input a **NIM** to search.  
  5. Call `findSeqSearch()`, then show results using `showPosition()` and `showData()`.  

#### **5. Execution Flow**  
1. **Input**: User adds students (e.g., NIM=101, Name="John").  
2. **Search**: User enters a NIM → Sequential Search checks the array.  
3. **Output**:  
   - If found: Prints position and student details.  
   - If not found: "Not found!".  

## 7.2 Result

![eswygbfiklusvb](Student%201.png)
![eswygbfiklusvb](student%202.png)

## 7.3 Question
---

### **1. Difference between `displayData` and `displayPosition`**  
- **`showPosition`**: Only shows the **index position** of the found student (e.g., "Data 123 is found in index-2").  
- **`showData`**: Displays **detailed student information** (NIM, name, age, GPA) if found.  

---

### **2. Purpose of `break` in the Code**  
```java
if (listStd[i].nim == search) {
    position = i;
    break;  // Exits the loop immediately after finding the match
}
```  
- **Function**: Stops the loop once the student is found, improving efficiency (no unnecessary iterations).  

---

### **3. Unsorted NIM Data: Error or Correct Results?**  
- **No error**, and **results are still correct**.  
- **Why?** Sequential search checks **every element regardless of order**. Sorting is irrelevant for correctness (but affects performance).  

---

### **4. Why `position` is Initialized to `-1`**  
```java
int position = -1;  // Default "not found" value
```  
- **Purpose**:  
  - `-1` is a conventional indicator for "not found" (invalid array index).  
  - If the loop finds no match, the method returns `-1`, which `showPosition`/`showData` use to display "Data not found".  
---

## 7.3 Binary Search Method
## 7.3.1. Steps

### **Brief Explanation**

1. **Add `findBinarySearch()` to `SearchStudent` Class**  
   - **Purpose**: Implement **binary search** to find students by NIM (faster than sequential search).  
   - **Requirement**: NIM data **must be sorted** (smallest to largest).  
   - **Logic**:  
     - Start with `left` and `right` pointers.  
     - Check the middle element:  
       - If NIM matches, return its index.  
       - If target NIM is smaller, search left half.  
       - If larger, search right half.  
     - Repeat until found or pointers cross.  

2. **Call in `MainStudent`**  
   - After sorting NIMs, call:  
     - `findBinarySearch(searchNIM)` → Returns position.  
     - `showPosition()` → Displays where the NIM was found.  
     - `showData()` → Shows student details.  

3. **Run & Observe**  
   - **Correct Output**: Works only if NIMs are **pre-sorted**.  
   - **Efficiency**: Binary search is **much faster** for large datasets.  

## 7.2 Result

![Brr brr Patapim](Binary%201%20(2).png)
![Brr brr Patapim](Binary%201%20(1).png)

## 7.3 Question

### **Short & Simple Answers to 7.3 Questions**  

#### **1. Divide Process Code**  
The **divide** step splits the array into halves:  
```java
mid = (left + right) / 2;  // Find middle index
```  
- **Purpose**: Divides the search range into left/right subarrays.  

#### **2. Conquer Process Code**  
The **conquer** step compares and narrows the search:  
```java
if (cari == listStd[mid].nim) {          // Match found
    return mid;
} else if (listStd[mid].nim > cari) {    // Search left half
    return findBinarySearch(cari, left, mid - 1);
} else {                                 // Search right half
    return findBinarySearch(cari, mid + 1, right);
}
```  

#### **3. Binary Search Behavior**  
- **Unsorted NIMs**: ❌ **Incorrect results** (binary search requires sorted data).  
- **Descending Order NIMs**: ❌ Fails (current code assumes ascending order).  
  - **Fix**: Modify the `else if` condition to handle descending order:  
    ```java
    else if (listStd[mid].nim < Search) {  // For descending order
        return findBinarySearch(Search, left, mid - 1);
    }
    ```  

#### **4. Dynamic Student Amount**  
Modify `MainStudent` to accept user-defined size:  
```java
System.out.print("Enter number of students: ");
int amountStudent = s.nextInt();  // Replace fixed '5'
```  

## 7.4 Review Divide and Conquer
## 7.4.1. Steps

### **Brief Explanation** 

1. **Create `MergeSort` Class**  
   - A dedicated class to handle the merge sort algorithm.  

2. **`mergeSort()` Method**  
   - Takes an array as input to be sorted.  

3. **`merge()` Method**  
   - Combines two sorted subarrays into one sorted array (left + right → merged).  

4. **`sort()` Method**  
   - Recursively splits the array into halves (`divide` phase).  
   - Calls `merge()` to combine sorted halves (`conquer` phase).  

5. **`printArray()` Method**  
   - Displays the sorted array for verification.  

6. **Execution in `SortMain`**  
   - Prepare unsorted data.  
   - Call `mergeSort()` to sort it.  
   - Print results using `printArray()`.  

**Key Idea**:  
- **Divide**: Split array into single-element subarrays.  
- **Conquer**: Merge subarrays while sorting them.  
- **Efficiency**: Works in **O(n log n)** time for all cases.  

## 7.2 Result

![TUng tung Sahur](not%20the%20las%20one%20xc.png)

# Assignment

- **Key features of the implementation:**

    - `sequentialSearch()`

        - Searches by lecturer name (case-insensitive)

        - Displays all matching lecturers

        - Shows index position of each match

    - `binarySearch()`

        - First sorts the array by age (using bubble sort)

        - Finds all lecturers with matching age

        - Shows warning if multiple matches found

        - Implements proper binary search algorithm

    - `Helper Methods`

        - sortByAge(): Prepares data for binary search

        - printLecturerInfo(): Standardizes output format

    - The implementation follows all requirements:

        - Uses correct search algorithms

        - Handles multiple search results

    Maintains all existing functionality

    Provides clear warning messages when needed

### **Code**
#### Lecturer2
```java
package jobsheet7;

public class Lecturer2 {
    public String id;
    public String name;
    public boolean gender;
    public int age;

    public Lecturer2(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

```

#### LecturerData2
```java
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

```

#### LecturerDemo2
```java
package jobsheet7;

import java.util.Scanner;

public class LecturerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lecturers: ");
        int numLecturers = sc.nextInt();
        sc.nextLine();

        Lecturer2[] lecturers = new Lecturer2[numLecturers];

        for (int i = 0; i < numLecturers; i++) {
            System.out.println("\nEnter details for lecturer " + (i + 1));

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender (M/F): ");
            boolean gender = sc.nextLine().equalsIgnoreCase("M");

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            lecturers[i] = new Lecturer2(id, name, gender, age);
        }

        // Show all data

        LecturerData2.showAllLecturerData(lecturers);

        // Search by name
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();
        LecturerData2.sequentialSearch(lecturers, searchName);

        // Search by age
        System.out.print("\nEnter age to search: ");
        int searchAge = sc.nextInt();
        LecturerData2.binarySearch(lecturers, searchAge);

        // Other statistics
        LecturerData2.countLecturerByGender(lecturers);
        LecturerData2.averageLecturerAgeByGender(lecturers);
        LecturerData2.showOldestLecturerInfo(lecturers);
        LecturerData2.showYoungestLecturerInfo(lecturers);

        sc.close();
    }
}

```

## **Output**

![Tralarelo](last%20oneee%20%20(2).png)
![jashdaes](last%20oneee%20%20(1).png)