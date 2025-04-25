|            | Algorithm and Data Structure                 |
| ---------- | -------------------------------------------- |
| NIM        | 244107020223                                 |
| Nama       | Andhika Daffa Athaaillah                     |
| Kelas      | TI - 1I                                      |
| Repository | [link] (https://github) |

# Practical Session

# Labs 4 BRUTE FORCE AND DIVIDE CONQUER

## 5.2.1. Experiment Steps

### Brief Explanation
1. Start a new project called **"BruteForceDivideConquer"** and create a package named **"week5"**.
2. Inside the package, add a new class named **"Factorial"**.
3. In the **Factorial** class:
   - Implement a method called `factorialBF()` using a **loop-based Brute Force** approach.
   - Implement another method called `factorialDC()` using **recursion**, based on the **Divide and Conquer** technique.
4. Create another class named **"MainFactorial"**.
   - Inside this class, define the `main()` method.
   - Prompt the user to enter a number for factorial calculation.
   - Create an instance of the **Factorial** class and call both methods: `factorialBF()` and `factorialDC()`.
5. Make sure the program runs without any errors.


## 5.2.2. Verification of Experiment Results

![Screenshot of the program](5.2.2.%20Verification%20of%20Experiment%20Results.png)

## 5.2.3. Questions

1. In the base case of the Divide and Conquer algorithm for calculating factorial, explain the
differences in the code structure between the if and else conditions!
- Base Case Differences in Divide and Conquer
   - In the factorialDC method:
```java
if (n == 1) {          // Base case
    return 1;
} else {               // Recursive case
    int facto = n * factorialDC(n - 1);
    return facto;
}
```
   - The if condition handles the base case (n=1) and immediately returns 1 (stopping condition)
   - The else condition handles the recursive case, where:
      -  It makes the problem smaller (n-1)
      - Calls itself (factorialDC(n-1))
      - Combines results (n * result)
   -  Without this base case, the recursion would continue infinitely (stack overflow)

2. Is it possible to modify the loop in the factorialBF() method to use an alternative to the for
loop? Please explain and give example if needed!
- Yes, we can replace the for loop with a while loop:
      - Original:
      ```java
      for (int i = 1; i <= n; i++) {
      facto = facto * i;
      }
      ```

      - Modified with while loop:
      ```java
      int i = 1;
      while (i <= n) {
      facto = facto * i;
      i++;
      }
      ```

3. Please explain the differences between facto = facto*i; and int facto = n *
factorialDC(n-1); !
- facto = facto * i (Brute Force)
   - Iterative approach
   - Multiplies the running total (facto) by each integer sequentially
   - Maintains state through loop iterations
- int facto = n * factorialDC(n-1) (Divide and Conquer)
   - Recursive approach
   - Breaks problem into smaller subproblems (n * factorial of n-1)
   - Each recursive call returns its result to the previous caller
   - Uses the call stack to maintain state

4. Make a conclusion about the differences in how each method works. factorialBF() and
factorialDC()!

- Comparison of factorialBF() and factorialDC()

|Aspect |	factorialBF()(Brute Force)	| factorialDC()(Divide & Conquer) |
| ----- |------------------------------|---------------------------------|
|Approach|	Iterative (loops) |	Recursive (function calls itself) |
|Performance|	Generally faster (no call stack) |	Slower (stack overhead) |
|Memory|	Constant space (O(1)) |	Stack space (O(n)) |
|Readability|	Straightforward |	More elegant but harder to debug |
|Best For|	Small numbers |	Theoretical understanding |

- Conclusion:
   - Use factorialBF() for practical applications due to better performance
   - Use factorialDC() for learning recursion concepts, but watch for stack overflow with large n
   - Both produce identical mathematical results but with different computational approaches

- Example with n=4:
   - BF: 1×1 → 1×2 → 2×3 → 6×4 = 24
   - DC: 4×factorialDC(3) → 3×factorialDC(2) → 2×factorialDC(1) → 1 (then unwinds: 2×1=2 → 3×2=6 → 4×6=24)

## 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms
In this practical session, we will create a Java program to calculate the exponentiation of a
number using two different algorithms: Brute Force and Divide and Conquer. This session will utilize
an Array of Objects to manage multiple objects, unlike the previous session, which focused only on a
single factorial object.

## 5.3.1. Experiment Steps

### **Brief Explanation:**

1. Create a class named **"Power"** inside the **"week5"** package.
2. Define two attributes: **`baseNumber`** and **`exponent`**.
3. Add a constructor that accepts parameters to initialize these values.
4. In the **Power** class:
   - Implement the **`powerBF()`** method using a **loop-based Brute Force** approach.
   - Implement the **`powerDC()`** method using a **recursive Divide and Conquer** strategy.
5. Create another class called **"PowerMain"**:
   - Prompt the user to input how many base-exponent pairs they want to calculate.
   - Create an array of **Power** objects with the given inputs.
   - Use both **`powerBF()`** and **`powerDC()`** methods to compute the results.
6. Ensure that the output is correct and matches the expected results.

> The implementation is contained in **Power.java** and **PowerMain.java**. A screenshot of the output is provided below.

## 5.3.2. Verification of Experiment Results

![Screenshot of the program](Power%20Result.png)

## 5.3.3. Questions  

1. Explain the differences between the two methods created powerBF() dan powerDC()!
- Difference Between powerBF() and powerDC()
```java
// Brute Force (simple loop)
int powerBF(int n, int e) {
    int result = 1;
    for (int i = 0; i < e; i++) {
        result *= n;
    }
    return result;
}

// Divide & Conquer (recursive)
int powerDC(int n, int e) {
    if (e == 1) return n;
    int half = powerDC(n, e/2);
    return (e%2 == 1) ? half*half*n : half*half;
}
```

- powerBF: Simple loop, does e multiplications
- powerDC: Splits problem in half each time, faster for big numbers

2. Does the combine stage exist in the provided code? Show the relevant part!
```java
return (e%2 == 1) ? half*half*n : half*half;
```
- Combines two half-results into full answer
- Extra multiply by n if exponent is odd

3. In the powerBF() method, parameters are used to pass the base number and its exponent, even
though the Power class already contains attributes for these values (baseNumber and exponent
atribute). Do you think it is still relevant for the method to have parameters? Could the method
be implemented without parameters instead? If so, how would the powerBF() method be
structured without parameters?
```java
int powerBF() {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= baseNumber;
    }
    return result;
}
```
But keeping parameters is better - more flexible.

4. Summarize how the powerBF() and powerDC() methods work!

- powerBF():
   - Like manual multiplication: 3^4 = 3×3×3×3
   - Does all multiplications one after another
- powerDC():
   - Smart math: 3^4 = (3²)×(3²)
   - Breaks problem into smaller parts
   Faster for very big exponents

## 5.4 Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms
In this experiment, we will practice how the divide, conquer, and combine processes are applied
in a case study of calculating a company's profit over several months.

## 5.4.1. Experiment Steps

### **Brief Explanation:**

1. Create a new class called **"Sum"** in the **"week5"** package.
2. Add a constructor that takes an array of profits as a parameter to initialize the data.
3. Inside the **Sum** class:
   - Implement the **`totalBF()`** method using a **Brute Force** approach with an **iterative loop** to calculate the total.
   - Implement the **`totalDC()`** method using a **Divide and Conquer** approach with **recursion**.
4. Create another class named **"SumMain"**:
   - Prompt the user to enter the number of months to calculate the total profit.
   - Create a **Sum** object and fill the array with profit values.
   - Use both **`totalBF()`** and **`totalDC()`** methods to compute the total.
5. Confirm that the output is accurate and matches what is expected.

## 5.4.2. Verification of Experiment Results

![Screenshot of the program](Sum%20Ver.png)

## 5.4.3. Questions

1. Why is mid variable needed in totalDC()method?

- The mid variable splits the array into two equal parts for divide-and-conquer:
```java
int mid = (l + r) / 2;  // Finds middle index
```
- Divides the problem into smaller subproblems (left and right halves).

2. Explain the following statements in totalDC()method?
```java
double lsum = totalDC(arr, l, mid);      // Sum of left half
double rsum = totalDC(arr, mid + 1, r);  // Sum of right half
```
- lsum: Recursively sums elements from index l to mid.
- rsum: Recursively sums elements from mid+1 to r.

3. Why is it necessary to sum the results of lsum and rsum as shown below??

- Adds the sums of both halves to get the total sum of the entire range.

4. What is the base case of totalDC()method?
```java
if (l == r) {
    return arr[l];  // Single element = sum is itself
}
```
- When the subarray has only one element, return that element (no further division needed).

5. Draw a conclusion about how totalDC() works!
- **How totalDC() Works - Conclusion**
   - Divide: Splits the array into left/right halves using mid.

   - Conquer: Recursively sums each half.

   - Combine: Adds the results (lsum + rsum).

- Breaks the problem into smaller parts, solves each, and combines results.
- Faster than brute force for large arrays (O(n log n) vs O(n)).

## 5.5. Assignments
- **Code of the assignment**
- StudentGradeAnalyzer
```java
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

```

- StudentGradeMain
```java
package jobsheet5;

public class StudentGradeMain {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ahmad", "220101001", 2022, 78, 82),
                new Student("Budi", "220101002", 2022, 85, 88),
                new Student("Cindy", "220101003", 2021, 90, 87),
                new Student("Dian", "220101004", 2021, 76, 79),
                new Student("Eko", "220101005", 2023, 92, 95),
                new Student("Fajar", "220101006", 2020, 88, 85),
                new Student("Gina", "220101007", 2023, 80, 83),
                new Student("Hadi", "220101008", 2020, 82, 84)
        };

        double[] midtermScores = new double[students.length];
        double[] finalScores = new double[students.length];

        for (int i = 0; i < students.length; i++) {
            midtermScores[i] = students[i].midtermScore;
            finalScores[i] = students[i].finalScore;
        }

        double highestMidterm = StudentGradeAnalyzer.findMaxDC(midtermScores, 0, midtermScores.length - 1);
        double lowestMidterm = StudentGradeAnalyzer.findMinDC(midtermScores, 0, midtermScores.length - 1);
        double averageFinal = StudentGradeAnalyzer.calculateAverageBF(finalScores);

        System.out.println("Highest Midterm Score: " + highestMidterm);
        System.out.println("Lowest Midterm Score: " + lowestMidterm);
        System.out.println("Average Final Score: " + averageFinal);
    }
}

class Student {
    String name;
    String studentId;
    int admissionYear;
    double midtermScore;
    double finalScore;

    public Student(String name, String studentId, int admissionYear, double midtermScore, double finalScore) {
        this.name = name;
        this.studentId = studentId;
        this.admissionYear = admissionYear;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
}

```

- **Output**

![Screenshot of the program](Last%20output.png)